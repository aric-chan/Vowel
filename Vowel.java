//********************************************************************
//  A prgram of counting vowels in a word
//********************************************************************
import java.util.*;
public class Vowel
{
	public static void main(String[] args) {
	    
	    //Prompt user to input a word, and turn all letters into lower case
		Scanner scan = new Scanner (System.in);
		System.out.println("Input your word.");
		String str = scan.next();
		str = str.toLowerCase();
		
		//Declare word length, vowels counters & non-vowel counter
		int len = str.length();
		int n_a=0,n_e=0,n_i=0,n_o=0,n_u=0,n_non_vowel=0;
		
		//Outer loop: loop all characters in the word
		for(int i=0;i<=len-1;i++)
		{
		char x=str.charAt(i);
		    //for each character, count the corepsonding vowels & non-vowel
    		switch(x)
    		{
    		    case 'a':
    		        n_a++;
    		        break;
    		    case 'e':
    		        n_e++;
    		        break;
    		    case 'i':
    		        n_i++;
    		        break;
    		    case 'o':
    		        n_o++;
    		        break;
    		    case 'u':
    		        n_u++;
    		        break;
    		    default:
    		        n_non_vowel++;
    		}
		}
		
		//report the count
		System.out.println("# of a:"+n_a);
		System.out.println("# of e:"+n_e);
		System.out.println("# of i:"+n_i);
		System.out.println("# of o:"+n_o);
		System.out.println("# of u:"+n_u);
		System.out.println("# of non-vowel:"+n_non_vowel);

	}
}
 