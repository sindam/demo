package com.sowmith.demo.repository;

import com.sowmith.demo.UrlDetails;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserRepository {

    private Map<Long, List<UrlDetails>> userWiseUrlsMap = new HashMap<>();

    public List<UrlDetails> getUserUrls(Long userId){
        return userWiseUrlsMap.get(userId);
    }

    public List<UrlDetails> getUserActiveUrls(Long userId){
          return null;
    }

    /*
    can be used for deletion cron
     */
    public List<UrlDetails> getUserInActiveUrls(Long userId){
        Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
        return userWiseUrlsMap.get(userId)
                .stream()
                .collect(Collectors.toList());
    }

    public void removeUrls(Long userId,List<Long> urlIds){

    }


}
