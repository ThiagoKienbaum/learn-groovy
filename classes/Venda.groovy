package classes

class Venda {
	double vender(BigDecimal valor, BigDecimal comissao = 7) {
		valor * (comissao / 100)
	}
}
