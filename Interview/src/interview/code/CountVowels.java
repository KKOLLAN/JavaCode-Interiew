package interview.code;

public class CountVowels {

	public static void main(String[] args) {
		
String str = "Kiran Kumar Kollana";
int vowels = 0, consonats= 0;
for(char c : str.toCharArray()) {
	if("aeiouAEIOU".indexOf(c) != -1){
		vowels++;
	}
	else if (Character.isLetter(c)){
		consonats++;
}
	}
System.out.println("vowels: " +vowels+ ",Consonats: " + consonats);
}
}