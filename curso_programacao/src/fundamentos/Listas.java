package fundamentos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		//Para adiconar em uma posição especifica
		list.add(2, "Marco");
		
		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------");
		list.remove("Anna");
		list.remove(2);
		list.removeIf(x -> x.charAt(0) == 'M'); //predicado (lambda)

		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------");
		System.out.println("Index of Bob:" + list.indexOf("Bob"));
		System.out.println("Index of Bob:" + list.indexOf("Marco"));//Quando não encontra um elemento retorna -1
		
		System.out.println("-----------------------------");
		//stream permite realizar operações lambdas
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------------------");
		
		//Retorna nulo caso não encontre
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
