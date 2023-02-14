import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6} ;
        int t[];
        t=a.clone();
        System.out.println(Arrays.toString(a));
        clone(a,t);
        System.out.println("the backup array: "+Arrays.toString(t));
    }
    public static void clone(int x[],int y[])
    {
       for (int i = 0; i <x.length ; i++) {
           for (int j = 0; j <y.length ; j++) {
                x[i] = y[j];
          }
       }
   }
}
