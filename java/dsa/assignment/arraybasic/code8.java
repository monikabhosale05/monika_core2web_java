class Demo {
    public static void main(String[] args) {
        int n = 11;
        int arr[] = new int[]{9, 12, 23, 10, 12, 12, 15, 23, 14, 12, 15};
        int mark = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] == mark) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    mark=arr[j];
                }
            }

            if (count % 2 == 0) {
                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }
    }
}

