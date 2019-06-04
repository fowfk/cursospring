package br.com.casadocodigo.loja.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.casadocodigo.loja.models.Produto;

@Controller
public class ProdutosController {
	
	@RequestMapping("/cadastro")
	public String form() {
		System.out.println("Adicionando Produtos");
		return "produtos/form";
	}
	
	@RequestMapping("/produtos")
	public String grava(Produto produto) {
		System.out.println(produto);
		return "ok";
	}

}
