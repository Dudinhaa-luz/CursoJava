package entities;

public class ContaBancaria {

	private int numero;
	private String titular;
	private double saldo;
	
	public ContaBancaria(int numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public ContaBancaria(int numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar (double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public void sacar (double valorSaque) {
		saldo -= (valorSaque + 5);
	}
	
	
}
