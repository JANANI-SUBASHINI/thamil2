# thamil2
import java.io.*;
import java.util.*;
public class Hoilday {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the day");
    String day=sc.next();
    String a=day.toLowerCase();
    if(a.equals("monday")||a.equals("tuesday")||a.equals("wednesday")||a.equals("thursday")||a.equals("friday")||a.equals("saturday")){
      System.out.println("true");
    }
    else if(a.equals("sunday")){
      System.out.println("false");
    }
    else{
      System.out.println("Invalid");
      sc.close();
    }
    
  }
  
}
