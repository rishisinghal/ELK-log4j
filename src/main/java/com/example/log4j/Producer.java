package com.example.log4j;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class Producer {
    private static final Logger LOG = LoggerFactory.getLogger("logstash-socket");

    public void makeInfoLogEntry(Map<String, ?> input) {
        JSONObject json = new JSONObject(input);
        LOG.info(json.toJSONString());
    }
    
    public void makeErrorLogEntry(Map<String, ?> input) {
        JSONObject json = new JSONObject(input);
        LOG.error(json.toJSONString());
    }
}
