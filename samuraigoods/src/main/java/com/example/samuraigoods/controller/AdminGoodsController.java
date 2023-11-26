package com.example.samuraigoods.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.samuraigoods.entity.Goods;
import com.example.samuraigoods.repository.GoodsRepository;

@Controller
@RequestMapping("/admin/goods")
public class AdminGoodsController {
	private final GoodsRepository goodsRepository;
	
	public AdminGoodsController(GoodsRepository goodsRepository) {
		this.goodsRepository = goodsRepository;
	}
	
	@GetMapping
	public String index(Model model) {
		List<Goods> goods = goodsRepository.findAll();
		
		model.addAttribute("goods", goods);
		
		
		return "admin/goods/index";
	}
	
}
