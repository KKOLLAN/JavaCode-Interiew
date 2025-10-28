package practice.java;

public class FirstNonstring {
	
	public static void main(String[] args) {
        String str = "SWISS";
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            System.out.println(current);
            boolean isRepeated = false;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && current == str.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                System.out.println("First non-repeating character: " + current);
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}


