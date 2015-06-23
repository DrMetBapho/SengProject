/** class Assembly is responsible for creating new IceCream-Objects once the device is set up
*/
import java.util.ArrayList;
class Assembly{
	/**Method makeIceCream returns a set of IceCream containing of the components representing the entered Strings
	*@param String-array scoop containing the flavours entered by user,
	* a String waffle specifying the wanted waffle-size and a String naming the ordered type of garnish.
	*
	*@return Method returns a complete set of IceCream. */
	public IceCream makeIceCream(String[] scoop, String waffle, String garnish){
		Waffle first=makeWaffle(waffle);
		ArrayList<Scoop> list=new ArrayList<Scoop>();
		for(String e:scoop)
			list.add(makeScoop(e));
		Garnish second=null;
		if(garnish != null)
			second=makeGarnish(garnish);
		Object[] neutral=list.toArray();
		Scoop[] ice=null;
		if(neutral instanceof Scoop[])
			ice=(Scoop[]) neutral;
		IceCream ordered=new IceCream(ice, first, second);
		return ordered;
	}
	/** Method makeWaffle returns an instance of class Waffle.
	* @param Requires a String specifying the wanted waffle-size.
	* @return returns a new instance of class Waffle */
	private Waffle makeWaffle(String size){
		Size needed=Enum.valueOf(Size.class, size);
		return new Waffle(needed);
	}
	/** Method makeScoop returns a new instance of class Scoop
	*@param Requires a String specifying the wanted flavour
	*@return returns a new instance of class Scoop */
	private Scoop makeScoop(String flavour){
		Flavour needed=Enum.valueOf(Flavour.class, flavour);
		return new Scoop(needed);
	}
	/** Method makeGarnish returns a new instance of class Garnish
	* @param Requires a String specifying the wished type of garnish
	* @return returns a new instance of class Garnish */
	private Garnish makeGarnish(String type){
		return new Garnish(type);
	}
}