package learnjson;

import java.util.HashMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJSONToJavaMap {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		HashMap<String, Object> result = new ObjectMapper().readValue(new File("src/resources/TestJSON1.json"),
				HashMap.class);
		result.keySet().forEach(key -> System.out.println(key));
		Map.Entry<String, Object> entry = (Entry<String, Object>) result.entrySet();
		entry.getKey();
		entry.getValue();
// 	Test7 Sudhir detached
	}

}
