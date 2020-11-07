package controller;

import model.Event;
import model.ReadInput;
import view.GUI;

import java.util.List;

public class App {
    //variables
    private static List<Event> events;


    public static void main(String[] args){
        ReadInput ri = new ReadInput("//Users//ed//Documents//CS695//AllData.JSON");
        events = ri.getEvents();

        events.forEach(System.out::println);
        GUI g = new GUI(events);
    }
}
