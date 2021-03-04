/* 
More conversions

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getFeetFromInches(28));
    }

    public static int getFeetFromInches(int inches) {
        int result = inches/12;
        return result;
    }
}