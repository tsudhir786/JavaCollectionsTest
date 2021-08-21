package learnjson;

import org.json.simple.JSONObject;

//JavaScript Object Notation
//Dynamic pages , 
public class LearnJSONExample1 {

	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		obj.put("name", "sonoo");
		obj.put("age", new Integer(27));
		obj.put("salary", new Double(600000));
		System.out.print(obj);

	}

}
