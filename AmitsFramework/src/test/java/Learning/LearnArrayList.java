package Learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Anonymous;

public class LearnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String> alist = new ArrayList<String>();
    alist.add("amit");
    alist.add("sumit");
    alist.add("harshit");
    alist.add("bhavy");
    alist.add("minu");
    int minuposition=alist.indexOf("minu");
    System.out.println("position of minus is  " +minuposition);
    String value_is=alist.get(1);
   int arraylistSize= alist.size();
   System.out.println("Size of Arralist is " +arraylistSize);
    System.out.println("valud of index is " +value_is);

    System.out.println("List output is " +alist);
    for(String str:alist){
 	   System.out.println(str);
    }
   alist.add(2,"lokesh");
   alist.add(5,"sonu");
   System.out.println("After Add more List output is " +alist);
   for(String str:alist){
	   System.out.println(str);
   }
   alist.remove("amit");
   alist.remove(2);
   System.out.println("After remove List output is " +alist);
   
   for(String str:alist){
	   System.out.println(str);
   }
   System.out.println("======for loop started========");
   //array list for loop
   for(int count=0;count<alist.size();count++){
	   System.out.println(alist.get(count));
   }
   System.out.println("======for reverse loop started========");
   //reverse the array list
   for(int item= alist.size()-1; item>=0; item--){
	   System.out.println(alist.get(item));
   }
   System.out.println("======for  while reverse loop started========");
   int count=alist.size()-1;
   while (count>=0) {

	System.out.println(alist.get(count));
	count--;
	
}
   
   	Collections.sort(alist,Collections.reverseOrder());
	System.out.println("Array Sorted in descending");
	
   System.out.println("======for  while loop started========");
   int count1=0;
   while (count1<alist.size()) {

	System.out.println(alist.get(count1));
	count1++;
}
   //Dirctly add item in the Arraylist wihtout the Add() function
   ArrayList<String> obj = new ArrayList<String>(
			Arrays.asList("Pratap", "Peter", "Harsh"));
		  System.out.println("Elements are:"+obj);
		  LearnArrayList  anony= new LearnArrayList();
		  anony.anonymousMethod();
	} 
 public void anonymousMethod(){
		  ArrayList<String> obj1 = new ArrayList<String>(){{
			add("amit");
			add("sumit");
		  }};
		  System.out.println("Using Anonymous inner calls method " +obj1);
    

	}
}



