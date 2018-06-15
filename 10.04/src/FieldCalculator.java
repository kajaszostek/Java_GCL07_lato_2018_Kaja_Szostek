public class FieldCalculator {

    int calculateSquare(int side)
    {
        if(side<=0)
        {
            throw new IllegalArgumentException("Side can't be <= 0");
        }

        return side*side;
    }
    double calculateCircle(int radius)
    {
        if(radius<=0)
        {
            throw new IllegalArgumentException("Radius can't be <=0");
        }
        return 3.14*radius*radius;
    }
    int calculateTriangle(int basis, int height)
    {
        if(basis<=0 || height<=0)
        {
            throw new IllegalArgumentException("Basis and height can't be <=0");
        }

        return basis*height/2;
    }
    int calculateRectangle(int side1, int side2)
    {
        if(side1<=0 || side2<=0)
        {
            throw new IllegalArgumentException("Sides can't be <=0");
        }
        return side1*side2;
    }




}
