package Chatroom;


import java.util.ArrayList;

public class Rooms {
    public ArrayList rooms = new ArrayList();


    public void addRooms() {
        RoomConstructor room = new RoomConstructor(123, "name");
        rooms.add(room);

    }

    public void readAllRooms() {
        for (int i = 0; i < rooms.size(); i++) {
            System.out.println(i);
        }

    }
}


