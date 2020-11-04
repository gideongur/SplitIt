package com.split.Infra;

import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class RequestHandler {

    private CloseableHttpClient httpClient;
    private HttpPost postRequest;
    private Gson gson;

    public RequestHandler(){
        httpClient =  HttpClients.createDefault();
        gson = new Gson();
    }

    public Gson getGson() {
        return gson;
    }
    public HttpPost getPostRequest() {
        return postRequest;
    }

    public void setPostRequest(HttpPost postRequest) {
        this.postRequest = postRequest;
    }

    public HttpResponse SendPostRequest(String uri,Requestable requestable) throws IOException {
        this.setPostRequest(new HttpPost("https://webapi.sandbox.splitit.com/api/"+uri));
        this.getPostRequest().addHeader("content-type", "application/json;charset=UTF-8");
        this.getPostRequest().setEntity(new StringEntity(this.getGson().toJson(requestable)));
        HttpResponse result =Request(this.getPostRequest());
        return result;
    }

    private HttpResponse Request(HttpUriRequest request) throws IOException {

        return httpClient.execute(request);
    }
}