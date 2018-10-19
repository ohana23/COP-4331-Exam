import java.io.*;
import java.util.*;

public enum priority_enum {
	none, low, medium, high
};

public enum category_enum {
	breakfast, lunch, dinner, dessert
};

class List {
	ArrayList<Item> list;

	List(Item i) {
		list = new ArrayList<Item>();
		list.add(i);
	}

	List addItem(Item i) {
		list.add(i);
	}

	List deleteItem(int item_to_delete) {

		ArrayList<Item> newList = new ArrayList<>();

		for (int i = 0; i < this.list.size(); i++) {
			if (i == item_to_delete)
				continue;
			else
				newList.add(this.list.get(i));
		}

		list = newList;

		return newList;
	}

	Item searchItem(String s) {

		for (Item i : this.list) {
			if (s.equals(i.name))
				return i;
		}

		return null;
	}
}

class Item {
	String name;
	priority_enum priority;
	category_enum category;

	Item(String name, priority_enum priority, category_enum category) {
		this.name = name;
		this.priority = priority;
		this.category = category;
	}
}

class View {

	void printList(List l) {

		int index = 0;
		for (Item i : l.list) {
			System.out.println(index++ + ": " + i.name + ", " + i.priority + ", " + i.category);
		}
	}

	void displayCapacityError() {

		System.out.println("Warning: You have reached the list's capacity. Delete an item to add another one.");
	}
}

public class ShoppingList {
	public static void main(String [] args) {
		

		// Create a list with item.

	}
}