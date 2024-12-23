package PROJECT;

public class Booking {
    /// default constructor
    public Booking() {
    }

    /// main constructor
    public Booking(Guest guest, Room room, int numberOfNights) {
        this.guest = guest;
        this.room = room;
        this.numberOfNights = numberOfNights;
    }

    /// attributes of class
    private Guest guest;
    private Room room;
    private int numberOfNights;

    /// getters
    public Guest getGuest() {
        return this.guest;
    }

    public Room getRoom() {
        return this.room;
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    /// setters
    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    /// method to display Booking information
    public void displayBookingInformation(){
        System.out.println("Guest:" + guest.getFirstname() + " " + guest.getLastname());
        System.out.println("Phone:" + guest.getPhoneNumber());
        System.out.println("Room:" + room.getRoomNumber());
        System.out.println("Price Per Night:" + room.getPricePerNight());
        System.out.println("Nights:" + numberOfNights);
        System.out.println("Total Price:" +(numberOfNights*room.getPricePerNight()) + " KZT");
    }

}
