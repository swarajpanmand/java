package psoop;



class Cow{
    String name;
    int id;
    int dob;
    int recentCalving;
    double totalMilk;
    int numberMilking;

    Cow(String name, int id, int dob, int recentCalving){
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.recentCalving = recentCalving;
        this.totalMilk = 0;
        this.numberMilking = 0;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setDob(int dob){
        this.dob = dob;
    }
    public void setRecentCalving(int recentCalving){
        this.recentCalving = recentCalving;
    }  
    public void setTotalMilk(double totalMilk){
        this.totalMilk = totalMilk;
    }
    public void setNumberMilking(int numberMilking){
        this.numberMilking = numberMilking;
    }
    public String getName(){
        return this.name;
    } 
    public int getId(){
        return this.id;
    }
    public int getDob(){
        return this.dob;
    }
    public int getRecentCalving(){
        return this.recentCalving;
    }
    public double getTotalMilk(){
        return this.totalMilk;
    }
    public int getNumberMilking(){
        return this.numberMilking;
    }

    public void addMilk(double milk){
        this.totalMilk += milk;
    }
    public double getAveraeMilking(){
        return this.totalMilk/this.numberMilking;
    }
    public void reset(){
        this.totalMilk = 0;
        this.numberMilking = 0;
    }

}

public class que1 {
    public static void main(String args[]){
        Cow c = new Cow("cow1", 0, 14, 2);
        c.addMilk(56);
        c.setNumberMilking(5);
        System.out.println(c.getAveraeMilking());
    }
}