public class BasicCalculator {

    int calculateSum(int element1, int element2)
    {
        return element1+element2;
    }
    int calculateDifference(int minuend, int subtrahend)
    {
        return minuend-subtrahend;
    }
    int calculateMultiplication(int factor1, int factor2)
    {
        return factor1*factor2;
    }
    int calculateDivision(int dividend, int divisor)
    {
        if(divisor == 0)
        {
            throw  new IllegalArgumentException("Divisor = 0!");
        }

        return dividend/divisor;
    }
    int calculatePow(int base, int exponent)
    {
        if(exponent<0)
        {
            throw new IllegalArgumentException("Exponent can't be <0!");
        }
        return (int) Math.pow(base,exponent);
    }
    double calculateSqlr(int base)
    {
        if(base < 0 )
        {
            throw new IllegalArgumentException("Base can't be <0!");
        }
        return Math.sqrt(base);
    }

}
