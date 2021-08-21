package learnjson;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;

public class ConvertJSONObjectResponsetoJavaMap {

	public static void main(String[] args) throws IOException {

		HashMap<String, Object> result = new ObjectMapper().readValue(new File("src/resources/TestJSON.json"),
				HashMap.class);
//		result.keySet().forEach(key -> System.out.println(key));
		result.forEach((k, v) -> {
//			System.out.format("key: %s, value: %s%n", k, v);
			if (k.contains("moods")) {
				List<String> moodsResult = (List<String>) result.get("moods");
				for (String eachMood : moodsResult) {
					System.out.println(eachMood);
				}

			}else if(k.contains("Sports")) {
				HashMap<String, String> sportsMap = (HashMap<String, String>) result.get("Sports");
				boolean value = sportsMap.containsKey("Cricket");
				assertEquals("map contains Cricket",value);
			}
		});
		/*
		 * for (String key : result.keySet()) { Object routings = result.get(key);
		 * System.out.println(routings);
		 * 
		 * }
		 */

	}

}
