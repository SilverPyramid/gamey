
import javax.swing.JOptionPane;
import java.util.Random;

public class king extends mainClass {
    
    String name;
    int ageY;
    int ageM;
    int speed;
    int level;
    double xp;
    int xpMax;
    int hpMax;
    int hpCur;
    
    Random r = new Random();
    
    public void setName(String x){
        name = x;
        ageY = 18;
        ageM = 0;
        level = 10;
        xp = 0;
        xpMax = 1000;
        hpMax = 100;
        hpCur = 100;
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
    
    public void train(int days){
        double xpGain = days * 1.5;
        xp = xp + xpGain;
        if(xp >= xpMax){
            xp = xp - xpMax;
            level = level++;
            hpMax = hpMax + 10;
            hpCur = hpCur + 10;
            
            JOptionPane.showMessageDialog(null, "Name: " + name
            + "\nAge: " + ageY
            + "\nLevel " + level
            + "\nXP " + xp + "/" + xpMax
            + "\nHP " + hpCur + "/" + hpMax
            + "\nSpeed " + speed);
            //please dont leave this like this
            //theres gotta be a better way
        }
    }
    
    public void levelUp(){
        xp = xp - xpMax;
        level = level++;
        hpMax = hpMax + 10;
        hpCur = hpCur + 10;
    }
}