package Java.GUI;

import javax.swing.JFrame;


public class GUI_main 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI_Opt component = new GUI_Opt(frame);

        frame.add(component);
        frame.setVisible(true);
    }
    
}