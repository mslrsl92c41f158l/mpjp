package s044;

public class exercise3 {
	public static void main(String[] args) {
		int[] array = { 7, 3, 1, 2, 4, 8 };
		var counter = 0;
		var sum = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0)
				++counter;

			else {
				sum = array[i] + sum;
			}
		}

		System.out.print(counter);
		System.out.print(sum);
	}
}
