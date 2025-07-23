class Solution {
  public void reverse(int[] arr, int n) {
    int p1 = 0, p2 = n - 1;
    while (p1 < p2) {
      int temp = arr[p1];
      arr[p1] = arr[p2];
      arr[p2] = temp;
      p1++;
      p2--;
    }
    return;
  }
}
