import org.junit.*;

import static org.junit.Assert.assertEquals;

public class BasicCalculatorTest {

    BasicCalculator basicCalculator;

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("@BeforeClass - program is here");
    }

    @Before
    public void setUp() throws Exception {
        basicCalculator = new BasicCalculator();
        System.out.println("@Before - Basic Calculator object is here");
    }

    @After
    public void tearDownAfter() throws Exception {
        basicCalculator=null;
        System.out.println("@After - Basic Calculator object is torn down");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception
    {
        System.out.println("@AfterClass - It's over.");
    }


    //calculateSum

    @Test
    public void calculateSumPositive() throws Exception {

        assertEquals(4,this.basicCalculator.calculateSum(1,3));
    }
    @Test
    public void calculateSumNegative() throws Exception {

        assertEquals(-8, this.basicCalculator.calculateSum(-5,-3));
    }
    @Test
    public void calculateSumWithZero() throws Exception {

        assertEquals(10, this.basicCalculator.calculateSum(0,10));
    }

    //calculateDifference

    @Test
    public void calculateDifferencePositive() throws Exception {

        assertEquals(10,this.basicCalculator.calculateDifference(30,20));
    }

    @Test
    public void calculateDifferenceNegative() throws Exception {

        assertEquals(-23,this.basicCalculator.calculateDifference(-30,-7));
    }

    @Test
    public void calculateDifferenceWithZero() throws Exception {
        assertEquals(-2,this.basicCalculator.calculateDifference(-2,0));
    }

    //calculateMultiplication

    @Test
    public void calculateMultiplicationPositive() throws Exception{
        assertEquals(6, this.basicCalculator.calculateMultiplication(2,3));
    }
    @Test
    public void calculateMultiplicationNegative() throws Exception{
        assertEquals(6, this.basicCalculator.calculateMultiplication(-2,-3));
    }
    @Test
    public void calculateMultiplicationWithZero() throws Exception{
        assertEquals(0, this.basicCalculator.calculateMultiplication(-2,0));
    }

    //calculateDivision

    @Test(expected = IllegalArgumentException.class)
    public void calculateDivisionException() throws Exception{
        this.basicCalculator.calculateDivision(3,0);
    }

    @Test
    public void calculateDivisionPositive() throws Exception{
        assertEquals(5,this.basicCalculator.calculateDivision(30,6));
    }

    @Test
    public void calculateDivisionNegative() throws Exception{
        assertEquals(-5,this.basicCalculator.calculateDivision(30,-6));
    }

    //calculatePow

    @Test(expected = IllegalArgumentException.class)
    public void calculatePowNegative() throws Exception{
        assertEquals(-8 , this.basicCalculator.calculatePow(2,-3));
    }

    @Test
    public void calculatePowPositive() throws Exception{
        assertEquals(8 , this.basicCalculator.calculatePow(2,3));
    }

    @Test
    public void calculatePowWithZeroBase() throws Exception{
        assertEquals(0,this.basicCalculator.calculatePow(0,3));
    }

    @Test
    public void calculatePowWithZeroExponent() throws Exception{
        assertEquals(1,this.basicCalculator.calculatePow(3,0));
    }

    //calculateSqlr

    @Test (expected = IllegalArgumentException.class)
    public void calculateSqlr() throws Exception {
        this.basicCalculator.calculateSqlr(-2);
    }

    @Test
    public void calculateSqlrPositive() throws Exception {
        assertEquals((int)Math.sqrt(4), (int)this.basicCalculator.calculateSqlr(4) );
    }





}