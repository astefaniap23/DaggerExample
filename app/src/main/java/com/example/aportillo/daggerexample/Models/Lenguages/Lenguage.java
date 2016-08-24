package com.example.aportillo.daggerexample.Models.Lenguages;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by aportillo on 18/08/2016.
 */
public class Lenguage {

    @SerializedName("ls")
    private ArrayList<Ls> ls;
   /* @SerializedName("message")
    private String message;
    @SerializedName("response_code")
    private int responseCode;*/

    public Lenguage(/*String message, int responseCode,*/ ArrayList ls){

        this.ls = ls;
     /*  this.message = message;
        this.responseCode = responseCode;*/
    }

    public ArrayList<Ls> getLs() {
        return ls;
    }

    public void setLs(ArrayList<Ls>  ls) {
        this.ls = ls;
    }

  /*  public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }*/
}
