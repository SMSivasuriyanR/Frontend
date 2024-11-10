class calc{
	void calculate(){
		System.out.println("Only Arithmatic Operations");
	}
}
class calc1 extends calc{
	void calculate(){
		super.calculate();
		System.out.println("Data, Temperate, BMI, Area, Speed, Time, Volume Available");
	}
}
public class Calculator{
	public static void main(String[] args){
		calc1 cal=new calc1();
		cal.calculate();
	}
}