package accountsG.accountsA;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import junit.framework.Assert;

public class StreamSearchTest {
	
	Service service = new Service();

	@Test
	public void test() {
		HashMap dataBase = service.addAccount("Suleman", "Aslam", "1234");
		int expected = 1;
		int actual = service.streamSearch("Suleman", dataBase);
		Assert.assertEquals(expected, actual);
	}

}