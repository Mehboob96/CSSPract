import java.io.*;
import java.math.*;
import java.security.*;


public class Md5 {

	public static String getMdD5(String input){
		try{
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] messageDigest = md.digest(input.getBytes());
			System.out.println("");
			
			BigInteger number = new BigInteger(1,messageDigest);
			System.out.println("number: " +number);
			
			String hashtext=number.toString(16);
			
			while(hashtext.length() < 32){
				hashtext="0"+hashtext;
			}
			return hashtext;
		}
		catch(NoSuchAlgorithmException e){
			throw new RuntimeException(e);
		}
	}
	
	
	public static void main(String[] args) throws {
		// TODO Auto-generated method stub
		
		
		

	}

}
