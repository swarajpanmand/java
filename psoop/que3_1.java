package psoop;

import java.util.*;

class que3_1{
    int marks;
    int courseWork;
    int aptitudeTest;
    int technicalInterview;
    int interview;

    public que3_1(int courseWork, int aptitudeTest , int technicalInterview , int interview){
        this.courseWork = courseWork;
        this.aptitudeTest = aptitudeTest;
        this.technicalInterview = technicalInterview;
        this.interview = interview;
        marks = courseWork + aptitudeTest + technicalInterview + interview;
    }

    que3_1(int technicalInterview, int interview)
    {
        this.technicalInterview = technicalInterview;
        this.interview = interview;
        marks = technicalInterview + interview;
    }
    que3_1(int interview){
        this.interview = interview;
        marks = interview;
        
    }

    void display(){
        System.out.println("Marks: "+marks);
    }

    void Posting(int courseWork , int aptitudeTest , int technicalInterview , int interview){
        if(marks > 80){
            System.out.println("Selected as Programmer");
        }
        else{
            System.out.println("Fuck off");
        }
    }

    void Posting(int technicalInterview, int interview){
        if(marks > 85){
            System.out.println("Selected as Team Leader");
        }
        else{
            System.out.println("Fuck off");
        }
    }
    
    void Posting(int interview){
        if(marks > 90){
            System.out.println("Selected as Project Manager");
        }
        else{
            System.out.println("Fuck off");
        }
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        int loopOut = 1;
        while(loopOut == 1){
            System.out.println("1.Programmer\n2.Team Leader\n3.Project Manager");
            int n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter the marks of course work: ");
                    int courseWork = sc.nextInt();
                    System.out.println("Enter the marks of aptitude test: ");
                    int aptitudeTest = sc.nextInt();
                    System.out.println("Enter the marks of technical interview: ");
                    int technicalInterview = sc.nextInt();
                    System.out.println("Enter the marks of interview: ");
                    int interview = sc.nextInt();
                    que3_1 e1 = new que3_1(courseWork, aptitudeTest, technicalInterview, interview);
                    e1.Posting(courseWork, aptitudeTest, technicalInterview, interview);
                    break;
                case 2:
                    System.out.println("Enter the marks of technical interview: ");
                    int technicalInterview1 = sc.nextInt();
                    System.out.println("Enter the marks of interview: ");
                    int interview1 = sc.nextInt();
                    que3_1 e2 = new que3_1(technicalInterview1, interview1);
                    e2.Posting(technicalInterview1, interview1);
                    break;
                case 3:
                    System.out.println("Enter the marks of interview: ");
                    int interview2 = sc.nextInt();
                    que3_1 e3 = new que3_1(interview2);
                    e3.Posting(interview2);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Do you want to continue? (1/0)");
            loopOut = sc.nextInt();
        }
    }
}
