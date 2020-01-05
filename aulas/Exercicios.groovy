package aulas

import org.junit.Test
import classes.Cliente
import classes.Conexao
import classes.Funcionario
import classes.Nota
import classes.Pedido
import classes.Pessoa
import classes.Produto as Pd
import classes.Soma
import classes.Venda
import classes.Teste

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
	
	@Test
	void Exercicio7() {
		Venda v = new Venda()

		println v.vender(100)		
		println v.vender(100, 10)		
	}
	
	@Test
	void Exercicio8() {
		Soma soma = new Soma()
		
		println soma.somar(8)
		println soma.somar(8, 10)
		println soma.somar(8, 10, 12)
	}
	
	@Test
	void Exercicio9() {
		Cliente c = null		
		println c?.nome;
	}
	
	@Test
	void Exercicio10() {
		ArrayList<String> colecao = new ArrayList<>()
		colecao.add("Thiago")
		colecao.add("Aline")
		colecao.add(null)
		colecao.add("Opie")
		
		println colecao*.toUpperCase()
	}
	
	@Test
	void Exercicio11() {
		URL url = new URL("http://www.google.com.br")
		println url	
	}
	
	@Test
	void Exercicio12() {
		String nome = null
		
		if(nome) {
			println true
		}
		else {
			println false
		}
		
		nome = "Thiago"
		
		if(nome) {
			println true
		}
		else {
			println false
		}
		
		int num = 0
		
		if(num) {
			println true
		}
		else {
			println false
		}
		
		num = 1
		
		if(num) {
			println true
		}
		else {
			println false
		}
		
		ArrayList<String> lista = new ArrayList<>()
		
		if(lista) {
			println true
		}
		else {
			println false
		}
		
		lista.add("Aline")
		
		if(lista) {
			println true
		}
		else {
			println false
		}		
	}
	
	@Test
	void Exercicio13() {
		Nota n1 = new Nota(itens: 2, valor: 10)
		Nota n2 = new Nota(itens: 9, valor: 35)
		Nota n3 = n1 + n2
		
		println n3.valor + " - " + n3.itens		
		n1++
		println n1.itens + " - " + n1.valor
		
		BigDecimal x = 10		
		x += x
		println x		
		x++
		println x	
		
		Pessoa p1 = new Pessoa(nome: "Homem", arma: "espada")
		println p1.correr()
		println p1.falar()
		println p1.pular()
		println p1.lutar()
		
	}
	
	@Test
	void Exercicio14() {
		Funcionario f = new Funcionario(nome: "Ana", idade: 23, salario: 3200)
		println f
	}
	
	@Test
	void Exercicio15() {
		Funcionario f1 = new Funcionario(nome: "Carlos", idade: 20, salario: 1300)
		Funcionario f2 = new Funcionario(nome: "Carlos", idade: 20, salario: 1300)
		println f1.equals(f2)
		println f2.equals(f1)
	}
	
	@Test
	void Exercicio16() {
		Pedido p = new Pedido(nome: "Thiago", numero: 15)
		println p
		// p.nome = "Aline"
	}
	
	//Estudar
	@Test
	void Exercicio17() {
		Conexao.instance.valor = 10
		println Conexao.instance.valor
		Conexao con = Conexao.instance
		con.valor = 11
		println Conexao.instance.valor
		
	}
	
	//Builder Estudar
	@Test
	void Exercicio18() {}
	
	@Test
	void Exercicio19() {
		def objeto = "Texto"
		println objeto.getClass()		
		objeto = 10
		println objeto.getClass()
		objeto = 11.12
		println objeto.getClass()		
		objeto = new Funcionario(nome: "Thiago")
		println objeto.getClass()
		
	}
	
	@Test
	void Exercicio20() {
		def teste = new Teste()
		
		def valor = teste.metodo("Thiago")
		println valor
		println valor.getClass()
		valor = teste.metodo(5)
		println valor
		println valor.getClass()		
	}
	
	@Test
	void Exercicio21() {
		def colecao = new ArrayList<String>()
		colecao.add("Thiago")
		colecao.add("Aline")
		colecao.add("Opie")
		for (item in colecao) {
			println item
		}
		colecao = new ArrayList<Integer>()
		colecao.add(8)
		colecao.add(12)
		colecao.add(16)
		for (item in colecao) {
			println item
		}
	}
}






























