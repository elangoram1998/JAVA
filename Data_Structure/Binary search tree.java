/*package whatever //do not write package name here */

import java.util.*;

class Binary
{
    int data;
    Binary left,right;
    Binary(int a)
    {
        data=a;
        left=null;
        right=null;
    }
}
class Que
{
    int data;
    Binary node;
    Que(int a,Binary n)
    {
        data=a;
        node=n;
    }
}
class GFG {
    static Binary root;
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    root=new Binary(sc.nextInt());
	    while(true)
	    {
	        switch(sc.nextInt())
	        {
	            case 1:
	                insertNode(root,sc.nextInt());
	                break;
	            case 2:
	                preOrder(root);
	                System.out.println();
	                break;
	            case 3:
	                inOrder(root);
	                System.out.println();
	                break;
	            case 4:
	                postOrder(root);
	                System.out.println();
	                break;
	            case 5:
	                System.out.println("Height:"+height(root));
	                break;
	            case 6:
	                root=deleteNode(root,sc.nextInt());
	                break;
	            case 7:
	                levelOrder();
	                System.out.println();
	                break;
	            case 8:
	                int n1=sc.nextInt();
	                int n2=sc.nextInt();
	                System.out.println(lca(root,n1,n2));
	                break;
	            case 9:
	                topView(root);
	                System.out.println();
	                break;
	            case 10:
	                if(isBST(root))
	                {
	                    System.out.println("YES");
	                }
	                else{
	                    System.out.println("NO");
	                }
	                break;
	            default:
	                System.exit(0);
	        }
	    }
	}
	static boolean isBST(Binary temp)
	{
	    return checkBST(temp,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	static boolean checkBST(Binary temp,int min,int max)
	{
	    if(temp==null)
        {
            return true;
        }
        if(temp.data<min||temp.data>max)
            {
            return false;
            }
        return (checkBST(temp.left,min,temp.data-1)&&checkBST(temp.right,temp.data+1,max));
	}
	static void topView(Binary temp)
	{
	    Queue<Que>q=new LinkedList<>();
	    HashMap<Integer,Binary>hm=new HashMap<>();
	    if(temp==null)
	    {
	        return;
	    }
	    q.add(new Que(0,temp));
	    while(!q.isEmpty())
	    {
	        Que n=q.poll();
	        if(!hm.containsKey(n.data))
	        {
	            hm.put(n.data,n.node);
	        }
	        if(n.node.left!=null)
	        {
	            q.add(new Que(n.data-1,n.node.left));
	        }
	        if(n.node.right!=null)
	        {
	            q.add(new Que(n.data+1,n.node.right));
	        }
	    }
	    for(Map.Entry<Integer,Binary>e:hm.entrySet())
	    {
	        System.out.print(e.getValue().data+" ");
	    }
	}
	static int lca(Binary temp,int n1,int n2)
	{
	    if(temp==null)
	    {
	        return -1;
	    }
	    if(temp.data>n1&&temp.data>n2)
	    {
	        return lca(temp.left,n1,n2);
	    }
	    else if(temp.data<n1&&temp.data<n2)
	    {
	        return lca(temp.right,n1,n2);
	    }
	    return temp.data;
	}
	static void levelOrder()
	{
	    Binary temp=root;
	    Queue<Binary>q=new LinkedList<Binary>();
	    q.add(temp);
	    while(!q.isEmpty())
	    {
	        Binary newnode=q.poll();
	        System.out.print(newnode.data+" ");
	        if(newnode.left!=null)
	        {
	            q.add(newnode.left);
	        }
	        if(newnode.right!=null)
	        {
	            q.add(newnode.right);
	        }
	    }
	}
	static Binary deleteNode(Binary temp,int data)
	{
	    if(root==null)
	    {
	        return root;
	    }
	    if(temp.data>data&&temp.left!=null)
	    {
	        temp.left=deleteNode(temp.left,data);
	    }
	    else if(temp.data<data&&temp.right!=null)
	    {
	        temp.right=deleteNode(temp.right,data);
	    }
	    else{
	        if(temp.right==null)
	        {
	            return temp.left;
	        }
	        else if(temp.left==null)
	        {
	            return temp.right;
	        }
	        temp.data=minValue(temp.right);
	        temp.right=deleteNode(temp.right,temp.data);
	    }
	    return temp;
	}
	static int minValue(Binary temp)
	{
	    int min=temp.data;
	    while(temp.left!=null)
	    {
	        min=temp.left.data;
	        temp=temp.left;
	    }
	    return min;
	}
	static int height(Binary temp)
	{
	    if(temp==null)
	    {
	        return -1;
	    }
	    else{
	        int l=height(temp.left);
	        int r=height(temp.right);
	        if(l>r)
	        {
	            return l+1;
	        }
	        else{
	            return r+1;
	        }
	}
	}
	static void insertNode(Binary temp,int data)
	{
	    if(temp.data>data&&temp.left!=null)
	    {
	        insertNode(temp.left,data);
	    }
	    else if(temp.data<data&&temp.right!=null)
	    {
	        insertNode(temp.right,data);
	    }
	    else if(temp.data>data&&temp.left==null)
	    {
	        Binary newnode=new Binary(data);
	        temp.left=newnode;
	    }
	    else if(temp.data<data&&temp.right==null)
	    {
	        Binary newnode=new Binary(data);
	        temp.right=newnode;
	    }
	}
	static void preOrder(Binary temp)
	{
	    if(temp==null)
	    {
	        return;
	    }
	    System.out.print(temp.data+" ");
	    preOrder(temp.left);
	    preOrder(temp.right);
	}
	static void inOrder(Binary temp)
	{
	    if(temp==null)
	    {
	        return;
	    }
	    inOrder(temp.left);
	    System.out.print(temp.data+" ");
	    inOrder(temp.right);
	}
	static void postOrder(Binary temp)
	{
	    if(temp==null)
	    {
	        return;
	    }
	    postOrder(temp.left);
	    postOrder(temp.right);
	    System.out.print(temp.data+" ");
	}
}
