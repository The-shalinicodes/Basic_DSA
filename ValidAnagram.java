class Solution {
  public boolean anagramStrings(String s, String t) {
    s = s.toLowerCase();
    t = t.toLowerCase();

    s = s.replace(" ", "");
    t = t.replace(" ", "");

    int[] counts = new int[26];

    for (int i = 0; i < s.length(); i++) {
      counts[s.charAt(i) - 'a']++;
    }
    for (int i = 0; i < t.length(); i++) {
      counts[t.charAt(i) - 'a']--;
    }
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] != 0) {
        return false;
      }
    }
    return true;
  }
}
