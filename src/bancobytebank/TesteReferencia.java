package bancobytebank;

public class TesteReferencia {
	
	public static void main(String[] args) {
		Conta primeraConta = new Conta();
		primeraConta.saldo = 300;
		
		Conta segundaConta = primeraConta;
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println(segundaConta.saldo);
		
		System.out.println(primeraConta.saldo);
		
	}

}
