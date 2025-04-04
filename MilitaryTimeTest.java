package classAssignments;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MilitaryTimeTest{
	@Test
    public void timeTest1(){
        int time = MilitaryTime.convertFromMilitaryTime(23);
        assertEquals(11, time);
    }

    @Test
    public void timeTest2(){
        int time = MilitaryTime.convertFromMilitaryTime(0);
        assertEquals(12, time);
    }

    @Test
    public void timeTest3(){
        int time = MilitaryTime.convertFromMilitaryTime(5);
        assertEquals(5, time);
    }

    @Test
    public void timeTest4(){
        int time = MilitaryTime.convertFromMilitaryTime(13);
        assertEquals(1, time);
    }

    @Test
    public void timeTest5(){
        assertThrows(IllegalArgumentException.class, ()->{MilitaryTime.convertFromMilitaryTime(-1);});
    }

    @Test
    public void timeTest6(){
        assertThrows(IllegalArgumentException.class, ()->{MilitaryTime.convertFromMilitaryTime(25);});
    }
}
