package psoop;

class Date{
    int year;
    int month;
    int date;
    int hrs;
    int min;
    int sec;

    Date(){
        year = 2000;
        month = 1;
        date = 1;
        hrs = 0;
        min = 0;
        sec = 0;
    }

    void setDate(int year, int month, int date){
        this.year = year;
        this.month = month;
        this.date = date;
    }
    void setDate(int year, int month, int date, int hrs, int min){
        this.year = year;
        this.month = month;
        this.date = date;
        this.hrs = hrs;
        this.min = min;
    }
    void setDate(int year, int month, int date, int hrs, int min, int sec){
        this.year = year;
        this.month = month;
        this.date = date;
        this.hrs = hrs;
        this.min = min;
        this.sec = sec;
    }

    void display(){
        System.out.println("Date: "+date+"/"+month+"/"+year);
        System.out.println("Time: "+hrs+":"+min+":"+sec);
    
    }

}

public class que4_1 {
    public static  void main(String[] args){
        Date d = new Date();
        d.display();
        d.setDate(2021, 9, 10);
        d.display();
        d.setDate(2021, 9, 10, 10, 30);
        d.display();
        d.setDate(2021, 9, 10, 10, 30, 45);
        d.display();
    }
}
