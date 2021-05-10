package com.hst.board.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    
    @GetMapping("/")
    public Map<String, Object> index() {
        Map<String, Object> res = new HashMap<String, Object>();
        res.put("result", "ok");

        return res;
    }
}
