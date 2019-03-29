/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    PriorityQueue<String>q=new PriorityQueue<>();
	    q.add("ram");
	    q.add("rahim");
	    q.add("ravi");
	    q.add("raj");
	    Iterator<String>itr1=q.iterator();
	    while(itr1.hasNext())
	    {
	        System.out.println(itr1.next());
	    }
	    System.out.println("Peek element:"+q.peek()+" "+q.isEmpty());
	    q.poll();
	    Iterator<String>itr2=q.iterator();
	    while(itr2.hasNext())
	    {
	        System.out.println(itr2.next());
	    }
	    if(q.contains("ram"))
	    {
	        q.remove("ram");
	    }
	    Iterator<String>itr3=q.iterator();
	    while(itr3.hasNext())
	    {
	        System.out.println(itr3.next());
	    }
	}
}
