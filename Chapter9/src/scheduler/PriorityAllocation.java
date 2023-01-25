package scheduler;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("PriorityAllocation getNextCall");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("PriorityAllocation sendCallToAgent");
		
	}
	

}
