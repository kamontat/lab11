package tasktimer.task;

import java.util.*;

/**
 * Process all the words in a file using Scanner to read and parse input.
 * Display summary statistics and elapsed time.
 * <p>
 * Created by kamontat on 5/5/59.
 */
public class Task1 implements Runnable {
	private Scanner in = new Scanner(tasktimer.Dictionary.getWordsAsStream());

	@Override
	public void run() {
		int count = 0;
		long totalSize = 0;

		while (in.hasNext()) {
			String word = in.next();
			totalSize += word.length();
			count++;
		}
		double averageLength = ((double) totalSize) / (count > 0 ? count: 1);
		System.out.printf("Average length of %,d words is %.2f\n", count, averageLength);
	}

	@Override
	public String toString() {
		return "read words using Scanner and a while loop";
	}
}