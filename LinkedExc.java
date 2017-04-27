package Objects;

import javax.swing.JOptionPane;


public class LinkedExc extends Exception{

    public LinkedExc(String msg){
        JOptionPane.showMessageDialog(null, msg, null, JOptionPane.WARNING_MESSAGE);
    }
    
}