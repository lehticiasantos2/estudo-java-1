package bancobytebank;

public class CriaConta {
	public static void main(String[] args) {
		
		// Instaciando/criando um objeto do tipo conta
		//guardando em uma variavel primeira conta
		Conta primeiraConta = new Conta();
		// referenciando o saldo da primeira conta criada na classe conta
		primeiraConta.saldo = 200;		
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo +=100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("A primeira conta tem " + primeiraConta.saldo);
		System.out.println("A segunda conta tem " + segundaConta.saldo);
	}

}
