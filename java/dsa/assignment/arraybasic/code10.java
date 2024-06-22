 class MaxOddSum {
    public static void main(String[] args) {
        int[] arr = {4,3,-3,-5};

        int maxOddSum = findMaxOddSum(arr);
        System.out.println("Maximum sum where sum is odd: " + maxOddSum);
    }

    public static int findMaxOddSum(int[] arr) {
        int maxSum = 0;

        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) { // Check if current element is odd
                int currentSum = 0;

                // Calculate sum of all subsequent elements
                for (int j = i; j < arr.length; j++) {
                    currentSum += arr[j];

                    // Check if currentSum is odd and greater than maxSum
                    if (currentSum % 2 != 0 && currentSum > maxSum) {
                        maxSum = currentSum;
                    }
                }
            }
        }

        return maxSum;
    }
}

