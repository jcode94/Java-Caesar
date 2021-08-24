// Justice Smith
// 08.2021
// caesar cipher implementation

import java.util.Scanner;
import java.lang.StringBuilder;

public class Caesar
{
	public static void main(String [] args)
	{
		Scanner mainScanner = new Scanner(System.in);
		System.out.println("Enter text to decrypt(paste for large blocks):");
		
		StringBuilder toDecrypt = new StringBuilder();
		
		toDecrypt.append(mainScanner.nextLine());
		
		try
		{
			for (int i = 1; i < 26; i++)
			{
				decrypt(toDecrypt.toString(), i);
			}
		} 
		catch (final Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Thanks for playing!");
	}
	
	private static void decrypt(String encryptedStr, int shiftVal)
	{
		StringBuilder decryptedStr = new StringBuilder();
		for (char letter : encryptedStr.toCharArray())
		{
			if (Character.isLetter(letter))
			{
				letter = Character.toLowerCase(letter); // line-length shortening
				
				if ((letter + shiftVal) <= 'z')
				{
					decryptedStr.append((char)(letter + shiftVal));
				}
				else
				{
					decryptedStr.append((char)('a' + (letter + shiftVal - 'z' - 1)));
				}
			}
			else
			{
				decryptedStr.append(letter); // non-letter char
			}
		}
		
		System.out.println("Shift(" + shiftVal + "): \t" + decryptedStr.toString());
	}
}