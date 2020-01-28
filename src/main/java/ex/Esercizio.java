package ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Esercizio {

	public static void main(String[] args) {
		ArrayList<String> x = new ArrayList<>();
		System.out.println(x);

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String s = scanner.next();

			if (s.equals("exit")) {
				break;
			}
			x.add(s);

		}
		scanner.close();
	}
}
