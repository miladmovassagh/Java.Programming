package com.usc;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/save")
public class Students {
    @Path("/stu")
    @GET
    @Produces("text/plain")
    public String stu()
    {
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
        jsonArray.add(jsonObject1);
        jsonArray.add(jsonObject2);
        jsonArray.add(jsonObject3);
        jsonArray.add(jsonObject4);
        jsonArray.add(jsonObject5);

        return jsonArray.toJSONString();
    }
}