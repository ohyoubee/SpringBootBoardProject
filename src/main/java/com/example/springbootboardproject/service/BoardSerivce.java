package com.example.springbootboardproject.service;


import com.example.springbootboardproject.entity.Board;
import com.example.springbootboardproject.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardSerivce {

    private final BoardRepository boardRepository;


    List<Board> findAll(){
        return boardRepository.findAll();
    }
}
