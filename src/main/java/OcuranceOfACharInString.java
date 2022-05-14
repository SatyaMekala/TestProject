import java.util.HashMap;
import java.util.Map;

public class OcuranceOfACharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "1%Hello World%1";
		char[] ch = s.toCharArray();
		
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for (int i = 0; i < ch.length; i++) {
		System.out.println(map.put(ch[i], map.get(ch[i])));	
			
		}
		
		/*
		 * for(Map.Entry<String,Integer> m : map.entrySet()) {
		 * 
		 * System.out.println(map.put(s, 1)); }
		 */
		
		
		

	}

}
