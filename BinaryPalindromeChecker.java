import java.util.*;

public class BinaryPalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        int decimalNumber = sc.nextInt();
        String binary = decimalToBinary(decimalNumber);
        
        System.out.println("Binary representation: " + binary);
        
        if (isPalindrome(binary)) {
            System.out.println("Binary representation is a palindrome.");
        } else {
            System.out.println("Binary representation is not a palindrome.");
        }
    }
    
    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        
        while (decimal > 0) {
            int bit = decimal & 1;  // Get the least significant bit
            binary.insert(0, bit); // Insert the bit at the beginning of the string
            decimal >>= 1; // Right shift the decimal number by 1 bit
        }
        
        return binary.toString();
    }
    
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
}
