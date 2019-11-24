package com.mbio.onlineshop.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ConfigDataProvider {
	
	Properties prop;
	
	public ConfigDataProvider() {
		File src=new File("./Config/Config.properties");

		try {
			FileInputStream file = new FileInputStream(src);
			prop=new Properties();
			prop.load(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getBrowser() {
		return prop.getProperty("Browser");
		
	}
	
	public String getTestURL() {
		return prop.getProperty("TestURL");
		
	}

	public int getWaitSeconds() {
		return Integer.parseInt(prop.getProperty("WaitSeconds"));
		
	}
	
	public String getReportPath() {
		return prop.getProperty("ReportPath");
		
	}
	
	public String getReportResultPath() {
		return prop.getProperty("ReportResultPath");
		
	}
}
