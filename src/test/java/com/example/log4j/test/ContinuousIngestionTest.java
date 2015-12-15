package com.example.log4j.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import com.example.log4j.Producer;

public class ContinuousIngestionTest {
    private Producer logEntryProducer;

    @Before
    public void setUp() {
        logEntryProducer = new Producer();
    }

    @Test
    public void createSimpleLogEntry() {
    	logEntryProducer.makeErrorLogEntry(generateErrorDataMap());
    	
    	while(true)
    		logEntryProducer.makeInfoLogEntry(generateDataMap());
    }

    private Map<String, ?> generateDataMap() {
    	Random randomGenerator  = new Random();
        Map<String, Object> map = new HashMap<>();
        map.put("rnumber", randomGenerator.nextInt(100));
        return map;
    }

    private Map<String, ?> generateErrorDataMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("fname", "Rishi");
        map.put("lname", "Singhal");
        map.put("age", "32");
        map.put("city", "Bangalore");
        map.put("Country", "India");        
        return map;
    }
}
