package music;

public class Music {

	public static void main(String[] args) {

		int a[] = { 5, 2, 6, 3, 4, 5, 2 };
		int n = a[0];
		int[] tickets = new int[n];// main

		for (int i = 0; i < n; i++) {
			tickets[i] = a[i + 1];
		}
		for (int i = 0; i < n; i++) {
			System.out.print(tickets[i] + " ");
		}

		// rotation
		int lenght = tickets.length;
		int noOfIteration = 12;
		int countZero = 0;
		int valueOfTickets = tickets[2];
		for (int i = 0; i < noOfIteration; i++) {
			int temp = 0;
			boolean flag = true;
			for (int j = 0; j < lenght - 1; j++) {
				// System.out.print(b[j]);

				if (tickets[lenght - 1] == 0) {
					lenght = lenght - 1;
					countZero++;
					
				}

				temp = tickets[j];

				tickets[j] = tickets[j + 1];
				if (flag) {
					flag = false;
					temp = temp - 1;
				}
				tickets[j + 1] = temp;

			}
		}

		System.out.println();
		for (int j : tickets) {
			System.out.print(j + " ");
		}
		System.out.println();
		System.out.println("No of iteration: " + noOfIteration);
	}

}
