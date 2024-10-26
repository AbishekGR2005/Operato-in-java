import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int houseworked=s.nextInt();
        int projectsCompleted=s.nextInt();
        int overtime=s.nextInt();
        int total=houseworked+overtime;
        if(total>160){
           if(projectsCompleted>5){
              System.out.println("Mark qualifies for a bonus.");
            }
        }
        else{
               System.out.println("Mark does not qualify for a bonus.");
        }
    }
}
