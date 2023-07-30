import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        ArrayList<Integer> temperature = new ArrayList<>() ; 
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); 
            temperature.add(t);// a temperature expressed as an integer ranging from -273 to 5526
        }

        if (temperature.size()==0){
              System.out.println("0");
        }
        else {
        int min = Math.abs(temperature.get(0));
        for (int t : temperature){
            if ( Math.abs(min) > Math.abs(t)){
                min = (t) ; 
            }

        if ( Math.abs(min) == Math.abs(t)){
                min = Math.max(t,min) ; 
            }

        }

        System.out.println(min);
    }}
}