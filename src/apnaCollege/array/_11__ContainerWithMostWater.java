package apnaCollege.array;

public class _11__ContainerWithMostWater {
    // brute force
    // time complexity -> O(N^2)
    // space complexity -> O(1)
//    public int maxArea(int[] height) {
//        int maxArea = 0;
//
//        for (int i = 0; i < height.length; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                int minHeight = Math.min(height[i], height[j]);
//                int width = j - i;
//                int cArea = minHeight * width;
//                if (cArea > maxArea) maxArea = cArea;
//            }
//        }
//        return maxArea;
//    }


    // two pointers
    // time complexity -> O(N)
    // space complexity -> O(1)
    public int maxArea(int[] height) {
        int maxArea = 0;
        int start = 0;
        int end = height.length - 1;

        while (start < end) {
            int h = Math.min(height[start], height[end]);
            int w = end - start;
            int currentArea = h * w;
            if (currentArea > maxArea) maxArea = currentArea;

            while (height[start] <= h && start < end) start++;
            while (height[end] <= h && start < end) end--;
        }
        return maxArea;
    }
}
