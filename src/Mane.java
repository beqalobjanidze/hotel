import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Mane {
    public static void main(String[] args) throws IOException {
//        List<Hotel> hotelList = new ArrayList<>();
//        List<Hotel> filteredList;
//
//        List <Room> rooms = new ArrayList<>();
//        List<Room> roomList = new ArrayList<>();
//
//
//        Room room = new Room();
//
//        room.setNumber(404);
//        room.setPrice(1500);
//        room.setLype("ლუქსი");
//
//        rooms.add(room);
//
//        Hotel hotel = new Hotel();
//        hotel.setName("შერატონი");
//        hotel.setCountry("საქართველო");
//        hotel.setCity("ბათუმი");
//        hotel.setStars(5);
//        hotel.setRooms(rooms);
//
//        hotelList.add(hotel);
//
//        rooms.add(new  Room (201,200,"ლუქსი"));
//        rooms.add(new  Room (301,200,"ეკონომ"));
//
//        rooms.add(new  Room (1001,700,"ლუქსი"));
//        rooms.add(new  Room (705,50,"ეკონომი"));
//        rooms.add(new  Room (201,200,"ეკონომი"));
//
//
//
//        Hotel a = new  Hotel("რედისონი","საქართველო","თბილისი", 5);
//        Hotel b = new  Hotel("ჰილტონი","საქართველო","ქობულეთი", 5);
//        Hotel c = new  Hotel("შერატონი","საქართველო","ბათუმი", 5);
//
//        a.setRooms(rooms);
//        b.setRooms(roomList);
//        c.setRooms(roomList);
//
//        hotelList.add(a);
//        hotelList.add(b);
//        hotelList.add(c);
//
//
//        Filter filter = new Filter();
//        filteredList = filter.filterHotels("საქართველო","ბათუმი",5,200,"ეკონომი",hotelList);
//
//
//        System.out.println(filteredList.get(1).getName());

        ExselReader exselReader = new ExselReader();
        List<Hotel> hotelList = new ArrayList<>();
        hotelList = exselReader.listLoader();

        for (Hotel hotel : hotelList) {
            System.out.printf("სასტუმრო: " + hotel.getName() + " " + hotel.getCountry() + " " + hotel.getCity() + " " + hotel.getStars());
            for (int i = 0; i < hotel.getRooms().size(); i++) {
                System.out.printf("  " + hotel.getRooms().get(i).getNumber() + " " + hotel.getRooms().get(i).getPrice() + " " + hotel.getRooms().get(i).getLype() + ";");
            }
            System.out.printf("\n");
        }


    }
}
