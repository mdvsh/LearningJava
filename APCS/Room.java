//edX Course

/** PurdueX: CS180.3x 
 * AP Computer Science A: Java Programming Classes and Objects  */

 //Project 12: Hotel Reservations

public class Room{

    private int roomNumber;
    private int daysRented;
    private String roomType;
    private String occupantName;

    public Room(int rn, String rt){    //rn is room number rt is room type

        this.roomNumber = rn;
        roomType = rt;
        this.occupantName = null;
        daysRented = 0;
    }

    public int getRoomNumber(){return roomNumber;}
    public int getDaysRented(){return daysRented;}
    public String getRoomType(){return roomType;}
    public String getOccupantName(){return  occupantName;}

    public boolean setOccupant(String guestName, int days){
        if (this.getOccupantName() == null)
        return false;

        public void advanceDay(){
            daysRented = daysRented - 1;
            if (getDaysRented() <= 0 )
            occupantName = null;
            daysRented = 0;
        }
    }
}