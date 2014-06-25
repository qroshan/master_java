package nirvana.solver;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import nirvana.solver.euler.p1.MultipleOfXandYUsingCircularList;
import nirvana.solver.euler.p1.MultipleOfXandYUsingCounter;
import nirvana.solver.euler.p1.MultipleOfXandYUsingMod;

public class Solutions {

	public static void main(String[] args) throws InterruptedException {
		Long programTime= ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime();
		List<Solve> solutions= new ArrayList<Solve>();
		ExecutorService executor= Executors.newFixedThreadPool(1);

		// Euler 1
		ParameterSet euler1MultipleOfXandYParams= new ParameterSet();
		euler1MultipleOfXandYParams.setParameter("x", Integer.class, 3);
		euler1MultipleOfXandYParams.setParameter("y", Integer.class, 5);
		euler1MultipleOfXandYParams.setParameter("n", Long.class, 90000000L);

		solutions.add(new MultipleOfXandYUsingCounter(euler1MultipleOfXandYParams));
		solutions.add(new MultipleOfXandYUsingMod(euler1MultipleOfXandYParams));
		solutions.add(new MultipleOfXandYUsingCircularList(euler1MultipleOfXandYParams));

		for (Solve solver: solutions) {
			executor.submit(solver);
		}
		System.out.println("Test");
		executor.awaitTermination(10, TimeUnit.SECONDS);
		programTime= ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime() - programTime;
		System.out.printf("Total Time Taken for Solver: %dms",programTime/1000000);
	}

}
