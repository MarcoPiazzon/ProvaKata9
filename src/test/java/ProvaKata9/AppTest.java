package ProvaKata9;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Test(){
        assertEquals(App.xp_to_target_lvl(0,5), 1808);
    }

    @Test
    public void Test1(){
        assertEquals(App.xp_to_target_lvl(12345,17),29535);
    }

    @Test
    public void Test2(){
        assertEquals(App.xp_to_target_lvl(313,2),1);
    }



}
