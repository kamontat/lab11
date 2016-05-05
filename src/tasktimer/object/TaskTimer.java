package tasktimer.object;

import tasktimer.timer.StopWatch;

/**
 * Time how long it takes to perform some tasks
 * using different programming constructs.
 * <p>
 * TODO Improve this code by restructuring it to eliminate duplicate code.
 */
public class TaskTimer {
	public static void execAndPrint(Runnable task) {
		StopWatch watch = new StopWatch();
		System.out.println("Starting Task: " + task.toString());

		watch.start();
		task.run();
		watch.stop();

		System.out.printf("Elapsed time is %.5f sec\n", watch.getElapsed());
		watch.reset();
	}
}