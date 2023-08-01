package com.itb.inf2dm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2dm.comercio.Produto; 
@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {

	
	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	@GetMapping("/listar")
	public String listarProdutos(Model model) {

		Produto p1 = new Produto();
		p1.setId(20l);
		p1.setNome("Máquina de Lavar Brastemp 12 litros");
		p1.setCodigoBarras("JHDYEJDUSNEU25411");
		p1.setPreco(3654.12);	
		p1.setDescricao("Brastempaa");
		p1.setStatus(false);
		
		listaDeProdutos.add(p1);
		
		Produto p2 = new Produto();
		p2.setId(13l);
		p2.setNome("Xbox One");
		p2.setCodigoBarras("SAJDN23135123u8jh8i");
		p2.setPreco(2000.0);	
		p2.setDescricao("Console");
		p2.setStatus(true);
		
		listaDeProdutos.add(p2);
		
		model.addAttribute("listaDeProdutos", listaDeProdutos);
		return "produtos";
	}
	@GetMapping("/novo-prod")
    public String novoProduto()	{
		return "novo-prod";
		}
}
