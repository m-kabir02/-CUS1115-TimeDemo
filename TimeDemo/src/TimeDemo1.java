/*
 Create 2 integer variables called hrs and minutes
 Assign the hrs to be 10
 assign minutes to be 30
 You will create an output statement to say
 The class ends at 10:30AM using the variables assigned above.
 
 Now 3 new variables month day and year as intefers
 Assign month to be 8
 Assign day to be 8
 Assign year to be 2021
 Output the following using the variables
 Today is 2/8/2021
 
 
 */
public class TimeDemo1 {
    public static void main(String[] args)
    {
        int hours, mins; //declaration
        hours=10;		//assignment
        mins=30;		//assignment

        System.out.println("The class ends at "+hours+":"+mins+"AM");
        int month, day, year; //declaration
        month=2;			  //assignment
        day=8;				  //assignment
        year=2021;			  //assignment
        System.out.println("Today is "+month+"/"+day+"/"+year);
    }
}

/*
The class ends at 10:30AM
Today is 2/8/2021
*/