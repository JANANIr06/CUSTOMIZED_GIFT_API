package com.example47584.demo68;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GiftRepo extends JpaRepository<Gift,Integer>{

    
}
