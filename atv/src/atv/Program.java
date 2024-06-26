package atv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import work.Employee;
import work.OutsourceEmplyee;

public class Program {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantidade de Funcionarios: ");
		Integer num = sc.nextInt();
		
		
		for (Integer i= 1; i<=num; i++) {
			
			System.out.println("Funcionário " + i + "#");
			System.out.println("Digite o nome:");
			String name = sc.next();
			System.out.println("Digite o hora:");
			Integer hora = sc.nextInt();
			System.out.println("Digite o ganho por hora:");
			Double ganhoPorHora = sc.nextDouble();
			System.out.println("Terceirizado?(s/n)");
			char terceiro = sc.next().charAt(0);
			
			if(terceiro == 's') {
				System.out.println("Digite o custo: ");
				Double custo = sc.nextDouble();
				list.add(new OutsourceEmplyee(name, hora, ganhoPorHora, custo));
			}
			else {
				list.add(new Employee(name, hora, ganhoPorHora));
			}
			
		}
		
		sc.close();
		
		
		for(Employee a : list) {
			System.out.println(a.getName() + " - " + a.Payment());
		}
	}

}
