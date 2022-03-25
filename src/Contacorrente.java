
public class Contacorrente extends Conta {
	
	public Contacorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.ImprimirInfoComuns();
		
	}

	

	
	
	
	

}