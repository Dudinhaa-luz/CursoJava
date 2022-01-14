package entities;

public class SavingsAccountPlus extends SavingsAccount{
	
	//Classes que tenham a palavra reservada FINAL em sua declara��o n�o podem ser herdados.
	//O mesmo acontece com os m�todos, quando declarado com a palavra final n�o permite que ele seja sobrescrito.
	//Acrescentar final em m�todos sobrepostos � um boa pr�tica, utilizar apenas se for realmente necess�rio
	
	@Override
	public void withdraw(double amount) {
		balance -= amount + 2;
	}

}
