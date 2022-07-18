package InsectInstance;

public class InsectClient {
	public static void main(String[] args) {
		System.out.println(Insect.produceRandomFact());
		Insect bug1 = new Insect(13, 31, 0);
		//bug1 = -1;
		//Insect.population = 0;

		//System.out.println(bug1.getWeight());
		System.out.println(bug1.getX());
		bug1.setX(-314);
		//System.out.println(bug1.getY());
		//bug1.setY(133);
		System.out.println(bug1.getX());
		bug1.setX(133);
		System.out.println(bug1.getX());
	}
}
