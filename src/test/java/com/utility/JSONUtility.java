package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.constants.MyEnvironment;
import com.google.gson.Gson;
import com.ui.pojo.Environment;
import com.ui.pojo.config;

public class JSONUtility {
	
	
	    public static Environment readJSON(MyEnvironment env)  {
	
				Gson gson=new Gson();
				File jsonfile=new File(System.getProperty("user.dir")+"\\config\\config.json");
				FileReader fileReader = null;
					try {
						fileReader = new FileReader(jsonfile);
					} 
					catch (FileNotFoundException e) {
					e.printStackTrace();
				    }
				config config = gson.fromJson(fileReader, config.class);
				Environment environment = config.getEnvironments().get(env.toString());
				return environment;
	}

}
