package cooperation;

public class TakeTranstest {

	public static void main(String[] args) {

		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		Student studentE = new Student("Edward", 12000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		Subway subwayGreen = new Subway(2);
		Subway subwayBlue = new Subway(1);
		
		Taxi taxi2030 = new Taxi(2030);
		
		studentJ.takeBus(bus100);
		studentT.takeSubway(subwayGreen);
		studentE.rideTaxi(taxi2030);
		
		studentJ.showStudentInfo();
		studentT.showStudentInfo();
		studentE.showStudentInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		
		subwayGreen.showBusInfo();
		subwayBlue.showBusInfo();
		
		taxi2030.showBusInfo();
		
	}

}
