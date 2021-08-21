import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class LearnArrayDeque {

	public static void main(String[] args) {

		Map<String, String> gfg = new HashMap<String, String>();

		// enter name/url pair
		gfg.put("GFG", "geeksforgeeks.org");
		gfg.put("Practice", "practice.geeksforgeeks.org");
		gfg.put("Code", "code.geeksforgeeks.org");
		gfg.put("Quiz", "quiz.geeksforgeeks.org");

		// using for-each loop for iteration over Map.entrySet()
		for (Map.Entry<String, String> entry : gfg.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		ArrayDeque<Integer> adq = new ArrayDeque<>();

		adq.offer(23);
		adq.offerFirst(12);
		adq.offerLast(45);
		adq.offer(26);

		System.out.println(adq);

		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());

		System.out.println(adq.poll());
		System.out.println("poll() " + adq);

		System.out.println(adq.pollFirst());
		System.out.println("pollFirst() " + adq);

		System.out.println(adq.pollLast());
		System.out.println("pollLast() " + adq);

	}

}
