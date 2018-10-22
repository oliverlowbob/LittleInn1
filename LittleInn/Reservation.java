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
   
   
   Scanner scanner = new Scanner(System.in);
   
  /* public boolean confirmReservation(int roomID)
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
   */
   
   public double calculatePrice(Room room)
   {
       double price = getNumberOfNights() * room.getPricePerNight();
       
       return price;
   } 
   
   }