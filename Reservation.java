import java.util.*;

public class Reservation 
{
   private int numberOfNights;
   private int numberOfPersons; 
   private int bookerID;
   private int roomID;
   
   public Reservation ()
   {
      this.numberOfNights = 0;
      this.numberOfPersons = 0;
      this.bookerID = 0;
      this.roomID = 0; 
   } 
   public Reservation (int numberOfNights, int numberOfPersons, int bookerID, int roomID)
   {
      this.numberOfNights = numberOfNights;
      this.numberOfPersons = numberOfPersons;
      this.bookerID = bookerID;
      this.roomID = roomID; 
   }
   
   public void setNumberOfNights (int numberOfNights) 
   {
      this.numberOfNights = numberOfNights;
   }
   
   public int getNumberOfNights ()
   {
      return numberOfNights;
   }
   
   public void setNumberOfPersons (int numberOfPersons)
   {
      this.numberOfPersons = numberOfPersons;
   }
   
   public int getNumberOfPersons ()
   {
      return numberOfPersons;
   }
   
   public void setBookerID (int bookerID)
   {
      this.bookerID = bookerID;
   }
   
   public int getBookerID ()
   {
      return bookerID;
   }
   
   public void setRoomID (int roomID)
   {
      this.roomID = roomID;
   }  
   
   public int getRoomID ()
   {
      return roomID;
   }
   
   Administration admin = new Administration();
   
   public boolean confirmReservation(int roomID)
   {
      for(int i = 0; i < admin.getListOfRooms().length; i++)
      { 
         
            if(admin.getListOfRooms()[i].iD == roomID)
            {
                  if(admin.getListOfRooms()[i].checkIsBooked() == true)         
                 {
                  return false;
                 }
                 else
                 {
                 return true;
               }
            }   
         
         
      }
      return false;
   }
   
   public double calculatePrice(Room room)
   {
       double price = getNumberOfNights() * room.getPricePerNight();
       
       return price;
   } 
   
   public boolean cancelReservation() 
   {
      boolean areYouSure = true;
      int valg = 0;
      Scanner scanner = new Scanner(System.in);
      while(areYouSure)
      {
         System.out.println("Er du sikker på du vil slette din reservation?");
         System.out.println("Tast et tal..");
         System.out.println("1: Ja, slet det lort!");
         System.out.println("0: Nej, jeg vil gerne beholde min reservation, jeg fatter ikke noget, sorry, forgive plz");
         //læs inputs fra keyboard - skanner.nextInt()
         valg = scanner.nextInt();
         System.out.println("Du har valgt " + valg);


      if (valg ==1)
      {
        System.out.println("Reservation er fjernet");
        return true;
      } 
      if (valg ==0) 
      {
         System.out.println("Reservationen er ikke slettet alligevel");
         return false;
      }
      }
      return false;
   }
}