package com.usc;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/save")
public class Employees {
    @Path("/employee")
    @GET
    @Produces("text/plain")
    public String employee() throws JSONException {
        System.out.println("save executed in server");
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("name","milad");
        jsonObject1.put("family","movassagh");

        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("name","ali");
        jsonObject2.put("family","bahrami");

        JSONObject jsonObject3 = new JSONObject();
        jsonObject3.put("name","reza");
        jsonObject3.put("family","karimi");

        JSONObject jsonObject4 = new JSONObject();
        jsonObject4.put("name","behnam");
        jsonObject4.put("family","baghi");

        JSONObject jsonObject5 = new JSONObject();
        jsonObject5.put("name","saeed");
        jsonObject5.put("family","saadati");

        JSONArray jsonArray = new JSONArray();
        jsonArray.put(jsonObject1);
        jsonArray.put(jsonObject2);
        jsonArray.put(jsonObject3);
        jsonArray.put(jsonObject4);
        jsonArray.put(jsonObject5);

        return jsonArray.toString();
    }
}