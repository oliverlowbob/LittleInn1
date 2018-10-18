import java.util.*;

public class Menu
{
   public static void runProgram()
   {
      //løkkevariabel
      boolean runProgram = true;
      int valg = 0;
      Scanner skanner = new Scanner(System.in);
      
      //Initiate administration, så arrays kører
      //Administration admin = new Administration();

      
      //while-løkke der bliver ved til runProgram er false
      while(runProgram)
      {
         //udskriv menu - System.out
          System.out.println("Menu");
          System.out.println("Tast et tal..");
          System.out.println("1: Reception");
          System.out.println("0: Afslut program");
         //læs inputs fra keyboard - skanner.nextInt()
         valg = skanner.nextInt();
         //find ud af hvad der blev valgt
         System.out.println("Du har valgt " + valg);
         if (valg == 1)
         {
            //kald reception
            Reception rec =   new Reception();
            //kald receptionsmenu
            rec.receptionsMenu();
            System.out.println("Du har valgt reception.");
         }
         
         else if (valg == 0)
         {
            //der er valgt 0, så programmet stopper
            System.out.println("Tak fordi du kørte programmet. Farvel!");
            runProgram = false;
         }
         else if (valg <0 || valg >1)
         {
            System.out.println("Vælg et tal mellem 0 og 1");
            runProgram = true;
         }
         else
         {
            System.out.println("Programmet burde ikke være kommet her til.");
            runProgram = false;
         }
      }
      
   }  
}