package com.hst.board.controller;

import java.util.HashMap;
import java.util.Map;

import com.hst.board.dao.Board;
import com.hst.board.service.BoardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
    @Autowired
    BoardService boardService;

    @PostMapping("/api/boards")
    public ResponseEntity getBoard() {
        Map<String, Object> res = new HashMap<String, Object>();
        res.put("result", "ok");
        res.put("list", boardService.getBoards());
        

        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("/api/board/{id}")
    public ResponseEntity detailBoard(@PathVariable("id") Integer id) {
        Board board = boardService.detailBoard(id);
        return new ResponseEntity<>(board, HttpStatus.OK);
    }

    @PostMapping("/api/board")
    public ResponseEntity insertBoard(@RequestBody Board board) {
        boardService.insertBoard(board);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PutMapping("/api/board/{id}")
    public ResponseEntity updateBoard(@RequestBody Board board) {
        boardService.updateBoard(board);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @DeleteMapping("/api/board/{id}")
    public ResponseEntity deleteBoard(@PathVariable("id") Integer id) {
        boardService.deleteBoard(id);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
