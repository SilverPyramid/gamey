
import javax.swing.JOptionPane;

public class mainClass {
    
    public static void main ( String args[] ){
        //placeholder
        String x;
        int y;
        //names n such
        String surName = "";
        String king = "";
        String gen = "1st";
        String dom = "";
        String heir = "";
        
        surName = JOptionPane.showInputDialog("Set surname");
        king = JOptionPane.showInputDialog("Set ruler name");
        dom = JOptionPane.showInputDialog("Set kingdom name");
        heir = JOptionPane.showInputDialog("Set heir name");
        
        king kingly = new king();
        kingly.setName(king + " " + surName + " the " + gen);
        heir heee = new heir();
        heee.setName(heir);
        kingdom kd = new kingdom();
        kd.setName(dom);
        time t = new time();
        t.setDate();
        
        int count = 1;
        
        while(count != 0){
            
            
            
            x = JOptionPane.showInputDialog("1 - show king stats\n"
                    + "2 - show heir stats\n"
                    + "3 - show kingdom stats\n"
                    + "4 - go to training grounds\n"
                    + ""
                    + "");
            
            switch(Integer.parseInt(x)){
                case 1: {
                    kingly.showStats();
                    break;
                }
                case 2: {
                    heee.showStats();
                    break;
                }
                case 3: {
                    kd.showStats();
                    break;
                }
                case 4: {
                    y = Integer.parseInt(JOptionPane.showInputDialog("1 - train king\n"
                            + "2 - train heir"));
                    if(y == 1){
                    x = JOptionPane.showInputDialog("How many days do you want to train for?");
                    kingly.train(Integer.parseInt(x));
                    }
                    else if(y == 2){
                    JOptionPane.showMessageDialog(null, "Work in Progress");
                    }
                    else{
                    JOptionPane.showMessageDialog(null, "Invalid entry");        
                    }
                    break;
                }
                case 5: {
                    break;
                }
                default: {
                JOptionPane.showMessageDialog(null, "Invalid entry");        
                }
            }
        }
    }
}