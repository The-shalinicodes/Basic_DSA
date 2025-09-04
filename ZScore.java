class Solution {

  public int ZScore(int[] marks, int k) {

    Arrays.sort(marks);

    int n = marks.length;

    int left = 1;

    int right = n;

    int ans = 0;

    while (left <= right) {

      int mid = left + (right - left) / 2;

      if (marks[n - mid] >= mid * k) {

        ans = mid;

        left = mid + 1;

      } else {

        right = mid - 1;

      }

    }

    return ans;

  }

}