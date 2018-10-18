public class Guest
{

   private String name;
   private String mail;
   private String phone;
   private String address;
   private int guestID;
   
   
   public Guest()
   {
      this.guestID = 0;
      this.name = "";
      this.phone = "";
      this.address = "";
      this.mail = "";
   }
   
   public Guest(int ID, String name, String phone, String address, String mail)
   {
      this.guestID = ID;
      this.name = name;
      this.phone = phone;
      this.address = address;
      this.mail = mail;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
   
   public String getName()
   {
      return this.name;
   }
   
   public void setMail(String mail)
   {
      this.mail = mail;
   }
   
   public String getMail()
   {
      return this.mail;
   }
   
   public void setPhone(String phone)
   {
      this.phone = phone;
   }
   
   public String getPhone()
   {
      return this.phone;
   }
   
   public void setAddress(String address)
   {
      this.address = address;
   }
   
   public String getAddress()
   {
      return this.address;
   }
   
   public void setID(int ID)
   {
      this.guestID = ID;
   }
   
   public int getID()
   {
      return this.guestID;
   }
   
   public boolean equals(Guest guest)
   {
       if (getID() == guest.getID())
      {
         System.out.println("Det er den samme gæst!");
         return true;
      }
       else if (getID() != guest.getID())
       {
        System.out.println("Gæsterne er ikke ens.");
         return false;
       }
      
            else
      {
         System.out.println("Vi burde ikke komme hertil...");
         return false;
      }
   }  
   
    
    public String toString()
    { 
      String resultat = "\tOplysninger på gæsten:\n\t Navn: " + getName() + "\n\t Adresse: " + getAddress() + "\n\t Telefonnummer: " + getPhone()
      + "\n\t Mail: " + getMail() + "\n\t Gæstens ID-nummer: " + getID();
      
      return resultat;
    }

   

}