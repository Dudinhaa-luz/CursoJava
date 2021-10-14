package entities;

public class ProductConstructor {

	public String name;
	public double price;
	public int quantity;
	
	//Constructor, executa na instancia��o
	public ProductConstructor(String name, double price, int quantity) {
		//this - aponta para as propriedades do objeto
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Sobrecarga
	public ProductConstructor(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//Construtor padr�o
	public ProductConstructor() {
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
			+ ", $ " 
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}
