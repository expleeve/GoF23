package gof.creation.factory.factoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		URL baidu = new URL("http://www.baidu.com");
		URLConnection urlConnection = baidu.openConnection();
		InputStream is = urlConnection.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		String inputLine;
		while((inputLine = reader.readLine()) != null){
			System.out.println(inputLine);
		}
		reader.close();
	}

}
