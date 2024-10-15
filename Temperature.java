import java.util.*;
public class Temperature {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("           **** TEMPERATUTE CONVERTER ****       ");
      System.out.println();
      System.out.println(" Enter temperature in °C  ");
      float cel = sc.nextFloat();
      System.out.println(" 1.KELVIN   2.FAHERENHIT    3.RANKINE   4.REAUMUR ");
      System.out.println(" Enter an option from above in whitch format you want to  convert your temperature");  
      int option = sc.nextInt();


      if(option==1){
          float KELVIN = cel + 273.15f;
          System.out.println( cel + "°C = "+ KELVIN + "k" );
      }
      else if (option==2){
          float fah = (cel*(9/5f))+32;
          System.out.println( cel + "°C = "+ fah+ "°F" );
      }
      else if (option==3){
        float ran = (cel*(9/5f))+419.67f;
        System.out.println( cel + "°C = "+ ran+ "R" );
    }
    else if (option==4){
        float rea = (cel*4)/5;
        System.out.println( cel + "°C = "+ rea+ "Reaumur" );
    }
    else{
        System.out.println( " Wrong option Entered");
    }

  }  
}
