
class Solution {
    public List<Integer> transformArray(List<Integer> arr) {
        int n = arr.size();
        boolean changed = true;

        while (changed) {
            changed = false;
            List<Integer> temp = new ArrayList<>(arr); // Copy the list

            for (int i = 1; i < n - 1; i++) {
                if (arr.get(i) < arr.get(i - 1) && arr.get(i) < arr.get(i + 1)) {
                    temp.set(i, arr.get(i) + 1);
                    changed = true;
                } else if (arr.get(i) > arr.get(i - 1) && arr.get(i) > arr.get(i + 1)) {
                    temp.set(i, arr.get(i) - 1);
                    changed = true;
                }
            }

            arr = new ArrayList<>(temp); // Update the list
        }

        return arr;
    }
}
