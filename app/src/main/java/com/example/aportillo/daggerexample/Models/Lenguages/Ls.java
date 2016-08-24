package com.example.aportillo.daggerexample.Models.Lenguages;

import com.google.gson.annotations.SerializedName;

/**
 * Created by aportillo on 24/08/2016.
 */
public class Ls {

    @SerializedName("iso")
    String iso;

    @SerializedName("lang")
    String lang;

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}



