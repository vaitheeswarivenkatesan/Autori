import java.util.*;

public class Autori{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String k=sc.nextLine();
    String n="";
    char s=k.charAt(0);
    n=n+s;
    for(int i=1;i<k.length();i++){
      s=k.charAt(i);
      if(s=='-'){
        n=n+k.charAt(i+1);
      }
    }
    System.out.println(n);
  }
}
