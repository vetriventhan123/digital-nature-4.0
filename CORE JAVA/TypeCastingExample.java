public class TypeCastingExample {
    public static void main(String[] args) {
        double dVal = 9.78;
        int iVal = (int) dVal;
        System.out.println("Double to int: " + iVal);
        
        int iNum = 10;
        double dNum = (double) iNum;
        System.out.println("Int to double: " + dNum);
    }
}