package com.example.newfinal;

import android.media.Image;

import androidx.annotation.NonNull;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
    public static String menulist[]= {"meat","pizza","ramen","rice","sushi","hamburger"};

    public static ArrayList<String> menu= new ArrayList<String>(Arrays.asList("meat","pizza","ramen","rice","sushi","hamburger"));
    public static ArrayList<Integer> myList = new ArrayList<Integer>(Arrays.asList(R.drawable.meat,R.drawable.pizza,R.drawable.ramen,R.drawable.rice,R.drawable.sushi,R.drawable.hamburger));
    public static int[] imgs ={R.drawable.meat, R.drawable.pizza,R.drawable.ramen,R.drawable.rice,R.drawable.sushi,R.drawable.hamburger};
    public static boolean[] checkedItems = {true,true,true,true,true,true};
}