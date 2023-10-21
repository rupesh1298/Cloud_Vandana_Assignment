package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Java_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s="LVIII";
           int romanToInt=0;
          ArrayList<Integer> l1=new ArrayList<Integer>();
           for(char c:s.toCharArray())
           {
        	  if(c=='I')
        		l1.add(1);  
        	  else if(c=='V')
        		l1.add(5); 
        	  else if(c=='X')
        		l1.add(10);
        	  else if(c=='L')
          		l1.add(50);
        	  else if(c=='C')
          		l1.add(100);
        	  else if(c=='D')
          		l1.add(500);
        	  else if(c=='M')
          		l1.add(1000);
           }
          for(int i=0;i<l1.size();i++)
          {
        	  for(int j=i+1;j<l1.size();j++)
        	  {
        		  if(l1.get(i)>=l1.get(j))
        		  {
        			  //System.out.println("addition "+(i)+" "+(j));
        			  romanToInt+=l1.get(i);
        			  break;
        			  
        		  }
        		 if(l1.get(i)<l1.get(j))
        		  {
        			 //System.out.println("substa "+l1.get(i)+" "+l1.get(j));
        			  romanToInt-=l1.get(i);
        			  
        		  }
        	  }
          }
          romanToInt+=l1.get(l1.size()-1);
          System.out.println(romanToInt);
	}

}
