package com.learn.example.gateway;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by zjj on 2018/12/3 0003.
 */
@ConfigurationProperties
class UriConfiguration {

    private String httpbin = "http://httpbin.org:80";

    public String getHttpbin() {
        return httpbin;
    }

    public void setHttpbin(String httpbin) {
        this.httpbin = httpbin;
    }
}
