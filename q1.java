/**
 * q1
 */
public class q1 {

    public static void  printno(int n){
if (n>0){
    printno(n-1);
    System.out.println(n);
}


    }
public static void main(String[] args) {
    int n=5;
    printno(n);
}
}
