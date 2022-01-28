package com.example.scheduleddemo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("my-properties")
public class MyProperties {
	/* 
	 * My Hostname
	 */
	@NotBlank
	private String host;
	
	@Min(1000)
	private int port;
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host
				;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	@Override
	public String toString() {
		return "MyProperties [host=" + host + ", port=" + port + "]";
	}
	
	
}
