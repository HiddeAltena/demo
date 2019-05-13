package Chatroom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

public class APL {
ArrayList<Rooms> roomOverView = new ArrayList<>();


    @Controller
    @RequestMapping("/rooms")
    public class returnRooms {

        @GetMapping(path = "/chatrooms")
        @ResponseBody
        public String getHelloWorld() {
            return roomOverView.toString();
        }
    }

}
