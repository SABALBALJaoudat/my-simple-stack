package deqo.jsab.mysimplestack;


import org.junit.*;

import static org.junit.Assert.*;

public class ItemTest {
    Item item = new Item();

    @Test
    public void testSetId() {
        System.out.println("setId");
        int ID = 1;
        this.item.setId(ID);
        assertEquals(item.getId(), ID);
    }

    @Test
    public void testGetId() {
        int ID = 1;
        this.item.setId(ID);
        int result = item.getId();
        assertEquals(result, ID);
    }
}