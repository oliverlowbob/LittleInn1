public class Room
{
   double size;
   double pricePerNight;
   int iD;
   int bed;
   boolean isBooked; 
   int maxPersons;
   
   public Room ()
   {
         this.size = 0.0;          
         this.iD = 0;
         this.bed = 0;
         this.maxPersons = 0;
         this.pricePerNight = 0.0;
         this.isBooked = false; 
   }
   
   public Room (double size,int id,int bed,int maxPersons,double pricePerNight,boolean isBooked)
   {
         this.size = size;
         this.iD = id;
         this.bed = bed;
         this.maxPersons = maxPersons;
         this.pricePerNight = pricePerNight;
         this.isBooked = isBooked; 
   } 
   public void setSize (double size)
   {
      this.size = size;
   }
   public double getSize ()
   {
      return size;
   }
   
   public void setPrice (double price)
   {
      this.pricePerNight = price;
   }
   
   public double getPricePerNight ()
   {
      return pricePerNight;
   }
   
   public void setID (int iD)
   {
      this.iD = iD;
   }
   
   public int getiD ()
   {
      return iD;
   }
   public void setBed (int bed)
   {
      this.bed = bed;
   }
   public int getBed ()
   {
      return bed;
   }
   
   public boolean equals(Room room)
   {
      if (getiD() == room.getiD())
      {
         System.out.println("Det er samme rum!");
         return true;
      }   
      else if (getiD() !=room.getiD())
      {
         System.out.println("Rummet er ikke ens.");
         return false;
      }
      
      else 
      {
         System.out.println("Vi burde ikke komme hertil...");
         return false;
      }
   }
     
    
   public void setMaxPersons (int maxPersons)
   {
      this.maxPersons = maxPersons;
   }
   public int getMaxPersons()  
   {
      return maxPersons;
   }

  public String toString()
    { 
      String resultat = "\t Størelse: " + getSize() + "\n\t Pris pr nat: " + getPricePerNight() + "\n\t ID på Rum: " + getiD()
      + "\n\t antal senge: " + getBed() + "\n\t Antal max gæster: " + getMaxPersons();
      
      return resultat;
    }
   
   
 public void setIsBooked(boolean booked)
 {
   this.isBooked = booked;
 }
 
 public boolean getIsBooked()
 {
   return isBooked;
 }

}