
import javax.swing.JOptionPane;

public class heir {
    
    String name;
    int ageY;
    int ageM;
    int level;
    double xp;
    int xpMax;
    int hpMax;
    int hpCur;
    int speed;
    
    public void setName(String x){
        name = x;
        ageY = 0;
        ageM = 0;
        level = 1;
        xp = 0;
        xpMax = 100;
        hpMax = 10;
        hpCur = 10;
        speed = 30;
    }
    
    public void showStats(){
         JOptionPane.showMessageDialog(null, "Name: " + name
            + "\nAge: " + ageY
            + "\nLevel " + level
            + "\nXP " + xp + "/" + xpMax
            + "\nHP " + hpCur + "/" + hpMax
            + "\nSpeed " + speed);
    }
}
