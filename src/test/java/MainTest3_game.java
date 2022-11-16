

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class MainTest1 {
    @Test
    public void a1() {
        assertEquals(gamelife(1), "1");
    }
    @Test
    public void a2() {
        assertEquals(gamelife(2), "2");
    }
    @Test
    public void a3() {
        assertEquals(gamelife(3), "buzz");
    }
    @Test
    public void a4() {
        assertEquals(gamelife(4), "4");
    }
    @Test
    public void a5() {
        assertEquals(gamelife(5), "fuzz");
    }

    @Test
    public void a6() {
        assertEquals(gamelife(6), "buzz");
    }
    @Test
    public void a10() {
        assertEquals(gamelife(10), "fuzz");
    }
    @Test
    public void a15() {
        assertEquals(gamelife(15), "buzz");
    }
    @Test
    public void a100() {
        assertEquals(gamelife(100), "fuzz");
    }
    @Test
    public void a55() {
        assertEquals(gamelife(55), "fuzz");
    }
    public String gamelife(int i){
        if (i % 3 ==0){
            return "buzz";
        } else if (i % 5 == 0) {
            return "fuzz";
        }
        return String.valueOf(i);
    }
}