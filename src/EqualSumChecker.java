public class EqualSumChecker {
    public static boolean hasEqualSum (int a, int b, int c){
        if(a + b == c){
            System.out.println("Yes the sum of previous two number is equal to last");
            return true;
        }else{
            System.out.println("It is wrong");
            return false;
        }
    }

    public static void main(String[] args) {
        hasEqualSum(1,2,3);
        hasEqualSum(2, 3, 5);
        hasEqualSum(3,4,6);

    }
}