
public class Beer {
	String beerType;
	boolean isOpen;
	int percentFull;
	
	public void Open() {
		isOpen = true;
	}
	public void TakeSip() {
		percentFull -=10;
	}
	public String getTypeOfBeer () {
		return beerType;
	 }
	public void setTypeOfBeer(String TypeOfBeer) {
		beerType = TypeOfBeer;
	}
}
