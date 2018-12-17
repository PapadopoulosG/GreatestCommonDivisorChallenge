package eu.georgiospapadopoulos;

    /*
     Challenge info :

    Write a method named getGreatestCommonDivisor with 2 parameters of type int named
    first and second.
    If one of the parameters is < 10 the method should return -1 to indicate an invalid value.
    The method should return the greatest common divisor of the two numbers (int)/
    */

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }


    /**
     * Receives 2 numbers and finds their greatest common divisor.
     * Returns -1 if any of the number's values are less than 10.
     *
     * @param first (int)
     * @param second (int)
     * @return gcd (int) The greatest common divisor.
     */
    private static int getGreatestCommonDivisor(int first, int second)
    {
        if(first<10 || second<10)
            return  -1;

        int gcd = 1;

        for(int i = 1; i<=first && i<=second;i++)
        {
            if (first % i == 0 && second % i == 0)
                gcd = i;

        }
        return gcd;
    }
}

