package algorithm_study;

public class Multi99Table {

	public static void main(String[] args) {

		System.out.println("-----구구단 곱셉표------");
		for (int i = 0; i < 9; i++) {
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i * j);
			System.out.println();
		}
	}

}
