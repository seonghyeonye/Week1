package com.example.newfinal;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class data {

    public static String str = "[{'name':'NAME','number':'NUMBER'}," + "{'name':'mom','number':'010-2322-2321'}," + "{'name':'dad','number':'010-1111-2222'}," + "{'name':'kim','number':'010-1111-2222'}," + "{'name':'lee','number':'010-1234-5678'}]";

    public static JSONArray newJSON= makedata();
    public static  JSONArray makedata() {
        try {
            newJSON = new JSONArray(str);
            System.out.println(newJSON);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return newJSON;
    }
}