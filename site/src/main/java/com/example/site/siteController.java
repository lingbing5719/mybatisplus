package com.example.site;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class siteController {
    @GetMapping("/site")
    public int test() {
        return 1;
    }
}
