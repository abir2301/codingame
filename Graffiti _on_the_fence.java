import java.util.*;
import java.io.*;
import java.math.*;
import java.util.Comparator;

class Interval {
    public  int start , end ; 
    public Interval(int start ,  int end ){
       this.start =start ;
       this.end=end  ;
    }
}
class Solution {

    public static   ArrayList<Interval>  mergeIntervall (Interval[] painted){
       Arrays.sort(painted,new Comparator<Interval>(){
            public int compare(Interval i1,Interval i2)
            {
                return i1.start - i2.start;
            }
        });
         ArrayList<Interval> result = new ArrayList<Interval>();
         int index = 0; 
     
        for (int i=1; i<painted.length; i++) 
        { 
            if (painted[index].end >=  painted[i].start) 
            { 
                painted[index].end = Math.max(painted[index].end, painted[i].end); 
            } 
            else {
                index++;
                painted[index] = painted[i]; 
            }    
        }
         for (int i = 0; i <= index; i++) 
        {
           result.add(painted[i]);
        }
        return result ;
    }
    public static void displayArrayl(ArrayList<Interval> painted){
         for (int m = 0; m < painted.size(); m++) 
        {
            System.out.println( painted.get(m).start + " " 
                                        +painted.get(m).end ); 
        }

    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int N = in.nextInt();
        Interval painted[] =   new Interval [N];
        for (int i = 0; i < N; i++) {
            int st = in.nextInt();
            int ed = in.nextInt();
            
            Interval vl = new Interval(st,ed);
            painted[i] = vl ; 
        }
          ArrayList<Interval> pp = new ArrayList<Interval>();
           ArrayList<Interval> up = new ArrayList<Interval>();
        pp = mergeIntervall(painted) ;
        
        
        
         
       if( (pp.size() == 1) && ((pp.get(0).end ==L ) && (pp.get(0).start ==0 ))){
        System.out.println("All painted");

       }
       else {
       Interval i1= pp.get(0);
       Interval i2=pp.get(pp.size() -1) ;
       ArrayList<Interval> result = new ArrayList<Interval>();
       int i =0;
       if (i1.start >0){
        result.add( new Interval(0,i1.start)) ;
     
       }
       for (int j = 0; j < pp.size()-1; j++) {
      
          result.add( new Interval(pp.get(j).end,pp.get(j+1).start)) ;
         
       }

       if (i2.end< L){
   
          result.add( new Interval(i2.end,L)) ;
       }
       Interval unpainted[] = new Interval[result.size()];

     
     for (int k= 0 ; k < result.size(); k++) 
        {
            unpainted[k] = result.get(k);
        }
        up= mergeIntervall(unpainted) ;
        displayArrayl(up);
        
    }}
}