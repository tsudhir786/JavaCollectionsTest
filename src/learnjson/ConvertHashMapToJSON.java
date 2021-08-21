package learnjson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertHashMapToJSON {

	public static void main(String[] args) throws JsonProcessingException {
		Map<String,Object> map = new HashMap<>();
		//You can convert any Object.
		String[] value1 = new String[] { "value11", "value12", "value13" };
		String[] value2 = new String[] { "value21", "value22", "value23" };
		map.put("key1", value1);
		map.put("key2", value2);
		map.put("key3","string1");
		map.put("key4","string2");

		String json = new ObjectMapper().writeValueAsString(map);
		System.out.println(json);
	}
//	Sudhir working on this file to test merge conflict
}
