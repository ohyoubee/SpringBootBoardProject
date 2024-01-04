package com.example.springbootboardproject.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity
@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "board")
public class Board {
    //글번호
    @Id
    @Column(name = "num")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int num;
    //제목
    @Column(name = "title", nullable = false)
    private String title;
    //내용
    @Column(name = "content", nullable = false)
    private String content;
}
