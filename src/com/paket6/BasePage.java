package com.paket6;

public class BasePage {

    private String URL;

    public BasePage(String url)
    {
        this.URL = url;
    }
}


/*
CLASS1
com.paket6.BasePage => URL www.google.com
com.paket6.BasePage page = new com.paket6.BasePage("www.google.com");


CLASS2
com.paket6.BasePage => URL www.yahoo.com
new com.paket6.BasePage("www.yahoo.com")

CLASS3
com.paket6.BasePage => URL www.yandex.com
new com.paket6.BasePage("www.yandex.com")
 */