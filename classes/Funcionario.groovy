package classes

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@ToString(includeNames = true)
@EqualsAndHashCode
class Funcionario {
	String nome
	int idade
	double salario
}
