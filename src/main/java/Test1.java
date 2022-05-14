import java.util.HashMap;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> scores = new HashMap<String, Integer>();

        scores.put("David", 95);
        scores.put("Jane", 80);
        scores.put("Mary", 97);
        scores.put("Lisa", 78);
        scores.put("Dino", 65);
        
      Set s =   scores.keySet();
      
     // s.stream().map(null)
		
      for (int i = 0; i < args.length; i++) {
		
	}
		
	}

}
