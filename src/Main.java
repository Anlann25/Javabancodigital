
public class Main {
	
	public static void main(String[] args) {
		Cliente Ana = new Cliente();
		Ana.setNome("Ana");
		
		Conta cc = new Contacorrente(Ana);
		Conta Poupanca = new Contapoupanca(Ana);
		
		cc.depositar(200);
		cc.transferir(1000, Poupanca);
		
		cc.imprimirExtrato();
		Poupanca.imprimirExtrato();
	}

}
