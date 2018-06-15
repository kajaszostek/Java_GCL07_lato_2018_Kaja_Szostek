import org.junit.*;

import static org.junit.Assert.*;

public class FieldCalculatorTest {

    FieldCalculator fieldCalculator;

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("@BeforeClass - program is here");
    }

    @Before
    public void setUp() throws Exception {
        fieldCalculator = new FieldCalculator();
        System.out.println("@Before - Basic Calculator object is here");
    }

    @After
    public void tearDownAfter() throws Exception {
        fieldCalculator=null;
        System.out.println("@After - Basic Calculator object is torn down");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception
    {
        System.out.println("@AfterClass - It's over.");
    }

    //calculateSquare

    @Test(expected = IllegalArgumentException.class)
    public void calculateSquareException() throws Exception{
        this.fieldCalculator.calculateSquare(-3);
    }

    @Test
    public void calculateSquarePositive() throws Exception{
        assertEquals(9,this.fieldCalculator.calculateSquare(3));
    }

    //calculateCircle

    @Test(expected = IllegalArgumentException.class)
    public void calculateCircleException() throws Exception{
        this.fieldCalculator.calculateCircle(-2);
    }

    @Test
    public void calculateCirclePositive() throws Exception{
       assertEquals((int)(3.14*2*2), (int)this.fieldCalculator.calculateCircle(2) );
    }

    //calculateTriangle

    @Test(expected = IllegalArgumentException.class)
    public void calculateTriangleException() throws Exception{
        this.fieldCalculator.calculateTriangle(2,0);
    }

    @Test
    public void calculateTrianglePositive() throws Exception{
        assertEquals(3,this.fieldCalculator.calculateTriangle(2,3));
    }

    //calculateRectangle

    @Test(expected = IllegalArgumentException.class)
    public void calculateRectangleException() throws Exception{
        this.fieldCalculator.calculateRectangle(0,2);
    }

    @Test
    public void calculateRectanglePositive() throws Exception{
        assertEquals(8,this.fieldCalculator.calculateRectangle(4,2));
    }
}