package com.split.Infra;

import org.apache.http.HttpResponse;

import java.io.IOException;

public class BusinessAPI {

    private RequestHandler requestHandler;


    public BusinessAPI(){

        requestHandler = new RequestHandler();
    }

    public RequestHandler getRequestHandler() {
        return requestHandler;
    }

    public HttpResponse CreateNewPayment(Requestable requestable) throws IOException {

        return this.getRequestHandler().SendPostRequest("Login",requestable);
    }

    public  HttpResponse CreateInStoreOrder(Requestable requestable)throws IOException{

        return this.getRequestHandler().SendPostRequest("InstallmentPlan/Initiate",requestable);
    }
}
