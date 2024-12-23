package PROJECT;

public class Room {
    /// default constructor
    public Room() {}

    /// main constructor
    public Room(int roomNumber, int pricePerNight) {
        this.roomNumber = roomNumber;
        this.pricePerNight = pricePerNight;
    }

    /// attributes of class
    private int roomNumber;
    private int pricePerNight;

    //getters
    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getPricePerNight() {
        return this.pricePerNight;
    }

    //setters
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
    /// method to display room information
    public void displayRoomInformation(){
    System.out.println("Room number:" + roomNumber);
    System.out.println("Price Per Night:" + pricePerNight + " KZT");
    }

}
