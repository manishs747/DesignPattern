package statePattern.kids;

public class Exec {
public static void main(String[] args) {
	Kid k1 = new Kid(1);
	Kid k4 = new Kid(4);
	
	k1.eat();
	k1.play();
	
	k4.eat();
	k4.play();
	
}
}
