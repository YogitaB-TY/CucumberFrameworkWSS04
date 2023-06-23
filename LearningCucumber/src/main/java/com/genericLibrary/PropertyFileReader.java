package com.genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
	
	public String readPropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/config.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		return prop.getProperty(key);
		
	}

}
