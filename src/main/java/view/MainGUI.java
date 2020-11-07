package view;

import model.Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MainGUI extends JFrame {
    //variables
    private List<Event> events;

    /**
     * Constructor
     * @param title
     */
    public MainGUI(String title,List<Event> events){
        super(title);


        //set layout manager
        setLayout(new BorderLayout());

        //Create Swing components
        JTextArea textArea = new JTextArea();
        JButton button = new JButton("Click Me!");

        //Add Swing components to content pane
        Container c = getContentPane();

        c.add(textArea, BorderLayout.CENTER);
        c.add(button, BorderLayout.SOUTH);

        //Add action listener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                for(Event event: events){
                    textArea.append(event.toString() + "\n\n");
                }
            }
        });
    }
}
