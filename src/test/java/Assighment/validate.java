package Assighment;


import java.io.FileReader;
import java.io.IOException;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;




public class validate {

	public static void main(String[] args) throws IOException, ParseException {
		int count=0;
		
		JSONParser jsonparser=new JSONParser();
		
		
		FileReader reader=new FileReader(".\\Team\\Member.json");
		
		Object obj = jsonparser.parse(reader);
		JSONObject jsonobj = (JSONObject)obj;
		String name = (String)jsonobj.get("name");
		System.out.println(name);
		JSONArray array = (JSONArray)jsonobj.get("player");

		for (int i = 0; i <= array.size()-1; i++) {
			JSONObject player = (JSONObject)array.get(i);
			String country = (String)player.get("country");
			System.out.println(country);
			
		if (country.equals("India")) {
			count++;
		}
		if (count>7) {
			break;
		}
		}
		System.out.println(count);
		
	}
}

