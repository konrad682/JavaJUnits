import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ArrayTest {

    ArrayAlgoritm alg = new ArrayAlgoritm();

    @Test
    public void testexaplelab5()
    {
        int b[]={3,5,1};
        assertEquals(9,alg.solution(b));
    }

    @Test
    public void testwithoneValue()
    {
        int b[]={2};
        assertEquals(7,alg.solution(b));
    }

    @Test (expected = IllegalArgumentException.class )
    public void testwithzero()
    {
        int b[]={0,0,0};
        assertEquals(null, alg.solution(b));
    }

    @Test (expected = IllegalArgumentException.class )
    public void testunderzero()
    {
        int b[]={-2,-5,-1};
        assertEquals(null,alg.solution(b));
    }

    @Test (expected = IllegalArgumentException.class )
    public void testwithEmptyArray()
    {
        int b[]={};
        assertEquals(null,alg.solution(b));
    }

    @Test(expected = IllegalArgumentException.class )
    public void testWithNullTab()
    {
        assertEquals(null, alg.solution(null));
    }

    @Test(expected = IllegalArgumentException.class )
    public void testArraywithToomuchElemnt()
    {
        int b[] = new int[111];
        for(int i=0; i<11; i++)
        {
            b[i]=1;
        }
        assertEquals(null, alg.solution(b));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testWith0onstart()
    {
        {
            int b[] = {0,10,3,0};
            assertEquals(null, alg.solution(b));
        }


    }
}
