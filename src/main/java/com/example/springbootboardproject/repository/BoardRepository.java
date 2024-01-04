package com.example.springbootboardproject.repository;

import com.example.springbootboardproject.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Integer> {
}
