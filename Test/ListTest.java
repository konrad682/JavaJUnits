import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    ListAlgoritm alg = new ListAlgoritm();
    @Test
    public void testonelement()
    {
        List<Integer> list = new ArrayList<>();
        list.add(-2);
        Assert.assertEquals(1, alg.solution(list));
    }

    @Test
    public void testSetMaxValue()
    {
        List<Integer> list = new ArrayList<>();
        list.add(1000000);
        Assert.assertEquals(1, alg.solution(list));
    }

    @Test
    public void testSetMinValue()
    {
        List<Integer> list = new ArrayList<>();
        list.add(-1000000);
        Assert.assertEquals(1, alg.solution(list));
    }

    @Test
    public void testPositiveValuesup0()
    {
        List<Integer> list = new ArrayList<>();
        list.add(177);
        list.add(12);
        list.add(116);
        list.add(26);
        list.add(1);
        list.add(2);
        list.add(16633);
        list.add(857);
        list.add(243);
        list.add(7567);
        list.add(23);
        list.add(3427);
        list.add(2775);
        list.add(0);
        list.add(3333);

        Assert.assertEquals(3, alg.solution(list));
    }

    @Test
    public void testNegativeElementsdown0()
    {
        List<Integer> list = new ArrayList<>();
        list.add(-413);
        list.add(-2);
        list.add(-2166);
        list.add(-343);
        list.add(-321);
        list.add(-12341);
        list.add(-6);
        list.add(-9949);
        list.add(-166);
        list.add(-654);
        list.add(-1364);
        list.add(-213);
        list.add(-1000000);

        Assert.assertEquals(1, alg.solution(list));
    }

    @Test
    public void TenZero()
    {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(6);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(3);
        list.add(0);
        list.add(4);
        list.add(0);
        list.add(5);
        list.add(0);
        list.add(6);
        list.add(0);
        list.add(7);
        list.add(0);
        list.add(8);
        list.add(0);
        list.add(9);
        list.add(0);
        list.add(2);

        Assert.assertEquals(10, alg.solution(list));
    }

    @Test
    public void testElements1to100000()
    {
        List<Integer> list = new ArrayList<>();
        for (int i=1; i<100001;i++)
        {
            list.add(i);
        }
        Assert.assertEquals(100001, alg.solution(list));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testEmptyList()
    {
        List<Integer> list=new ArrayList<>();
        alg.solution(list);
    }

    @Test(expected = NullPointerException.class)
    public void testNotInitializedList()
    {
        List<Integer> list = null;
        alg.solution(list);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTooManyValues()
    {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<1000001; i++)
        {
            list.add(i);
        }
        alg.solution(list);
    }

    @Test
    public void testRandomdiffrentvalues()
    {
        List<Integer> list = new ArrayList<>();
        list.add(500);
        list.add(6);
        list.add(500);
        list.add(3944);
        list.add(-1455);
        list.add(-2);
        list.add(-55);
        list.add(5);
        list.add(1);
        list.add(1);
        list.add(5);
    }
}
