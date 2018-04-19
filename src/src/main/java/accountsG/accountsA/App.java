package src.main.java.accountsG.accountsA;

import java.util.HashMap;

import org.json.simple.JSONObject;

import com.qa.util.JSONUtil;


public class App 
{
    public static void main( String[] args )
    {
	    	Service service = new Service();
	    	service.addAccount("Suleman", "Aslam", "1234");
	    	JSONUtil util = new JSONUtil();
	    	String json = util.getJSON(service.dataBase);
	    service.search("Suleman", service.dataBase);
	    service.streamSearch("Suleman", service.dataBase);
	    	System.out.println(json);
    }
}
