package classes

trait Lutador {
	String arma
	
	abstract void correr()
	void lutar() {
		println "Lutando com " + arma
	}	
	
}
