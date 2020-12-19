import models.PingPong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("I am a ping-pong application!");
        System.out.println("Enter a number:");
        try {
            int UserNumber = Integer.parseInt(bufferedReader.readLine());
            PingPong pingPong = new PingPong();
            ArrayList<Object> pingPongResult = pingPong.runPingPong(UserNumber);
            System.out.println(pingPongResult);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
