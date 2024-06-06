package desafio_dio_banco;

public class ContaPoupanca extends Conta {
	

	@Override
	public void imprimirExtrato() {
		System.out.println("==== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		// TODO Auto-generated method stub
		
	}
}
