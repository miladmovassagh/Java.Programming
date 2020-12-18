package com.usc;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/save")
public class Universities {
    @Path("/uni")
    @GET
    @Produces("text/plain")
    public String uni()
    {
        System.out.println("save executed in server");
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("name","sharif");
        jsonObject1.put("city","tehran");

        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("name","tehran");
        jsonObject2.put("city","tehran");

        JSONObject jsonObject3 = new JSONObject();
        jsonObject3.put("name","ferdowsi");
        jsonObject3.put("city","mashhad");

        JSONObject jsonObject4 = new JSONObject();
        jsonObject4.put("name","kharazmi");
        jsonObject4.put("city","karaj");

        JSONObject jsonObject5 = new JSONObject();
        jsonObject5.put("name","amirkabir");
        jsonObject5.put("city","tehran");

        JSONArray jsonArray = new JSONArray();
        jsonArray.add(jsonObject1);
        jsonArray.add(jsonObject2);
        jsonArray.add(jsonObject3);
        jsonArray.add(jsonObject4);
        jsonArray.add(jsonObject5);

        return jsonArray.toJSONString();
    }
}