package com.itb.inf2dm.comercio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2dm.comercio.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {

	
	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	@GetMapping("/listar")
	public String listarProdutos() {

		Produto p1 = new Produto();
		p1.setId (201);
		p1.setNome("Máquina de Lavar Brastemp 12 litros");
		p1.setCodigoBarras("JHDYEJDUSNEU25411");
		p1.setPreco(3654.12);
	    	
	}
	@GetMapping("/novo-prod")
    public String novoProduto()	{
		return "novo-prod";
		}
}
