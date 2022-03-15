package bancobytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		//nome_classe nome_variavel = 
		
		Conta contadoPaulo = new Conta();
		contadoPaulo.saldo = 100;
		
		//invocando um metodo
		contadoPaulo.deposita(150);		
		System.out.println(contadoPaulo.saldo);
		
		//testando o metodo saca
		
		boolean conseguiuRetirar = contadoPaulo.saca(50);
		System.out.println(contadoPaulo.saldo);
		System.out.println(conseguiuRetirar );
		
		//testando metodo transfere
		
		Conta contadaMarcela = new Conta();
		contadaMarcela.saldo = 1000;
		
		//invocando o metodo
		contadaMarcela.transfere(300, contadoPaulo);
		
		System.out.println(contadaMarcela.saldo);
		System.out.println(contadoPaulo.saldo);
				
		
	}

}
