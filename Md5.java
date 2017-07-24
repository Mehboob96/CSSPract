import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MD5
{
	public static String getMD5(String input)
	{
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] MessageDigest = md.digest(input.getBytes());
			System.out.println("Byte Representation" +MessageDigest);
			
			BigInteger number = new BigInteger(1, MessageDigest);
			System.out.println("number" +number);
			String hashtext = number.toString(16);
			
			while (hashtext.length() < 32) {
			hashtext = "0" + hashtext;
		}
		return hashtext;
	}
	catch (NoSuchAlgorithmException e) {
		throw new RuntimeException(e);
	}
}


public static void main(String[] args) throws
NoSuchAlgorithmException, IOException {
	
	System.out.println("Enter the string");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String text1 = br.readLine();
	System.out.println("Hash Value: "+getMD5("text1"));
}
}