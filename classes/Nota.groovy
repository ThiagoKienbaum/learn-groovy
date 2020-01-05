package classes

class Nota {
	int itens
	double valor
	
	Nota plus(Nota nota) {
		Nota novo = new Nota()
		novo.itens = this.itens + nota.itens
		novo.valor = this.valor + nota.valor		
		novo
	}
	Nota next() {
		this.itens ++
		this.valor ++
		this
	}
}
