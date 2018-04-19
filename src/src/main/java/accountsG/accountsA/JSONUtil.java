package src.main.java.accountsG.accountsA;

import java.util.HashMap;

import org.json.simple.JSONObject;

public class JSONUtil {

		private JSONObject json;
		
		public JSONUtil(){
			this.json = new JSONObject();
		}
		
	public String getJSON(HashMap obj) {
		json.putAll(obj);
		return json.toString();
	}
}
