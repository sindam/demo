package com.sowmith.demo.repository;

import com.sowmith.demo.UrlDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UrlRepository {

    private List<UrlDetails> urlDetailsList = new ArrayList<>();
    //short -> original
    private Map<String,String> urlsMap = new HashMap<>();

    public String getMainUrl(String url){
        return urlsMap.get(url);
    }

    public void addUrlDetails(UrlDetails urlDetails) {
        urlDetailsList.add(urlDetails);
        urlsMap.put(urlDetails.getShortenedUrl(),urlDetails.getUrl());
    }

    public boolean checkUrlExists(String url){
        return urlsMap.containsKey(url);
    }


}
