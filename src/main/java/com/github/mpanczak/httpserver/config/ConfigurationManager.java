package com.github.mpanczak.httpserver.config;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.mpanczak.httpserver.util.Json;

import java.io.FileReader;
import java.io.IOException;

public class ConfigurationManager {
    public static ConfigurationManager myConfigurationManager;
    public static Configuration myCurrentConfiguration;

    public ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        if (myConfigurationManager == null)
            myConfigurationManager = new ConfigurationManager();
        return myConfigurationManager;
    }

    /**
     *
     * Used to load a configuration file by the path provided
     */
    public void loadConfigurationFile(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        StringBuffer sb = new StringBuffer();
        int i;
        while ((i = fileReader.read()) != -1) {
            sb.append((char) i);
        }
        JsonNode conf = Json.parse(sb.toString());
        myCurrentConfiguration = Json.fromJson(conf, Configuration.class);
    }

    /**
     * Returns the Current loaded Configuration
     */
    public Configuration getCurrentConfiguration(){
        if (myCurrentConfiguration == null) {
            throw new HttpConfigurationException("No Current Configuration Set.");
        }
        return myCurrentConfiguration;
    }
}
