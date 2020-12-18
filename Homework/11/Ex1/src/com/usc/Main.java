package com.usc;

import org.codehaus.jettison.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        try {
            JSONObject jsObject1 = new JSONObject();
            jsObject1.put("name","milad");
            jsObject1.put("family","movassagh");
            jsObject1.put("grade","19");
            JSONObject jsObject2 = new JSONObject();
            jsObject2.put("name","reza");
            jsObject2.put("family","askari");
            jsObject2.put("grade","15.5");
            JSONObject jsObject3 = new JSONObject();
            jsObject3.put("name","ali");
            jsObject3.put("family","bahrami");
            jsObject3.put("grade","17");
            JSONObject jsObject4 = new JSONObject();
            jsObject4.put("name","saeed");
            jsObject4.put("family","saadati");
            jsObject4.put("grade","16.5");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
