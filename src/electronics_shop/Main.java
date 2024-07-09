package electronics_shop;

import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	public Main() {
		// TODO Auto-generated constructor stub
		String input = "";
		do {
			input = scan.nextLine();
		} while(input.split(" ").length != 3);
		int budget = Integer.parseInt(input.split(" ")[0]);
		int num_keyboard = Integer.parseInt(input.split(" ")[1]);
		int num_drive = Integer.parseInt(input.split(" ")[2]);
		
		String keyboards = "";
		do {
			keyboards = scan.nextLine();
		} while(keyboards.split(" ").length != num_keyboard);
		
		String drives = "";
		do {
			drives = scan.nextLine();
		} while(drives.split(" ").length != num_drive);
		
		String[] array_keyboard = keyboards.split(" ");
		
		String[] array_drive = drives.split(" ");
		
		int highest_amount = -1;
		
		for (int i = 0; i < array_keyboard.length; i++) {
			for (int j = 0; j < array_drive.length; j++) {
				int amount = Integer.parseInt(array_keyboard[i]) +Integer.parseInt(array_drive[j]);
				if (amount <= budget && amount > highest_amount) highest_amount = amount;
			}
		}
		
		System.out.println(highest_amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
