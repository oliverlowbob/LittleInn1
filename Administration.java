public class Administration

{
   // kan også laves static, hvis i kun har én administration så betyder det ikke noget
   int indexCounter =0;

   private Guest guest;
   //sætter max antal gæster til 100. Dum idé i den virkelige verden, da vi gerne vil have uendelige gæster.
   private int ANTAL_GÆSTER = 100;
   
   private Guest[] myGuests;
   
   private Reservation[] myReservations;
   
   private Room[] myRooms;
   
   private int currentReservations = 0;
   // den kører i et evigheds loop 
   public Administration()
   {
      this.myGuests = new Guest[ANTAL_GÆSTER];
      this.myRooms = new Room[4];
      this.myReservations = new Reservation[100];
      listOfGuests();
      listOfRooms();
      listOfReservations();
   }
   
   public Guest[] getListOfGuests()
   {
      return myGuests;
   }
   
   public Room[] getListOfRooms()
   {
      return myRooms;
   }
      
   public Reservation[] getListOfReservation()
   {
      return myReservations;
   }
   
   public void setGuest(Guest guest)
   {
      this.guest = guest;
   }
   
   public Guest getGuest(int i)
   {
      return this.myGuests[i];
   }
  
    public void addGuests(Guest guest, int index)
    {
      myGuests[index] = guest;
    }
    
   
   public void listOfGuests()
   {
      addGuests(new Guest(1, "Gunnar Hansen", "73181416", "Parken 1, 2100 Kbh", "supergunnar@ups.dk"), 0);
      addGuests(new Guest(2, "Bo Larsen", "98238419", "Svinget 15, 7330 Brande", "minmail@larsen.dk"), 1);
      addGuests(new Guest(3, "Hilda Hildegard", "+3129590321", "Strasse 43, 43102 Hamburg", "ichbineinberliner@auto.de"), 2);
      addGuests(new Guest(4, "Mona Fuglbjerg", "30229503", "Bjergvej 109, 6320 Silkeborg", "mofu@amail.com"), 3);
   }
   
    public void addRooms(Room room, int index)
    {
      myRooms[index] = room;
    }
   
   public void listOfRooms()
   {
      addRooms(new Room(12., 1, 2, 4, 500., true), 0);
      addRooms(new Room(15., 2, 3, 6, 750., false), 1);
      addRooms(new Room(25., 3, 5, 10, 1500., false), 2);
      addRooms(new Room(5., 4, 1, 2, 200., false), 3);
   }
   
   public void addReservation(Reservation reservation, int indexCounter)
    {
      myReservations[indexCounter] = reservation;
      indexCounter++;
    }
    
    public void listOfReservations()
    {
      addReservation(new Reservation(3, 2, 1, 1), 0);
    
      /*Reservation res = new Reservation(3, 2, 1, 1);
      addReservation(res); */ 
    }
    
   
    public void printGuests()
   {
      for(int i=0; i<5; i++)
      {
      System.out.println(myGuests[i]);
      }
   }
   
   

 
}