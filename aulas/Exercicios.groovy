package aulas

import org.junit.Test
import classes.Cliente
import classes.Produto as Pd

class Exercicios {
	
	@Test
	void Exercicio1() {
		int a = 10
		println a.class
		println a.toString()
		
		println 12l.class
		
		println 11g.class
		
		BigDecimal valor = 200.56
		
		println valor.class
	}
	
	@Test
	void Exercicio2() {
		
		Cliente c = new Cliente() 
		c.setNome "Thiago"
		c.setData new Date()
		
		println c.somar(10, 8)
		println "O cliente " + c.getNome() + " compareceu no dia " + c.getData() + "."
		
	}
	
	@Test
	void Exercicio3() {
		
		Cliente c = new Cliente()		
		println c.getNome() + " - " + c.getData()
		
		c = new Cliente(nome: "Thiago")
		println c.getNome() + " - " + c.getData()
		
		c = new Cliente(data: new Date())
		println c.getNome() + " - " + c.getData()
		
		c = new Cliente(nome: "Aline", data: new Date())
		println c.getNome() + " - " + c.getData()
								
	}
	
	@Test
	void Exercicio4() {
		Cliente c = new Cliente(nome: "Thiago", data: new Date())
		println c["nome"]
		println c["data"]
		
		c["nome"] = "Aline"
		println c["nome"]
	}
	
	@Test
	void Exercicio5() {
		Pd p = new Pd(nome: "Caneta", preco: 7.40)
		
		println "Produto: " + p.nome
		println "Preço: R\$"+ p.preco		
	}
	
	@Test
	void Exercicio6() {
		Pd p = new Pd(nome: "Lapis", preco: 3.89)
		println "Produto $p.nome\nPreço: R\$ $p.preco"
		
	}
}






























