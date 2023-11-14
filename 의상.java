import java.util.HashMap;

public class 의상 {
	public int solution45(String[][] clothes) {
		int answer = 1;
		HashMap<String, Integer> clothesMap = new HashMap<>();
		String type;

		for (String[] cloth : clothes) {
			type = cloth[1];
			clothesMap.put(type, clothesMap.getOrDefault(type, 1) + 1);
		}

		for (int count : clothesMap.values())
			answer *= count;

		return answer - 1;
	}
}
