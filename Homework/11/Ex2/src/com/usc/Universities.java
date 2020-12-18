package com.usc;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

public class Universities {

    public Universities() throws Exception {
        JSONObject jsObject1 = new JSONObject();
        jsObject1.put("name","amirkabir");
        jsObject1.put("city","tehran");
        JSONObject jsObject2 = new JSONObject();
        jsObject2.put("name","ferdowsi");
        jsObject2.put("city","mashhad");
        JSONObject jsObject3 = new JSONObject();
        jsObject3.put("name","sharif");
        jsObject3.put("city","tehran");
        JSONObject jsObject4 = new JSONObject();
        jsObject4.put("name","kharazmi");
        jsObject4.put("city","karaj");
        JSONObject jsObject5 = new JSONObject();
        jsObject5.put("name","khaje nasir");
        jsObject5.put("city","tehran");
        JSONArray jsonArray = new JSONArray();
        jsonArray.put(jsObject1);
        jsonArray.put(jsObject2);
        jsonArray.put(jsObject3);
        jsonArray.put(jsObject4);
        jsonArray.put(jsObject5);
    }
}
