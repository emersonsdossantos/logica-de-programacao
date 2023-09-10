package cursoLogicaCapitulo04;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		Integer soma = 1 + 1;
		System.out.println("Soma: " + soma);
		
		Integer subtracao = 1 - 1;
		System.out.println("Subtração: " + subtracao);
		
		Integer multiplicacao = 2 * 2;
		System.out.println("Multiplicação: " + multiplicacao);
		
		Integer divisao = 10 / 2;
		System.out.println("Divisao: " + divisao);
		
		Integer modulo = 7 % 4;
		System.out.println("Modulo: " + modulo);
		
		Integer precedencia01 = 1 + 1 * 5; // primiero vai multipçicar e depois somar
		System.out.println("Precedencia 01: " + precedencia01);
		
		Integer precedencia02 = (1 + 1) * 5; // primiero vai somar e depois multiplicar
		System.out.println("Precedencia 02: " + precedencia02);
		
		Integer precedencia03 = 5 * (1 + 1); // primeiro vai somar e depois multiplicar
		System.out.println("Precedencia 03: " + precedencia03);
		
		Integer precedencia04 = 5 * (1 + 1) + 2; // primeiro vai somar, depois multiplicar por 5  e depois somar por 2 
		System.out.println("Precedencia 04: " + precedencia04);
		
		Integer precedencia05 = 5 * ((1 + 1) + 2); // primeiro vai somar 1 + 1, depois somar + 2  e depois multiplicar por 5 
		System.out.println("Precedencia 05: " + precedencia05);
		
		Integer cinco = 5;
		Integer um =  1;
		
		Integer precedenciaComVariavel = cinco * (um + um);
		System.out.println("Precedencia com Variavel: " + precedenciaComVariavel);

	}

}
