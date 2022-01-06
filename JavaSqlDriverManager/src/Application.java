
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

 

public class Application {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub

		Connection dbConnection = null;
		String url = "jdbc:oracle:thin:@//SERVERNAME.twcable.com:1521/smrui01d_svc.corp.DOMAIN.com";
		String user = "SCOTT";
		String password = "TIGER";
	 
	 	Class.forName("oracle.jdbc.OracleDriver");
		//Using the Drivermanager to connect. No Spring, or JPA and Spring Data JPA, etc !!
		dbConnection = DriverManager.getConnection(url, user, password);
		
		PreparedStatement stat = null;
		String sql = "SELECT ASN.ASN_DOCUMENT_ID, ASN.STORE_NO , ITM.CARTON_ID, ITM.ITEM_ID, ITM.UNIT_COUNT, SER.SERIAL_NUMBER FROM ASN_REQUEST_STATUS ASN, TRANSACTION_LINEITM_INFO ITM, TRANSACTION_LINE_SERIAL_INFO SER  WHERE ASN.ASN_DOCUMENT_ID = ITM.TRANSACTION_ID AND ITM.TRANSACTION_ID = SER.TRANSACTION_ID (+) AND ITM.ITEM_ID = SER.ITEM_ID(+) AND WORKLISTED = 'Y'\r\n" + 
				"and ASN.ASN_DOCUMENT_ID='7124_DEV_0203202'";
		
		stat = dbConnection.prepareStatement(sql);

		ResultSet rs = stat.executeQuery();


		while (rs.next()) {
			// Retrieve by column name

			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
		}

	}	
	
}