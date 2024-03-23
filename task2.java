import java.util.Scanner;
class student
{
    String name;
    int sub1;
    int sub2;
    int sub3;

    public student(String name, int sub1, int sub2, int sub3)
    { 
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    int totalMarks(){
        return (sub1 + sub2 +sub3);
        
    }

    


    double percentage(){
        return ((double)totalMarks()/300)*100;
    }

    void checkpassFail(){
        if(percentage()>30){
            System.out.println("passssss");

            if(percentage()>90){
                System.out.println("A+");
        
            }
            else if(percentage()<90 && percentage()>80){
                System.out.println("A");
            }
            else if(percentage()<80 && percentage()>70){
                System.out.println("B+");

            }
            else if(percentage()<70 && percentage()>60){
                System.out.println("B");
            }
            else if(percentage()<60 && percentage()>50){
                System.out.println("C");
            }
            else if(percentage()<50 && percentage()>40)
            {
                System.out.println("D");
            }
            else if(percentage()<40 && percentage()>30)
            {
                System.out.println("E");
            }
        }
        else
        {
            System.out.println("Failll");

        }
    }
    
}
class info{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("enter your name :");
        String name = sc.next();

        System.out.println("marks in subject 1");
        int sub1 = sc.nextInt();

        System.out.println("marks in subject 2:");
        int sub2 = sc.nextInt();

        System.out.println("marks in subject 3:");
        int sub3 = sc.nextInt();

        

        student s = new student(name, sub1, sub2, sub3);

        System.out.println("Total marks:" + s.totalMarks());
        System.out.println("Percentage:" + s.percentage());
        s.checkpassFail();
            
    
        
    

        
                
        
    
        
    
    }
}