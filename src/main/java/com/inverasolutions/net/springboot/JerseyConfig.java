package com.inverasolutions.net.springboot;


import org.glassfish.jersey.server.ResourceConfig;

public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("com.inverasolutions.net.springboot");
    }
}