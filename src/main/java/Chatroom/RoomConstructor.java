package Chatroom;

public class RoomConstructor {

    int roomId;
    String roomName;

    public RoomConstructor(int roomId, String roomName) {
        this.roomId = roomId;
        this.roomName = roomName;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    @Override
    public String toString() {
        return "AddRoom{" +
                "roomId=" + roomId +
                ", roomName='" + roomName + '\'' +
                '}';
    }
}