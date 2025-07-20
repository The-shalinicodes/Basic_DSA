class Solution {
  public int countOddDigit(int n) {
    int Count_Odd_Digits = 0;
    while (n > 0) {
      int lastDigit = n % 10; // Extract Digit
      if (lastDigit % 2 == 1) {
        Count_Odd_Digits++;
      }
      n = n / 10; // Remove Digit
    }
    return Count_Odd_Digits;
  }
}
