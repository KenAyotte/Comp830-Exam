import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InventoryTest {

	Inventory testObj;

	@BeforeEach
	public void setUp() {
		testObj = new Inventory();
	}
	
	@Test
	void testAddItem() {
		testObj.addItemToInventory("cheese");
		testObj.addItemToInventory("beef");
		List<InventoryItem> actual = testObj.items;
		InventoryItem expected = <cheese, beef>
		assertEquals(expected, actual);
	}
	
	@Test
	void testGetCount() {
		testObj.addItemToInventory("cheese");
		testObj.addItemToInventory("beef");
		int actual = testObj.getCount();
		int expected = 2;
		assertEquals(expected, actual);
	}

}
