package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/prpdutos")
public class ProdutosController {


	@Operation(summary = "Serviço para cadastro de produtos")
	@PostMapping("cadastar")
	public void cadastrar() {
		//TODO 
	}
	

	@Operation(summary = "Serviço para atualização de produtos")
	@PutMapping("atualizar")
	public void atualizar() {
		//TODO 
	}

	@Operation(summary = "Serviço para exclusão de produtos")
	@DeleteMapping("excluir")
	public void excluir() {
		//TODO 
	}
	

	@Operation(summary = "Serviço para consulta de produtos")
	@GetMapping("consultar")
	public void cconsultar() {
		//TODO 
	}
	
	
	

}
