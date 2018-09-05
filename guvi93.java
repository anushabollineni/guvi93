import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	 static int Celsius_to_Kelvin(int C)
 
	{
	   return (C + 273);
    }
     
    // Driver function
    public static void main (String[] args) 
    {
        // variable to hold the 
        // temperature in Celsius
        int C = 21;
     
        System .out.println ( "Temperature in Kelvin ( K ) = "
                             + Celsius_to_Kelvin(C));
             
    
	}
}
