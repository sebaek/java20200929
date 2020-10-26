package chap15.textbook.exercises.p09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null; // 최고점수 아이디
		int maxScore = 0; // 최고점수
		int totalScore = 0; // 점수합

		/*
		// keyset
		Set<String> keys = map.keySet();
		for (String key : keys) {
			int value = map.get(key);

			totalScore += value;

			if (value > maxScore) {
				maxScore = value;
				name = key;
			}
		}
		*/
		// entryset
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String id = entry.getKey();
			int score = entry.getValue();
			
			totalScore += score;
			
			if (score > maxScore) {
				maxScore = score;
				name = id;
			}
		}
		
		double avg = (double) totalScore / map.size();

		System.out.println("평균값:" + avg);
		System.out.println("점수합:" + totalScore);
		System.out.println("최고값:" + maxScore);
		System.out.println("최고값아이디:" + name);

	}
}




