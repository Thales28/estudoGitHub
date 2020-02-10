package entities;

public class Room {
	public int roomNumber;
	public String guestName;
	public String email;
	
	public Room(int roomNumber, String guestName, String email) {
		this.roomNumber = roomNumber;
		this.guestName = guestName;
		this.email = email;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public String toString() {
		return roomNumber + ": "+ guestName + ", " + email;
	}
}
