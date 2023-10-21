package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Java_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {1,2,3,4,5,6,7};
       int shuffle[]=new int [arr.length];
    for(int i=0;i<arr.length;i++)
    {
    	shuffle[i]=arr[i];
    }
    for(int i=shuffle.length-1;i>0;i--)
    {
    	int j=(int)Math.floor(Math.random()*(i+1));
    	int temp=shuffle[i];
    	shuffle[i]=shuffle[j];
    	shuffle[j]=temp;
    }
    for(int i:shuffle)
    	System.out.println(i);
	}

}
