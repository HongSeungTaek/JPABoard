package com.hst.board.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
    
    @GetMapping("/api/boards")
    public ResponseEntity<Map<String, Object>> getBoard() {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("result", "ok");

        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
