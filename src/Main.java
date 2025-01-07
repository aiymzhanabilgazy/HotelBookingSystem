import PROJECT.Room;
import PROJECT.Guest;
import PROJECT.Booking;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(121, 25000);
        Room room2 = new Room(95, 20000);

        Guest guest1 = new Guest("Aiymzhan", "Abilgazy","aiymzhan@gmail.com", "877751233221", "st.Alikhan Bukeikhan 12", "Atyrau");
        Guest guest2 = new Guest("Marzhan", "Tulebayeva", "marzhan@mail.ru", "80001233214", "st.Mangilik 54", "Shymkent");

        Booking booking1 = new Booking(guest1, room1, 2);
        Booking booking2 = new Booking(guest2, room2, 5);

        /// display booking details
        System.out.println(booking1);
        System.out.println(booking2);

        /// Comparing
        System.out.println("Are Guests equal?" + guest1.equals(guest2));
    }
}