package task3;

public class Main {
    public static void main(String[] args) {

        RoomService<StandardRoom> standardService = new BasicRoomServiceImpl<>();
        StandardRoom standardRoom = new StandardRoom(101);
        standardService.clean(standardRoom);
        standardService.reserve(standardRoom);
        try {
            standardService.reserve(standardRoom);
        } catch (RoomAlreadyBookedException e) {
            System.out.println("Error: " + e.getMessage());
        }
        standardService.free(standardRoom);

        RoomService<EconomyRoom> economyService = new BasicRoomServiceImpl<>();
        EconomyRoom economyRoom = new EconomyRoom(102);
        economyService.clean(economyRoom);
        economyService.reserve(economyRoom);
        economyService.free(economyRoom);
    }
}