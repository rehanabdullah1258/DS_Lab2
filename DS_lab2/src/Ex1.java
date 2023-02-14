import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
       int x[]={1,2,3,4,5,6} ;
       int u=x.length-1;
       int y[]=new int[u];
        System.out.println(Arrays.toString(x));
        reverse(x);
        System.out.println(Arrays.toString(x));

    }
    public static void reverse(int a[])
    {
//        for (int i = 1; i < a.length-1; i++) {
//
//        }
        int n=a.length-1;

        for (int i = 0; i <a.length/2; i++) {
            int temp=a[i];
            a[i]=a[n];
            a[n]=temp;
            n--;
        }
    }
}
//import java.util.Arrays;

//public class Ex2 {
//    public static void main(String[] args) {
//        int a[]={1,2,3,4,5,6} ;
//        int u=a.length;
//        int t[]=new int[u];
//        System.out.println(Arrays.toString(a));
//        clone(a,t);
//        System.out.println(Arrays.toString(t));
//    }
//    public static void clone(int x[],int y[])
//    {
//        for (int i = 0; i <x.length ; i++) {
//            for (int j = 0; j <y.length ; j++) {
//                int temp=x[i];
//                x[i] = y[j];
//                y[j] = temp;
//            }
//        }
//    }
//}
//
