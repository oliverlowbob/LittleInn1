import java.util.*;

public class Menu
{
   public static void runProgram()
   {
      //l�kkevariabel
      boolean runProgram = true;
      int valg = 0;
      Scanner skanner = new Scanner(System.in);
      
      //Initiate administration, s� arrays k�rer
      //Administration admin = new Administration();

      
      //while-l�kke der bliver ved til runProgram er false
      while(runProgram)
      {
         //udskriv menu - System.out
          System.out.println("Menu");
          System.out.println("Tast et tal..");
          System.out.println("1: Reception");
          System.out.println("0: Afslut program");
         //l�s inputs fra keyboard - skanner.nextInt()
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
            //der er valgt 0, s� programmet stopper
            System.out.println("Tak fordi du k�rte programmet. Farvel!");
            runProgram = false;
         }
         else if (valg <0 || valg >1)
         {
            System.out.println("V�lg et tal mellem 0 og 1");
            runProgram = true;
         }
         else
         {
            System.out.println("Programmet burde ikke v�re kommet her til.");
            runProgram = false;
         }
      }
      
   }  
}