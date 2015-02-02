
public class Supermarket_cart {

	public static void main(String[] args) {
		String [][] items = {
				{"Pen", "Bottle", "Cake", "Cassava", "Potatoes"},
				{ "$2", "$20", "$14", "$!", "$3"},
				{"1", "1", "1", "1kg", "2kg"},
				{"red", "blue", "brown","orange", "white"},
				{"non-edible", "non-edible", "edible", "edible", "edible"},
		};
		
		System.out.println(items[0][0]  + " "  + items[1][0] + items[2][0] + items[3][0] + items[4][0]);
		System.out.println(items[1][0] + items[1][1] + items[1][2] + items[1][3] + items[1][4]);

	}

}
