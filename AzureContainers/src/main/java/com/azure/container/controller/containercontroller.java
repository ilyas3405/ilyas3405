package com.azure.container.controller;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.blob.models.BlobItem;
import com.ctc.wstx.shaded.msv.relaxng_datatype.DatatypeStreamingValidator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/blob")
public class containercontroller {

	String connectStr = "DefaultEndpointsProtocol=https;AccountName=teststorage82620;AccountKey=bnGvW9lzpPPm4V4ikaxF9OtxIPhyz2LfvTcXlBq2t3HUrJQ8H0uMqOSDmM4oB5yggGR1Pyawqg3Dgv5QVcj9kg==;EndpointSuffix=core.windows.net";

	@RequestMapping(path = "/getrootfolders", method = RequestMethod.GET)
	public String getRootFolders() throws Exception {

		ObjectMapper mapper = new ObjectMapper();

		List<String> rootfolderList = new ArrayList<String>();

		BlobServiceClient blobServiceClient = new BlobServiceClientBuilder().connectionString(connectStr).buildClient();

		// name for the container on azure cloud
		String containerName = "backup";

		BlobContainerClient containerClient = blobServiceClient.getBlobContainerClient(containerName);
		System.out.println("\nListing blobs...");

		// List the blob(s) in the container.
		for (BlobItem blobItem : containerClient.listBlobs()) {
			System.out.println(blobItem.getName());
			if (rootfolderList.contains(blobItem.getName().substring(0, blobItem.getName().indexOf("/"))) == false) {
				boolean bsuccess;
				bsuccess = rootfolderList.add(blobItem.getName().substring(0, blobItem.getName().indexOf("/")));
			}
		}
		String jasonString = mapper.writeValueAsString(rootfolderList);
		return jasonString;
	}

	@RequestMapping(path = "/getsubfolders/{rootfoldername}", method = RequestMethod.GET)
	public String getSubFolders(@PathVariable("rootfoldername") String rootfoldername) throws JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();
		List<String> subfolderList = new ArrayList<String>();

		BlobServiceClient blobServiceClient = new BlobServiceClientBuilder().connectionString(connectStr).buildClient();

		// name for the container on azure cloud
		String containerName = "backup";

		BlobContainerClient containerClient = blobServiceClient.getBlobContainerClient(containerName);

		Integer rootfolderlength = 0;
		rootfolderlength = rootfoldername.length();

		for (BlobItem blobItem : containerClient.listBlobs()) {
			if (blobItem.getName().substring(0, rootfolderlength + 1).equals(rootfoldername + "/")) {
				boolean bsuccess;
				bsuccess = subfolderList
						.add(blobItem.getName().substring(0, blobItem.getName().indexOf("/", rootfolderlength + 1)));
			}
		}

		System.out.println(rootfoldername);

		String jasonString = mapper.writeValueAsString(subfolderList);
		return jasonString;
	}

	@RequestMapping(path = "/getfiles/{rootfoldername}/{subfoldername}", method = RequestMethod.GET)
	public String getFiles(@PathVariable("rootfoldername") String rootfoldername,
			@PathVariable("subfoldername") String subfoldername) throws JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();
		List<String> filelist = new ArrayList<String>();

		BlobServiceClient blobServiceClient = new BlobServiceClientBuilder().connectionString(connectStr).buildClient();

		// name for the container on azure cloud
		String containerName = "backup";

		BlobContainerClient containerClient = blobServiceClient.getBlobContainerClient(containerName);

		Integer folderlength, bloblength = 0;

		folderlength = rootfoldername.length() + subfoldername.length();

		for (BlobItem blobItem : containerClient.listBlobs()) {
			String folder1, folder2, blobstring = "";

			blobstring = blobItem.getName();
			bloblength = blobstring.length();
			if (bloblength > folderlength) {
				folder1 = blobstring.substring(0, folderlength );
				folder2 = rootfoldername + "/" + subfoldername + "/";
				if (folder1.equals(folder2)) {
					boolean bsuccess;
					bsuccess = filelist.add(
							blobItem.getName().substring(folderlength, bloblength - folderlength));
				}
			}
		}

		String jasonString = mapper.writeValueAsString(filelist);
		return jasonString;

	}

	@RequestMapping(path = "/getfilecontent/{rootfoldername}/{subfoldername}/{blobname}", method = RequestMethod.GET)
	public String getFileContent(@PathVariable("rootfoldername") String rootfoldername,
			@PathVariable("subfoldername") String subfoldername, @PathVariable("blobname") String blobname) {

		String blobcontents = "";

		BlobServiceClient blobServiceClient = new BlobServiceClientBuilder().connectionString(connectStr).buildClient();

		// name for the container on azure cloud
		String containerName = "backup";

		BlobContainerClient containerClient = blobServiceClient.getBlobContainerClient(containerName);
		BlobClient blobClient = containerClient.getBlobClient(blobname);

		OutputStream stream1 = null;

		blobClient.download(stream1);

		blobcontents = stream1.toString();

		return blobcontents;
	}

}
