package calManager;

public class Calculate {

	public static String getResult(int sign, double prev, double num){
		String result = "0.";
		if(sign == -1)
			result =  String.valueOf(num);
		else if(sign == 0)
			result =  String.valueOf(prev+num);
		else if(sign == 1)
			result =  String.valueOf(prev-num);
		else if(sign == 2)
			result =  String.valueOf(prev*num);
		else if(sign == 3)
			result =  String.valueOf(prev/num);
		else if(sign == 4)
			result =  String.valueOf(num*num);
		if(result.charAt(result.length()-1) == '0')
			result = result.substring(0, result.length()-1);
		return result;
	}
}
