import java.util.Scanner;
public class TasaDeCambio {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d,moneda,pd, pf,eur,mo2;
        System.out.println("\t<<<<Conversion de dolares a pesos>>>>");
        System.out.println("Ingrese la cantidad de dolares");// dolares a pesos
        d=sc.nextInt();
        pd=(double) (d*53.93);
       System.out.println(d + " dolares es igual a " + pd + " pesos");
       //------------------------------------------------------------------------
       //------------------------------------------------------------------------
       //-----------------------------------------------------------------------
  System.out.println("\t<<<<Conversion de pesos a dolares>>>>");
System.out.println("Ingrese la cantidad de pesos"); //pesos a dolares

        moneda=sc.nextInt();
        pf=(double) (moneda*0.019);
       System.out.println(moneda + " pesos es igual a " + pf + " Dolares");
       
        //------------------------------------------------------------------------
       //------------------------------------------------------------------------
       //-----------------------------------------------------------------------
System.out.println("\t<<<<Conversion Euros a Pesos>>>>");
System.out.println("Ingrese la cantidad de Euro");   //euro a pesos

        eur=sc.nextInt();
        mo2=(double) (eur*58.64);
       System.out.println(eur + " pesos es igual a " + mo2 + " Dolares");
       
        //------------------------------------------------------------------------
       //------------------------------------------------------------------------
       //-----------------------------------------------------------------------
System.out.println("\t<<<<Conversion de pesos a Euro>>>>");
System.out.println("Ingrese la cantidad de pesos"); //pesos  a euro

        moneda=sc.nextInt();
        pf=(double) (moneda*0.017);
       System.out.println(moneda + " pesos es igual a " + pf + " Euros");
       
        //------------------------------------------------------------------------
       //------------------------------------------------------------------------
       //-----------------------------------------------------------------------

System.out.println("\t<<<<Conversion de Dolares a Euro>>>>");
  System.out.println("Ingrese la cantidad de dolares");// dolares a Euro
        d=sc.nextInt();
        pd=(double) (d*0.92);
       System.out.println(d + " dolares es igual a " + pd + " Euros");
       
        //------------------------------------------------------------------------
       //------------------------------------------------------------------------
       //-----------------------------------------------------------------------
       System.out.println("\t<<<<Conversion de Euro a Dolar>>>>");
System.out.println("Ingrese la cantidad de Euro");   //euro a dolar

        eur=sc.nextInt();
        mo2=(double) (eur*1.09);
       System.out.println(eur + " Euro es igual a " + mo2 + " Dolares");


     }
} 
