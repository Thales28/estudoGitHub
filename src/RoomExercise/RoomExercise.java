package RoomExercise;

import java.util.Scanner;

import entities.Room;

public class RoomExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int roomsNumber = sc.nextInt();
		sc.nextLine();
		
		while (roomsNumber > 10 || roomsNumber < 1) {
			System.out.println("We only have 10 rooms, please choose a number between 1 and 10");
			roomsNumber = sc.nextInt();
			sc.nextLine();
		}
		
		Room[] roomsVector = new Room[10]; 
		
		for (int i = 1; i <= roomsNumber; i++) {
			System.out.println("Rent #"+i+":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			roomsVector[room-1] = new Room(room, name, email);
		}
		
		System.out.println("Busy rooms: ");
		
		for (int i = 0; i < roomsVector.length; i++) {
			if(roomsVector[i] != null) {
				System.out.println(roomsVector[i]);
			}
		}
		
		sc.close();
	}
}
