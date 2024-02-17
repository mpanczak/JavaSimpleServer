package com.github.mpanczak.httpserver;

import com.github.mpanczak.httpserver.config.Configuration;
import com.github.mpanczak.httpserver.config.ConfigurationManager;

/**
 * Driver Class for the Http Server
 *
 */
public class HttpServer
{
    public static void main( String[] args )
    {
        System.out.println( "Server starting..." );

        ConfigurationManager.getInstance().loadConfigurationFile("src/main/resources/http.json");

        Configuration conf = ConfigurationManager.getInstance().getCurrentConfiguration();

        System.out.println("Using Port: " + conf.getPort());
        System.out.println("Using WebRoot: " + conf.getWebroot());
    }
}
