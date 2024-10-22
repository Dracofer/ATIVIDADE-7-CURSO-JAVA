import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double x;

    x = sc.nextDouble();

    if(x <= -1){
      System.out.println("NEGATIVO");
    }else{
      System.out.println("NAO NEGATIVO");
    }

    sc.close();
  }

}