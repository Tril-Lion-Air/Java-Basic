package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Select mode");
		System.out.println("R: RoundRobin");
		System.out.println("L: LeastJob");
		System.out.println("P: PriorityAllocation");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if ( ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}else if ( ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}else if ( ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}else {
			System.out.println("Error");
		}
		
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
