import java.util.*;
   
public class Reception
{
   private Room room;
   private Reservation reservation;
   //private Storage storage;
   Administration admin1;
   
   

   public void Reception(Room room, Reservation reservation)
   {  
      this.room = room;
      this.reservation = reservation;
      admin1 = new Administration();
      admin1.listOfGuests();
   }
   
   public void Reception()
   {
      this.room = room;
      this.reservation = reservation;
   }
   
   
   public void setRoom(Room room)
   {
      this.room = room;
   }
   
   public Room getRoom()
   {
      return this.room;
   }
   
   public void setReservation(Reservation reservation)
   {
      this.reservation = reservation;
   }
   
   public Reservation getReservation()
   {
      return this.reservation;
   }
   
   /*public void setStorage(Storage storage)
   {
      this.storage = storage;
   }
   
   public String getStorage()
   {
      return this.storage;
   }*/   
   
   /*double size,String id,int bed,int maxPersons,double pricePerNight,boolean isBooked
   Room room1 = new Room(12, "Room 1", 2, 4, 500, false);
   Room room2 = new Room(15, "Room 2", 3, 6, 750, false);
   Room room3 = new Room(25, "Room 3", 5, 10, 1500, false);
   Room room4 = new Room(5, "Room 4", 1, 2, 200, false);*/
   

  /* 
   public boolean  checkIsLow(boolean low)
   {
      if(low)
      {}
      return true;
   }
   */

   
public void receptionsMenu()
{   
   boolean runProgramRec = true;
   int valg = 0;
   Scanner scanner = new Scanner(System.in);
   int antalReservationer = 0;
   Administration admin = new Administration();
   
      while(runProgramRec)
      {
      System.out.println("Reception");
      System.out.println("Tast et tal..");
      System.out.println("1: Reserver et værelse");
      System.out.println("2: Afbestil et værelse");
      System.out.println("0: Gå tilbage til hovedmenu");
         //læs inputs fra keyboard - skanner.nextInt()
         valg = scanner.nextInt();
         //find ud af hvad der blev valgt
         System.out.println("Du har valgt " + valg);
         if (valg == 1)
         {
            //kald reception
            System.out.println("Hvor mange reservationer vil du lave?");
            antalReservationer = scanner.nextInt();
            for(int i = 0; i <antalReservationer; i++)
            {
               int j;
               System.out.println("Reservér et værelse. Hvor mange nætter?");
               int nights = scanner.nextInt();
               System.out.println("Hvor mange personer?");
               int persons = scanner.nextInt();
               System.out.println("Hvad er bookers ID?");
               int bookerID = scanner.nextInt();
               System.out.println("Hvilket rum?");
               int room = scanner.nextInt();
               admin.addReservation(new Reservation(nights, persons, bookerID, room), admin.myReservations[j]);
               j++;
               
               
               
               //virker ikke!!
               //vores problem er, at vi ikke ved hvordan vi opretter en ny booking og putter det i vores listOfReservations
               //og hvordan vi sætter indexet i addReservations til at tælle op hver gang der kommer en ny reservation.
              // admin.addReservation(new Reservation(nights, persons, bookerID, room), admin.myReservations[i]);
              
              //Det er løst med in indexCounter i adminstration
            }
 
           
            
            
            //Bekræft reservation
            //virker ikke!! Den skal kunne sige om det rum, man forsøger at reservere allerede er booket
            /*if(admin.listOfReservations().confirmReservation(listOfReservations()).getRoomID()) == false)
            {
               System.out.println("Værelset kan reserveres");
            }
            else
            {
                System.out.println("Værelset er allerede reserveret");
            }
            
         }
         
         if (valg == 2)
         {*/
         // hvordan får vi annulleret noget fra vores array af reservationer? 
           // Reservation res = new Reservation(2, 2, 1337, 1);
            //res.cancelReservation();
            runProgramRec = false;
         }
         
         else if (valg == 0)
         {
            //der er valgt 0, så programmet stopper
            System.out.println("Går tilbage til menu");
            runProgramRec = false;
         }
         else if (valg < 0 || valg > 2)
         {
            System.out.println("Du skal vælge et af de givne tal");
            runProgramRec = true;
         }
         else
         {
            System.out.println("Du burde ikke være her.");
            runProgramRec = true;
         }
      }
}
   public boolean isBooked (int roomId)
   {
      boolean booked = false;
      Reservation[] resList = admin1.getListOfReservation();
     
      for(int i = 0; i <resList.length; i++)
      {
         int id = resList[i].getRoomID();
     
         if (roomId == id)
         {  booked = true;
            break;
         }
         else
         { booked = false;   }
      } 
      return booked;
   }
   
   public boolean equals(Reception reception)
   {
      boolean isIdentical;
      
      isIdentical = false;
      
      if (reception.equals(this))
         {
         System.out.println("De er ens");
         return true;
         } 
      System.out.println("De er ikke ens");
      return false;
    }
    
    public String toString()
    {
      String result = "\tDette er en reception";
      return result;
    }  

}