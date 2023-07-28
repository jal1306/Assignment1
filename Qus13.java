// 13  Write a JAVA program to find the largest word in a given string. 

import java.util.*;
public class Qus13   
{   
  public static void main(String[] args)
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("enter string:- ");
      String str = sc.nextLine();
      String word = "", large="";    
      String[] words = new String[100];    
      int length = 0;    
      str = str + " ";    
          
      for(int i = 0; i < str.length(); i++)
	  {    
          if(str.charAt(i) != ' ')
		  {    
              word = word + str.charAt(i);    
          }    
          else
		  { 
              words[length] = word;       
              length++;        
              word = "";    
          }    
      }            
    
      large = words[0];    
          
          
      for(int k = 0; k < length; k++)
	  { 
          if(large.length() < words[k].length())
		  {		  
              large = words[k];   
		  }			  
      }      
      System.out.println("Largest word: " + large);    
  }  }  