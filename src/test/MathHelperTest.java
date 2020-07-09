package test;

import org.junit.Before;
import org.junit.Test;

import main.MathHelper;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MathHelperTest {

    private MathHelper helper;
    private List<Integer> numbers;

    @Before
    public void setUp() {
        helper = new MathHelper();
        numbers = new ArrayList<>();
    }

    @Test
    public void testSum_shouldSucceed() {
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        int result = helper.sum(numbers);
        assertEquals(6, result);
    }

    @Test
    public void testSum_twoOppositeValues_shouldSucceed(){
        numbers.add(-100);
        numbers.add(100);
        int result = helper.sum(numbers);
        assertEquals(0, result);
    }

    @Test
    public void testSum_twoMaxValues_shouldSucceed(){
        numbers.add(Integer.MAX_VALUE);
        numbers.add(Integer.MIN_VALUE);
        int result = helper.sum(numbers);
        assertEquals(-1,result);
    }

    @Test
    public void testAverage_shouldSucceed(){
        numbers.add(0);
        numbers.add(10);
        double result = helper.average(numbers);
        assertEquals(5,result,0.0000001);
    }

    @Test
    public void testVariance_shouldSucceed(){
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        double result = helper.variance(numbers);
        assertEquals(100, result,0.0000001);
    }


}
