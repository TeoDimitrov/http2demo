package com.example.http2.demo;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImageController {

    @GetMapping(path = "/images", produces = MediaType.TEXT_HTML_VALUE)
    public String images() {
        return "images";
    }
}
