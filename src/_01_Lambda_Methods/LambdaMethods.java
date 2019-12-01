package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String back = "";
			for(int i = s.length()-1;i>=0;i--) {
				back+=s.substring(i,i+1);
			}
			System.out.println(back);
		},"backwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String out = "";
			for(int i = 0;i<s.length();i++) {
				if(i%2==0) {
					out+=s.substring(i,i+1).toUpperCase();
				}else {
					out+=s.substring(i,i+1).toLowerCase();
				}
			}
			System.out.println(out);
			
		},"mixedcase");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String out = "";
			for(int i = 0;i<s.length()-1;i++) {
				out+=s.substring(i,i+1);
				out+=".";
			}
			out+=s.substring(s.length()-1,s.length());
			System.out.println(out);
			
			
		},"period");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String out = "";
			for(int i = 0;i<s.length();i++) {
				String sub = s.substring(i,i+1);
				switch(sub) {
				case "a":
					
					break;
				case "e":
					
					break;
				case "i":
	
					break;
				case "o":
	
					break;
				case "u":
	
					break;
				case "A":
					
					break;
				case "E":
					
					break;
				case "I":
	
					break;
				case "O":
	
					break;
				case "U":
	
					break;
				default:
					out+=sub;
					break;
				}
			}
			System.out.println(out);
			
			
			
		},"I need to make a stream of varying types but every time I try it fails");
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
