package desafio_dio_banco;

public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static final Conta ContaDestino = null;
	private static int SEQUENCIAL =1;
	
	private int agencia;
	private int numero;
	private double saldo; 
	
	public Conta(){
		
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo += valor;
	}

	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		this.sacar(valor);
		ContaDestino.depositar(valor);
		
		
		
	}
	
	
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfosComuns() {
		System.out.println("==== Extrato Conta Corrente ===");
		System.out.println( String.format("Agencia : %d", this.agencia));
		System.out.println( String.format("Agencia : %d", this.numero));
		System.out.println( String.format("Saldo : %.2f", this.saldo));
	}

}
