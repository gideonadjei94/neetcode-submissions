class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        int resMaxArea = Integer.MIN_VALUE;

        while (left < right){
          int h = Math.min(heights[left], heights[right]);
          int area = (right - left) * h;
          resMaxArea = Math.max(resMaxArea, area);

          if (heights[left] == h)
              left++;
          else if(heights[right] == h)
              right--;
        }

        return resMaxArea;
    }
}
