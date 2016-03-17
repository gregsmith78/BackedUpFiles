
public class Player {
	public String name;
	public double singles;
	public double doubles;
	public double triples;
	public double homers;
	public double atBats;
	
	
	public Player(){
		
		
	}
	public double GetSlugging(double Singles, double Doubles, double Triples, double Homers, double AtBats){
		singles = Singles;
		doubles = Doubles;
		triples = Triples;
		homers = Homers;
		atBats = AtBats;
		double sluggingPercentage = (((Singles * 1) + (Doubles * 2) + (Triples * 3) + (Homers * 4)) / AtBats);
	   // System.out.println(sluggingPercentage);
		return sluggingPercentage;
	}

}
