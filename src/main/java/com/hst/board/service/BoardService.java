package com.hst.board.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;


@Service
public class BoardService {
    public List<Object> getBoards() {
        List<Object> boards = new ArrayList<>();
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("id", 1);
        data.put("name", "제목1");
        boards.add(data);
        return boards;
    }
    
}
