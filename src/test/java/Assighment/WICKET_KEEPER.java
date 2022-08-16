package Assighment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;


public class WICKET_KEEPER {

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
			String role = (String)player.get("role");
			System.out.println(role);
			
		
		if (role.equals("Wicket-keeper")) {
			count++;
		}
		if (count==1) {
			break;
		}
		}
		System.out.println(count);
		
	}
}

