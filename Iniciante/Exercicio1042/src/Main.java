import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void ordenar(int a, int b, int c) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(a);
		lista.add(b);
		lista.add(c);

		Collections.sort(lista);

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

	public static void main(String[] args) {
		int n1, n2, n3;

		try (Scanner input = new Scanner(System.in)) {
			n1 = input.nextInt();
			n2 = input.nextInt();
			n3 = input.nextInt();

			ordenar(n1, n2, n3);

		}

	}

}
