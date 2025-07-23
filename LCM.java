class Solution {
  public int GCD(int num1, int num2) {
    while (num1 > 0 && num2 > 0) {
      if (num1 > num2) {
        num1 = num1 % num2;
      } else {
        num2 = num2 % num1;
      }
    }
    if (num1 == 0) {
      return num2;
    }
    return num1;
  }

  public int LCM(int num1, int num2) {
    int gcd = GCD(num1, num2);
    int lcm = (num1 * num2) / gcd;
    return lcm;
  }
}
