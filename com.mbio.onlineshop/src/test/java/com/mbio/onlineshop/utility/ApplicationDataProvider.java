package com.mbio.onlineshop.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;



public class ApplicationDataProvider {
	
	Properties prop;
	
	public ApplicationDataProvider() {
		File src=new File("./Config/application.properties");

		try {
			FileInputStream file = new FileInputStream(src);
			prop=new Properties();
			prop.load(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getDataFromConfig(String key) {
		return prop.getProperty(key);
		
	}
	
}
