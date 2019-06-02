package radovan;


import java.util.ArrayList;

public class BetterrrayList extends ArrayList {

	public static ArrayList<Object> array = new ArrayList<Object>();

	public static void print(ArrayList<Object> array) {

		System.out.println(array.toString());
	}

	public static void pop(ArrayList<Object> array) {
		if (array.size() > 0) {
			array.remove(array.size() - 1);
		} else {
			System.out.println("Empty list");
		}
	}

	public static void main(String[] args) {

		BetterrrayList bArray = new BetterrrayList();
		bArray.add(1);
		bArray.add(5);
		bArray.add(10);
		bArray.add(15);
		bArray.add(20);
		print(bArray);
		pop(bArray);
		print(bArray);



	}
}
