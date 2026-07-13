public class Mountain1095 {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;

        System.out.println(search(num, target));
    }

    // Main search function
    public static int search(int[] num, int target) {

        int peak = peakElement(num);

        // Search in ascending part
        int firstSearch = binarySearch(num, target, 0, peak);

        if (firstSearch != -1) {
            return firstSearch;
        }

        // Search in descending part
        return binarySearch(num, target, peak + 1, num.length - 1);
    }

    // Find peak element
    public static int peakElement(int[] num) {

        int start = 0;
        int end = num.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (num[mid] > num[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    // Binary Search (works for both ascending and descending arrays)
    public static int binarySearch(int[] num, int target, int start, int end) {

        boolean isAsc = num[start] < num[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (num[mid] == target) {
                return mid;
            }

            if (isAsc) {

                if (target < num[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {

                if (target < num[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }
        }

        return -1;
    }
}