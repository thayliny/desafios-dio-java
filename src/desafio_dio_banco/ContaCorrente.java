package desafio_dio_banco;

public class ContaCorrente extends Conta{
	
	public void imprimirExtrato() {
		System.out.println("==== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		// TODO Auto-generated method stub
		
	}
	}
		
	
