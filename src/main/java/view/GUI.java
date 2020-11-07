package view;

import model.Event;

import javax.swing.*;
import java.util.List;

public class GUI {
    //variables
    private List<Event> events;

    public GUI(List<Event> events){
        this.events=events;

        SwingUtilities.invokeLater(new Runnable(){ //create swing thread
            public void run(){
                JFrame frame = new MainGUI("Solving Uncertainty", events);

                frame.setSize(1500,400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args){

    }
}
