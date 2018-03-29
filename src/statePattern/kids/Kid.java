package statePattern.kids;

public class Kid {
	private int age;
	private KidState kidState;
	
	public Kid(int age) {
	this.setAge(age);
	}
	
	public void play(){
		kidState.play();
	}
	public void eat(){
		kidState.eat();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age=age;
		switch (age) {
		case 1:
			kidState = new FirstYearKid();
			break;
       case 4:
    	   kidState = new FourthYearKid();
			break;

		default:
			kidState = new FirstYearKid();
			break;
		}
	}

	
}
