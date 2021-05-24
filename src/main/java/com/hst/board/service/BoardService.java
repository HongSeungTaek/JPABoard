package com.hst.board.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.hst.board.dao.BoardDao;
import com.hst.board.domain.Board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BoardService {
    
    @Autowired
    BoardDao boardDao;

    public List<Object> getBoards() {
        List<Object> boards = new ArrayList<>();
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("id", 1);
        data.put("name", "제목1");
        boards.add(data);
        return boards;
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
