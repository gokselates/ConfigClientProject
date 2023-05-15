package com.nk.configclientproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class UrlResource {

    @Value("${baseDataUri}")
    private String baseDataUri;

    @GetMapping("/url")
    public String baseDataUri(){
        return baseDataUri;
    }
}
