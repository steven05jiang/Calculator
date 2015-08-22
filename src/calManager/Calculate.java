package calManager;

public class Calculate {

	public static String getResult(int sign, double prev, double num){
		if(sign == -1)
			return String.valueOf(num);
		if(sign == 0)
			return String.valueOf(prev+num);
		if(sign == 1)
			return String.valueOf(prev-num);
		if(sign == 2)
			return String.valueOf(prev*num);
		if(sign == 3)
			return String.valueOf(prev/num);
		if(sign == 4)
			return String.valueOf(num*num);
		if(sign == 5)
			return String.valueOf(Math.sqrt(num));
		return "0.";
	}
}
