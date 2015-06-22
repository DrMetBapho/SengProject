/**	class IceCream represents a complete set of icecream and thereby the 'product' of the application. */ 
class IceCream{
	private final Scoop [] SCOOPS;
	private final Garnish GARNISH;
	private final Waffle WAFFLE;
	public IceCream(Scoop[] s, Waffle w, Garnish g){
		SCOOPS=s;
		WAFFLE=w;
		GARNISH=g;
	}
	IceCream(Scoop[] s, Waffle w){
		this(s, w, null);
	}
	public Scoop[] getScoops(){
		return SCOOPS;
	}
	public Waffle getWaffle(){
		return WAFFLE;
	}
	public Garnish getGarnish(){
		return GARNISH;
	}
	/** method returns the sum of calories of all scoops in the scoops-array
	* @return sum build by adding all calories of scoop-array */
	public double getScoopCalories(){
		double sum=0;
		for(Scoop e:SCOOPS)
			sum+=e.getCalories();
		return sum;
	}
}