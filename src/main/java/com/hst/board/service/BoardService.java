package com.hst.board.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.hst.board.dao.Board;
import com.hst.board.dao.BoardDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BoardService {
    
    @Autowired
    BoardDao boardDao;

    public List<Board> getBoards() {
        return boardDao.findAll();
    }

    public Board detailBoard(Integer id) {
        Optional<Board> one = boardDao.findById(id);
        if(one.isPresent()) {
            return one.get();
        }
        return null;
    }

    public void insertBoard(Board board) {
        boardDao.save(board);
    }

    public void updateBoard(Board board) {
        boardDao.save(board);
    }

    public void deleteBoard(Integer id) {
        boardDao.deleteById(id);
    }
    
}
