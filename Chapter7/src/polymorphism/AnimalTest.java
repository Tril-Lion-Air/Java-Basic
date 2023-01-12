package polymorphism;

import java.util.ArrayList;

class Animal {
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 걷습니다.");
	}
	
	public void read() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 어슬렁거립니다.");
	}
	
	public void hunt() {

		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	public void fly() {
		System.out.println("독수리가 날개를 펼칩니다.");
	}
}
public class AnimalTest {

	public static void main(String[] args) {


		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
//		hAnimal.read(); // Human의 메소드 사용 불가
		Human human = (Human)hAnimal;
		human.read();
		
//		Eagle eagle = (Eagle)hAnimal; //에러 발생 코드. 주의! Eagle = (Eagle)인지만 체크함.
//		eagle.fly();
		if (hAnimal instanceof Eagle) { //에러발생 가능성을 차단시켜주는 If문. 
			Eagle eagle = (Eagle)hAnimal;
			eagle.fly();
		}
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for (Animal animal : animalList) {
			animal.move();
		}
		
		AnimalTest test2 = new AnimalTest();
		test2.testDownCasting(animalList);
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i=0; i<list.size(); i++) {
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.read();
			} else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunt();
			} else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.fly();
			} else {
				System.out.println("error");
			}
		}

	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
