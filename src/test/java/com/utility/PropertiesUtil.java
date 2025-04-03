package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import com.constants.MyEnvironment;

public class PropertiesUtil {

	public static String readProperty(MyEnvironment env,String propertyName)  {

		File propFile=new File(System.getProperty("user.dir")+"\\config\\"+env+".properties");
		Properties properties=new Properties();
		FileReader fileReader=null;
		try {
			fileReader = new FileReader(propFile);
			properties.load(fileReader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(propertyName.toUpperCase());

	}

}
