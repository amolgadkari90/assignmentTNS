
public class InventoryItem {
	static int totalItems;
	String itemName;
	int quntity;
	

	public InventoryItem(String itemName, int quntity) {
		super();
		this.itemName = itemName;
		this.quntity = quntity;
		totalItems = totalItems + quntity;
	}
	
	static int getTotalItems() {
		return totalItems;
	}
	
	void addToInventory(int addQty) {
			if(addQty > 0) {
				quntity = quntity + addQty;
				totalItems = totalItems + addQty;
				System.out.println("Updated totalItems : "+totalItems);			
		} 
		else System.err.println("Invalid addQty!!!");		
	}
	
	void removeFromInventory(int removeQty) {
		if(quntity > removeQty) {
			quntity = quntity - removeQty;
			totalItems = totalItems - removeQty;
			System.out.println("Updated totalItems : "+totalItems);			
		} 
		else System.err.println("(Stock quntity) "+ quntity + " < (removeQty) "+ removeQty );	
	}
	
	void displayInventory()
	{
		System.out.println("Item name: "+ itemName +", Quntity: "+quntity);
	}
	
	//Info separator
	void infoSeparator(String str)
	{
		for (int i = 0; i < 20; i++)
			System.out.print(str);
			System.out.println();
	}
	

	public static void main(String[] args) {
		
		InventoryItem item1 = new InventoryItem("Resistor 1k", 1000);
		InventoryItem item2 = new InventoryItem("Resistor 2k2", 1500);
		InventoryItem item3 = new InventoryItem("Resistor 3k3", 1100);
		InventoryItem item4 = new InventoryItem("Resistor 4k7", 900);
		InventoryItem item5 = new InventoryItem("Resistor 5k1", 2100);
		
		
		//Display inventory
		item1.infoSeparator("***");
		System.out.println("\033[1m Display inventory \033[0m");
		item1.displayInventory();
		item2.displayInventory();
		item3.displayInventory();
		item4.displayInventory();
		item5.displayInventory();
		System.out.println("\033[1m Total items in the inventory: "
		+ InventoryItem.getTotalItems() +"\033[0m"); //6600
		System.out.println("Static method getTotalItems() is accessed using class name");
		item1.infoSeparator("***");
		
		//Happy path testing
		System.out.println("\033[1m Static variable is increased by object item3 by 400 \033[0m");
		item3.addToInventory(400);
		item3.displayInventory(); // item3 qty = 1500
		System.out.println("\033[1m Total items in the inventory: "
				+ InventoryItem.getTotalItems() +"\033[0m"); //7000
		item3.infoSeparator("***");
		
		
		System.out.println("\033[1m Static variable is decreased by object item2 by 1000 \033[0m");
		item2.removeFromInventory(1000);
		item2.displayInventory(); // item2 qty = 500
		System.out.println("\033[1m Total items in the inventory: "
				+ InventoryItem.getTotalItems() +"\033[0m"); //6000
		item2.infoSeparator("***");
		
		//Unhappy path testing
		System.out.println("\033[1m Static variable is increased by object item4 by -400 \033[0m");
		item4.addToInventory(-400);
		item4.displayInventory(); // item4 qty = 900
		System.out.println("\033[1m Total items in the inventory: "
				+ InventoryItem.getTotalItems() +"\033[0m"); //6000
		item4.infoSeparator("***");
		
		System.out.println("\033[1m Static variable is decreased by object item5  by 2500 \033[0m");
		item5.removeFromInventory(2500);
		item5.displayInventory(); // item5 qty = 2100
		System.out.println("\033[1m Total items in the inventory: "
				+ InventoryItem.getTotalItems() +"\033[0m"); //6000
		item5.infoSeparator("***");
	}
}
