package com.example.samuraigoods.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraigoods.entity.Goods;

public interface GoodsRepository extends JpaRepository<Goods, Integer>{

}
