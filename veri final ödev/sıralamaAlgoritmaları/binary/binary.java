class Binary {
    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)   
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String args[]) {
        Binary ob = new Binary();
        int arr[] = { 2, 3, 4, 10, 40, 67, 89, 90, 99, 104 };
        int n = arr.length;
        int x = 8;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("bu eleman dizide yok");
        else
            System.out.println("bu eleman dizinde mevcut "
                    + result);
    }
}

