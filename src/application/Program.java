package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qantos alunos serao digitados? ");
		int n = sc.nextInt();
		Student[] vect = new Student[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o" + " aluno:");
			sc.nextLine();
			String name = sc.nextLine();
			double grade1 = sc.nextDouble();
			double grade2 = sc.nextDouble();
			vect[i] = new Student(name, grade1, grade2);
		}

		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < n; i++) {
			double notas = vect[i].avg(vect[i].getGrade1(), vect[i].getGrade2());
			if(notas >= 6) {
				System.out.println(vect[i].getName());
			}
		}

		sc.close();
	}

}
