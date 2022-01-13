package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.next();
		System.out.print("How many items to this order?");
		int n = sc.nextInt();
		OrderStatus status1 = OrderStatus.valueOf(status);
		Order order = new Order(new Date(), status1, client);
		
		for (int i=1; i<=n; i++){
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			Product product = new Product(productName, productPrice);
			
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
			order.addItem(orderItem);
		}
		double totalPriceOrder = order.total();
			
		System.out.println("ORDER SUMMARY: ");
		System.out.println("Order moment: " + sdf1.format(order.getMoment()));
		System.out.println("Order Status: " + OrderStatus.valueOf(status));
		System.out.println("Client: " + name + " (" + sdf.format(birthDate) + ") - " + email);
		System.out.println("Order items: ");
			
		for (int i=0; i<n; i++){
			List<OrderItem> items = new ArrayList<>();
			items = order.getItems();
			OrderItem orderItem = new OrderItem(items.get(i).getQuantity(),  items.get(i).getProduct().getPrice(), items.get(i).getProduct());
			double subtotal = orderItem.subTotal();
			System.out.println(orderItem.getProduct().getName() + ", $" + 
					           orderItem.getProduct().getPrice() + ", Quantity: " +
					           orderItem.getQuantity() + ", Subtotal: $" + subtotal);
		}
		System.out.println("Total price: $" + totalPriceOrder);
		sc.close();
	}

}
