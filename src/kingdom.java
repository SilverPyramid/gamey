
import javax.swing.JOptionPane;

public class kingdom {
    
    String name;
    int pop;
    int nextGrow;
    
    public void setName(String x){
        name = x;
        pop = 200;
        nextGrow = 250;
    }
    
    public void showStats(){
        JOptionPane.showMessageDialog(null, "Name: " + name
            + "\nPopulation: " + pop
            + "\nNext growth at: " + nextGrow);
    }
}
