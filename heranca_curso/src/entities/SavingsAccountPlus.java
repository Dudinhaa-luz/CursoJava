package entities;

public class SavingsAccountPlus extends SavingsAccount{
	
	//Classes que tenham a palavra reservada FINAL em sua declaração não podem ser herdados.
	//O mesmo acontece com os métodos, quando declarado com a palavra final não permite que ele seja sobrescrito.
	//Acrescentar final em métodos sobrepostos é um boa prática, utilizar apenas se for realmente necessário
	
	@Override
	public void withdraw(double amount) {
		balance -= amount + 2;
	}

}
