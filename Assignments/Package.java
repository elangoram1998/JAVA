package pkgpackage;
public class Package {
public int add(int a,int b)
{
    return a+b;
}
    public static void main(String[] args) {
        Package s=new Package();
        System.out.println(s.add(10, 20));
    }

}

//next package
package newpackage;
import pkgpackage.Package;
public class Sub {
    public int sub(int a,int b)
    {
        return a-b;
    }
    public static void main(String args[])
    {
        Package s=new Package();
        Sub o=new Sub();
        System.out.println(s.add(200, 100));
        System.out.println(o.sub(20, 10));
    }
}

   
