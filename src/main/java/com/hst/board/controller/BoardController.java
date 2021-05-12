package com.hst.board.controller;

import java.util.HashMap;
import java.util.Map;

import com.hst.board.service.BoardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
    @Autowired
    BoardService boardService;

    @GetMapping("/api/boards")
    public ResponseEntity<Map<String, Object>> getBoard() {
        Map<String, Object> res = new HashMap<String, Object>();
        res.put("result", "ok");
        res.put("list", boardService.getBoards());
        

        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
