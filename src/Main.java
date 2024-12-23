import PROJECT.Room;
import PROJECT.Guest;
import PROJECT.Booking;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(121, 25000);
        Room room2 = new Room(95, 20000);

        Guest guest1 = new Guest("Aiymzhan", "Abilgazy", "877751233221", "aiymzhan@gmail.com", "st.Alikhan Bukeikhan 12", "Atyrau");
        Guest guest2 = new Guest("Marzhan", "Tulebayeva", "80001233214", "marzhan@mail.ru", "st.Mangilik 54", "Shymkent");

        Booking booking1 = new Booking(guest1, room1, 2);
        Booking booking2 = new Booking(guest2, room2, 5);

        System.out.println("Guest 1 Information:");
        guest1.displayGuestInformation();
        System.out.println("Room 1 Information:");
        room1.displayRoomInformation();
        System.out.println();

        System.out.println("Guest 2 Information:");
        guest2.displayGuestInformation();
        System.out.println("Room 2 Information:");
        room2.displayRoomInformation();
        System.out.println();

        /// Information about booking

        System.out.println("Booking 1 details:");
        booking1.displayBookingInformation();
        System.out.println();

        System.out.println("Booking 2 details:");
        booking2.displayBookingInformation();
        System.out.println();

        boolean sameFirstname = booking1.getGuest().getFirstname().equals(booking2.getGuest().getFirstname());
        System.out.println("Do both guests have the same first name? " + sameFirstname);
    }
}