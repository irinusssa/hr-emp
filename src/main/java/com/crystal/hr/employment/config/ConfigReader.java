package com.crystal.hr.employment.config;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class ConfigReader {

	public List<String> readProperty(String key) {
		List<String> values = null;
		try {
			PropertiesConfiguration pc = new PropertiesConfiguration(
					"template.properties");
			Iterator<String> iterator = pc.getKeys();
			String value = null;
			while (iterator.hasNext()) {
				value = pc.getString(key);
				if (values == null) {
					values = new ArrayList<String>();
				}
				values.add(value);
			}
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return values == null ? new ArrayList<String>(0) : values;
	}

}
