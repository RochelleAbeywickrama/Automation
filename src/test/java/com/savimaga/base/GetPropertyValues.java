package com.savimaga.base;

import java.util.Properties;
import java.util.TreeMap;

public class GetPropertyValues {

	public TreeMap<String, String> resourceData = new TreeMap<String, String>();

	   public TreeMap<String, String> getResourceData(String path) throws Exception {
	       Properties propData = new Properties();
	       propData.load(this.getClass().getResourceAsStream(path));
	       for (String key : propData.stringPropertyNames()) {
	           String value = propData.getProperty(key);
	           resourceData.put(key, value);
	       }
	       return resourceData;
	   }
	
}
