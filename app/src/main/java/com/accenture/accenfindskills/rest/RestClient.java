package com.accenture.accenfindskills.rest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.net.UnknownHostException;

import android.content.Context;
import android.os.AsyncTask;
import android.preference.PreferenceActivity;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

import com.accenture.accenfindskills.utils.HttpUtils;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class RestClient extends MultiDexApplication {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    public String getSkills(){
        String sResult = "";
        try{
            RequestParams rp = new RequestParams();
            rp.add("username", "aaa"); rp.add("password", "aaa@123");

            HttpUtils.post("getSkills", rp, new JsonHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                    // If the response is JSONObject instead of expected JSONArray
                    System.out.println("---------------- this is response : " + response);
                    try {
                        JSONObject serverResp = new JSONObject(response.toString());
                    } catch (JSONException e) {

                        e.printStackTrace();
                    }
                }
                @Override
                public void onSuccess(int statusCode, Header[] headers, JSONArray timeline) {
                    // Pull out the first event on the public timeline

                }
            });
            System.out.println("sResult: "+sResult);
        } catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return sResult;
    }

}
