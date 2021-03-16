//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Carolyn Savas

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
 private Queue<String> queue;
 private Stack<String> stack;
 
 public PalinList()
 {
  setList("");
 }

 public PalinList(String list)
 {
   setList(list);
 }

 public void setList(String list)
 {
   queue = new LinkedList<String>();
   stack = new Stack<String>();
   String[] l = list.split(" ");
   for(String s : l){
     queue.add(s);
     stack.add(s);
   }
 }

 public boolean isPalin()
 {
   for(int i=0; i <= queue.size(); i++){
     if(!queue.remove().equals(stack.pop())){
       return false;
     }
   }
  return true;
 }
 //write a toString method
 public String toString() {
   String out ="";
   if(isPalin()){
     out+= " is a palinlist.";
   }
   else{
     out+= " is not a palinlist.";
   }
   return stack.toString() + out;
 }
}