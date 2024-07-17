import java.util.Scanner;

public class BIG {
    
    Scanner taste = new Scanner(System.in);
    
    public static void main(String [] args){
       
       double final_amount; 
        
      String y = pizza(" welcome to Andilecoius pizza shop /n feel welcome /n  menu  /n small:R30  /n  medium:R50  /n large:R60 "); 
        System.out.println(y);
      
        double div = 30;
        double ndiv =0;
        
        double top1 = 10.2;
        double top2 = 25.3;
        double top3 = 40;
        
         double small = 30;
         double medium = 50;
         double large = 60;
         System.out.println(" small:" + small);
         System.out.println(" medium:" + medium);
         System.out.println("large:" + large);
       
         
          Scanner taste = new Scanner(System.in);
         
          System.out.println(" enter the amount of the pizza your want to oder depending on the size " );
         double oder_for_pizza = taste.nextDouble();
       
         if(oder_for_pizza ==small){
             System.out.println(" pizza is more delicios with topping,check for the menu down the screen");
             System.out.println( " 1 topping =" + top1);
             System.out.println( " 2 topping =" + top2);
             System.out.println( " 3 topping =" + top3);
             
             System.out.println("enter the amount of the topping your want to buy");
             double top = taste.nextDouble();
                if(top==top1){
                    System.out.println(" dilivery menu check for your option");
                    System.out.println(" dilivery cash = " + div);
                    System.out.println(" no dilivery " + ndiv);

                    System.out.println(" enter the amount or dilivery");
                    double adiv =taste.nextDouble();
                         if(adiv==div){
                             final_amount = small + top1 + div;
                             System.out.println(" full amount pay = " + final_amount);
                         }else{
                             final_amount = small +top1 + ndiv;
                             System.out.println(" full amount pay = " + final_amount);
                         }
                }else if(top==top2){
                    System.out.println(" dilivery menu check for your option");
                    System.out.println(" dilivery cash = " + div);
                    System.out.println(" no dilivery " + ndiv);

                    System.out.println(" enter the amount or dilivery");
                    double adiv =taste.nextDouble();
                         if(adiv==div){
                             final_amount = small + top2 + div;
                             System.out.println(" full amount pay = " + final_amount);
                         }else{
                             final_amount = small +top2 + ndiv;
                             System.out.println(" full amount pay = " + final_amount);
                         }
                }else{
                    System.out.println(" dilivery menu check for your option");
                    System.out.println(" dilivery cash = " + div);
                    System.out.println(" no dilivery " + ndiv);

                    System.out.println(" enter the amount or dilivery");
                    double adiv =taste.nextDouble();
                         if(adiv==div){
                             final_amount = small + top3 + div;
                             System.out.println(" full amount pay = " + final_amount);
                         }else{
                             final_amount = small +top3 + ndiv;
                             System.out.println(" full amount pay = " + final_amount);
                         }
                } 
                         
                        
                        
                 
         }else if(oder_for_pizza==medium){
             
              System.out.println(" pizza is more delicios with topping,check for the menu down the screen");
             System.out.println( " 1 topping =" + top1);
             System.out.println( " 2 topping =" + top2);
             System.out.println( " 3 topping =" + top3);
             
             System.out.println("enter the amount of the topping your want to buy");
             double top = taste.nextDouble();
                if(top==top1){
                    System.out.println(" enter the amount or dilivery");
                    double adiv =taste.nextDouble();
                         if(adiv==div){
                             final_amount = medium + top1 + div;
                             System.out.println(" full amount pay = " + final_amount);
                         }else{
                             final_amount = medium +top1 + ndiv;
                             System.out.println(" full amount pay = " + final_amount);
                         }
                }else if(top==top2){
                    System.out.println(" enter the amount or dilivery");
                    double adiv =taste.nextDouble();
                         if(adiv==div){
                             final_amount = medium + top2 + div;
                             System.out.println(" full amount pay = " + final_amount);
                         }else{
                             final_amount = medium +top2 + ndiv;
                             System.out.println(" full amount pay = " + final_amount);
                         }
                }else{
                    System.out.println(" enter the amount or dilivery");
                    double adiv =taste.nextDouble();
                         if(adiv==div){
                             final_amount = medium + top3 + div;
                             System.out.println(" full amount pay = " + final_amount);
                         }else{
                             final_amount = medium +top3 + ndiv;
                             System.out.println(" full amount pay = " + final_amount);
                         }
                } 
             
             
         }else{
             
              System.out.println(" pizza is more delicios with topping,check for the menu down the screen");
             System.out.println( " 1 topping =" + top1);
             System.out.println( " 2 topping =" + top2);
             System.out.println( " 3 topping =" + top3);
             
             System.out.println("enter the amount of the topping your want to buy");
             double top = taste.nextDouble();
                if(top==top1){
                    System.out.println(" enter the amount or dilivery");
                    double adiv =taste.nextDouble();
                         if(adiv==div){
                             final_amount = large + top1 + div;
                             System.out.println(" full amount pay = " + final_amount);
                         }else{
                             final_amount = large +top1 + ndiv;
                             System.out.println(" full amount pay = " + final_amount);
                         }
                }else if(top==top2){
                    System.out.println(" enter the amount or dilivery");
                    double adiv =taste.nextDouble();
                         if(adiv==div){
                             final_amount = large + top2 + div;
                             System.out.println(" full amount pay = " + final_amount);
                         }else{
                             final_amount = large +top2 + ndiv;
                             System.out.println(" full amount pay = " + final_amount);
                         }
                }else{
                    System.out.println(" enter the amount or dilivery");
                    double adiv =taste.nextDouble();
                         if(adiv==div){
                             final_amount = large + top3 + div;
                             System.out.println(" full amount pay = " + final_amount);
                         }else{
                             final_amount = large +top3 + ndiv;
                             System.out.println(" full amount pay = " + final_amount);
                         }
                } 
         }
       
     }
   
    public static String pizza(String x){
       return x;
    }
  
}
 


