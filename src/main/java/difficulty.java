
public class difficulty {
	public static void main(String[] args) {
		int[] array = { 5, 7, 1, 3, 4, 87 };
		
		

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				System.out.println("1 è alla posizione " + i);

			}

			else if (array[i] == 7) {
				System.out.println("7 è alla posizione " + i);

			} else {
				System.out.println("x");
			}

		}

	}
}
