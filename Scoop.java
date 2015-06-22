/**
*	class Scoop represents a scoop of icecream. It becomes a complete set together with Waffle and Garnish.
*/
class Scoop{
	private final Flavour FLAVOUR;
	private final double CALORIES=200;
	public Scoop(Flavour f){
		FLAVOUR=f;
	}
	public Flavour getFlavour(){
		return FLAVOUR;
	}
	public double getCalories(){
		return CALORIES;
	}
}