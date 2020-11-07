package model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadInput {
    List<Event> events;

    public ReadInput(String inputFileName){

        try{
            Gson gson = new Gson(); //create Gson instance
            Reader reader = Files.newBufferedReader(Paths.get("/Users/ed/Documents/CS695/AllData.JSON")); //create reader
            events = new Gson().fromJson(reader, new TypeToken<List<Event>>() {}.getType()); //convert JSON string to event object
           //events.forEach(System.out::println);
            reader.close();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public List<Event> getEvents(){ return this.events;}

    public static void main(String[] args){
        System.out.println("Starting program....");
        ReadInput ri = new ReadInput("//Users//ed//Documents//CS695//AllData.JSON");

    }
}
