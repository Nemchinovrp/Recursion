public class Recursion
{
    public int fact(int n){
        int result;

        if(n == 1) return 1;

        result = fact(n-1)*n;

        return result;
    }

    public static void main(String[] args){
        Recursion recursion = new Recursion();
        System.out.println(recursion.fact(3));
    }
}
