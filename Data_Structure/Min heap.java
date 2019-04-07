/*package whatever //do not write package name here */

import java.util.*;

class MinHeap
{
    int size,heapSize;
    int[] array;
    MinHeap(int n)
    {
        size=n;
        array=new int[n];
        heapSize=0;
    }
    int parent(int n)
    {
        return (n-1)/2;
    }
    int left(int n)
    {
        return (n*2)+1;
    }
    int right(int n)
    {
        return (n*2)+2;
    }
    void insertKey(int data)
    {
        if(heapSize==size)
        {
            System.out.println("Overflows");
        }
        int i=heapSize;
        array[i]=data;
        heapSize++;
        while(i!=0 && array[parent(i)]>array[i])
        {
            swap(parent(i),i);
            i=parent(i);
        }
    }
    void swap(int a,int b)
    {
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
    int exMin()
    {
        if(heapSize==0)
        {
            return -1;
        }
        if(heapSize==1)
        {
            heapSize--;
            return array[0];
        }
        int temp=array[0];
        int i=heapSize-1;
        heapSize--;
        array[0]=array[i];
        heapiFy(0);
        return temp;
    }
    void decKey(int key,int min)
    {
        array[key]=min;
        int i=key;
        while(i!=0 && array[parent(i)]>array[i])
        {
            swap(parent(i),i);
            i=parent(i);
        }
    }
    void deleteKey(int key)
    {
        decKey(key,Integer.MIN_VALUE);
        exMin();
    }
    void heapiFy(int i)
    {
        int l=left(i);
        int r=right(i);
        int small=i;
        if(l<heapSize&&array[l]<array[small])
        {
            small=l;
        }
        if(r<heapSize&&array[r]<array[small])
        {
            small=r;
        }
        if(small!=i)
        {
        swap(small,i);
        heapiFy(small);
        }
    }
    void printArray()
    {
        for(int i=0;i<heapSize;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    MinHeap o=new MinHeap(6);
	    o.insertKey(sc.nextInt());
	    o.insertKey(sc.nextInt());
	    o.insertKey(sc.nextInt());
	    o.insertKey(sc.nextInt());
	    o.insertKey(sc.nextInt());
	    o.insertKey(sc.nextInt());
	    o.printArray();
	    o.exMin();
	    o.printArray();
	    o.decKey(3,30);
	    o.printArray();
	    o.deleteKey(3);
	    o.printArray();
	}
}
