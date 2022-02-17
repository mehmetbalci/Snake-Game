
public class deneme {
	
	String lookAndSay(String number) {
		  String result = "";
		  int times=1;
		  char repeat = number.charAt(0);
		  result = result.substring(1);
		  int count = 1; // should start at 1, since we have at least one of these numbers
		  for (int i=1; i<number.length(); i++) {
			  char ch=number.charAt(i);
		    if (ch != repeat) {
		        result += count + "" + repeat;
		        repeat = ch;
		        count = 1;
		    } else {
		        times++;
		    }
		  }
		  return result;
		}
	
	public void main(String[] args){
		String num = "1"; 
	 
		for (int i=1;i<=10;i++) {
			System.out.println(num);
			num = lookAndSay(num);             
		}
	}
	

}
