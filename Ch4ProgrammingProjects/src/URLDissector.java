/*
 * URLDissector.java
 * Listing 4.9 from Lewis text
 * Jason Melnik
 * CSC 120
 * 10/8/18
 */
import java.util.Scanner;
import java.io.*;
public class URLDissector {
	public static void main(String [] args) throws IOException{
		String url;
		Scanner fileScan, urlScan;
		
		fileScan = new Scanner(new File("src\\website.inp"));
		
		while(fileScan.hasNext()) {
			url = fileScan.nextLine();
			System.out.println("URL: " + url);
			
		urlScan = new Scanner(url);
		urlScan.useDelimiter("/");
		while(urlScan.hasNext())
			System.out.println(" " + urlScan.next());
		System.out.println();
		}
	}
}
