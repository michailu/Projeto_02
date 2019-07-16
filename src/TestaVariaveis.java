
public class TestaVariaveis {

	public static void main(String[] args) {
		
		int idade = 42;
		
		double divisao = 5.0 / 2;
		
		System.out.println("Idade "+idade);
		
		System.out.println("Divisao "+divisao);
		
		System.out.println("Soma "+ (idade + divisao));

		double novaDivisao = 5 / 2; //Calculo com inteiro o resultado sera inteiro alterado pelo Eclipse
		
		System.out.println(novaDivisao);
		
		int novaTentativa = 5 / 2;
		
		System.out.println(novaTentativa);
		
		double salario = 1050.7;
		
		int salarioInt = (int) salario;
		
		System.out.println(salarioInt);
		
		long numeroLong = 1234555444444444449l;
		
		short numeroShort = 32767;
		
		byte numeroByte = 127;
		
		float numeroFloat = 949f;
		
		System.out.println("Teste maximo dos tipos: " + numeroByte); //Comentario adicionado pelo eclipse
	}

}
