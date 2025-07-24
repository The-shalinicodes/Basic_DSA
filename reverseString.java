class Solution {
  public void reverseString(Vector<Character> s) {
    int p1 = 0;
    int p2 = s.size() - 1;
    while (p1 < p2) {
      char temp = s.get(p1);
      s.set(p1, s.get(p2));
      s.set(p2, temp);
      p1++;
      p2--;
    }
  }
}
