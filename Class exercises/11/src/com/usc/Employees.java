package com.usc;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

public class Employees {

    public Employees() throws Exception {
        JSONObject jsObject1 = new JSONObject();
        jsObject1.put("name","milad");
        jsObject1.put("family","movassagh");
        JSONObject jsObject2 = new JSONObject();
        jsObject2.put("name","ali");
        jsObject2.put("family","bahrami");
        JSONObject jsObject3 = new JSONObject();
        jsObject3.put("name","reza");
        jsObject3.put("family","karimi");
        JSONArray jsonArray = new JSONArray();
        jsonArray.put(jsObject1);
        jsonArray.put(jsObject2);
        jsonArray.put(jsObject3);
    }
}