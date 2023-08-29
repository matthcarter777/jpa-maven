package application;

import domain.Pessoa;

public class Program {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(1, "Mangabão", "manga@gmail.com");
		Pessoa p2 = new Pessoa(2, "Trevor", "trevin@gmail.com");
		Pessoa p3 = new Pessoa(3, "Jorge", "balao@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
