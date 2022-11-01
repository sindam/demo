package com.sowmith.demo.service;

import com.sowmith.demo.repository.UrlRepository;
import com.sowmith.demo.repository.UserRepository;

import java.util.Random;

import static com.sowmith.demo.ApplicationConstants.BASE_URL;

public class UrlRegistrationService {

    UserRepository userRepository;
    UrlRepository urlRepository;
    UrlRegistrationService(UserRepository userRepository, UrlRepository urlRepository){
        this.urlRepository = urlRepository;
    }

    public String registerUrl(Long userId, String originalUrl, Long expiration){

//        urlRepository.addUrlDetails();
        return "";
    }

    public String registerUrl(String originalUrl){
        return "";
    }

    String generateShortUrl(String originalUrl){
        if (urlRepository.checkUrlExists(originalUrl)){

        }else{
            String url = BASE_URL+ "";
        }
        return "";
    }


}
