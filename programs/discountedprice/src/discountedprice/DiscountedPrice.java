package discountedprice;

import java.util.ArrayList;
import java.util.List;

/*
 * 
3)	Final Discounted Price
Array containing the prices of items is given 
Eg : prices ={5,4,3,2,4}
For item i the price is prices[i]
If the prices of i+1 th item is less than i th item the we will given a discount of prices[i]-prices[i+1];
We need to find the total price the customer has to pay for buying all the items and the indexes where customer dint get any discount;
Output : The total price is 9 how -> (1+1+1+2+4)
          Indexes:	3 4
*/

public class DiscountedPrice {

	public static void main(String[] args) {

		int prices[] = { 5, 4, 3, 2, 4 };
		getDiscountedPrices(prices);
	}

	private static void getDiscountedPrices(int[] prices) {

		int discountedPrice = 0;
		List<Integer> nondiscountedIndexes = new ArrayList<>();

		for (int i = 0; i <= prices.length - 1; i++) {

			if (i == prices.length - 1) {
				discountedPrice = discountedPrice + prices[prices.length - 1];
				nondiscountedIndexes.add(prices.length - 1);
			} else {
				if (prices[i + 1] < prices[i]) {
					discountedPrice = discountedPrice + prices[i] - prices[i + 1];
				} else {
					discountedPrice = discountedPrice + prices[i];
					nondiscountedIndexes.add(i);
				}
			}
		}

		System.out.println("Total discounted price: " + discountedPrice);
		System.out.print("Indexes: ");
		for (Integer index : nondiscountedIndexes) {
			System.out.print(index + " ");
		}

	}

}
