package version2;

public class Driver {
	public static final String BLANK_LINE = "\n";
	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		Duck[] ducks = new Duck[3];
		
		ducks[0] = new MallardDuck();
		ducks[1] = new RedheadDuck();
		ducks[2] = new RubberDuck();
		
		for(int i=0; i < ducks.length; i++) {
			System.out.println("Duck #" + i + ":\n---------------------");
			ducks[i].quack();
			ducks[i].swim();
			ducks[i].display();
			ducks[i].fly();
			System.out.println(ducks[i].toString() + Driver.BLANK_LINE);
		}

	}

}
