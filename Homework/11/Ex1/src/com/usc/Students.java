package com.usc;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/save")
public class Students {
    @Path("/students")
    @GET
    @Produces("text/plain")
    public String students() throws JSONException {
        System.out.println("save executed in server");
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("name","milad");
        jsonObject1.put("family","movassagh");
        jsonObject1.put("grade","19");

        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("name","reza");
        jsonObject2.put("family","askari");
        jsonObject2.put("grade","15.5");

        JSONObject jsonObject3 = new JSONObject();
        jsonObject3.put("name","ali");
        jsonObject3.put("family","bahrami");
        jsonObject3.put("grade","17");

        JSONObject jsonObject4 = new JSONObject();
        jsonObject4.put("name","saeed");
        jsonObject4.put("family","saadati");
        jsonObject4.put("grade","16.5");

        JSONObject jsonObject5 = new JSONObject();
        jsonObject5.put("name","amin");
        jsonObject5.put("family","rigi");
        jsonObject5.put("grade","12.5");

        JSONArray jsonArray = new JSONArray();
        jsonArray.put(jsonObject1);
        jsonArray.put(jsonObject2);
        jsonArray.put(jsonObject3);
        jsonArray.put(jsonObject4);
        jsonArray.put(jsonObject5);

        return jsonArray.toString();
    }
}
