package com.example.springbootboardproject.contoller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("board")
    public String board(){
        return "/board/board";
    }
}
