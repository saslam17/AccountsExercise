package accountsG.accountsA;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.junit.Test;

import com.qa.util.JSONUtil;

import junit.framework.TestCase;

public class tests extends TestCase {
	
	Service service = new Service();
	
	@Test
	public void testAddAccount() {
		HashMap test1 = service.addAccount("Suleman", "Aslam", "1234");
		String string1 = test1.toString();
		HashMap<Integer, String> compare1 = new HashMap<Integer, String>() {{ put(2, "First Name: Suleman Last Name:Aslam Account Number: 1234"); }};
		String stringCompare1 = compare1.toString();
		assertEquals(string1, stringCompare1);
	}
	
	public void testJSONObject() {
		HashMap dataBase = service.addAccount("Suleman", "Aslam", "1234");
		String compare1 = "{\"1\":First Name: Suleman Last Name:Aslam Account Number: 1234}";
		JSONUtil util = new JSONUtil();
		String jsonTest = util.getJSON(service.dataBase);
		assertEquals(jsonTest, compare1);
	}

}
