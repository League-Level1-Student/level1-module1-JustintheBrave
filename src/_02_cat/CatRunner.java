package _02_cat;

public class CatRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat("boy");
		
		cat.meow();
		cat.printName();
		for(int i=0; i<9; i++) {
		cat.kill();
		}
	}

}
