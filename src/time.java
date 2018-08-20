
import javax.swing.JOptionPane;
import java.util.Random;

public class time {
    int day = 0;
    int dayMax = 0;
    String month = "";
    int year = 0;
    Random r = new Random();
    
    public void showDate(){
        JOptionPane.showMessageDialog(null, "The date is" + month + " " + day + ", " + year + " AD");
    }
    public void setDate(){
        int x = r.nextInt(12) + 1;
        switch(x){
            case 1:{
                month = "Jan";
                dayMax = 31;
                break;
            }
            case 2:{
                month = "Feb";
                dayMax = 28;
                break;
            }
            case 3:{
                month = "Mar";
                dayMax = 31;
                break;
            }
            case 4:{
                month = "Apr";
                dayMax = 30;
                break;
            }
            case 5:{
                month = "May";
                dayMax = 31;
                break;
            }
            case 6:{
                month = "June";
                dayMax = 30;
                break;
            }
            case 7:{
                month = "July";
                dayMax = 31;
                break;
            }
            case 8:{
                month = "Aug";
                dayMax = 31;
                break;
            }
            case 9:{
                month = "Sept";
                dayMax = 30;
                break;
            }
            case 10:{
                month = "Oct";
                dayMax = 31;
                break;
            }
            case 11:{
                month = "Nov";
                dayMax = 30;
                break;
            }
            case 12:{
                month = "Dec";
                dayMax = 31;
                break;
            }
            //ok this shit bananas and its gotta stop
        }
        day = r.nextInt(dayMax) + 1;
        year = r.nextInt(1499) + 401;
        
        JOptionPane.showMessageDialog(null, "The date is " + month + " " + day + ", " + year + " AD");
    }
    
    public void addDay(int days){
        day = day + days;
        while(day > dayMax){
            day = day - dayMax;
            
        }
        
    }
}
