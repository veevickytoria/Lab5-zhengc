import java.util.ArrayList;


public class PrimeNumberGenerator {
	public static ArrayList<Integer> generatePrimes(int n){
		if(n < 2)
			return new ArrayList<Integer>();
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i = 2; i < n; i++){
			ret.add(n);
		}
		return ret;
	}
}
