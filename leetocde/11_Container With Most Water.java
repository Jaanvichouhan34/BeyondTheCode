package leetocde;
class Solution {
    public int maxArea(int[] heights) {
       //w=h2-h1
       //h=min(h1,h2) 
       //a=H*w

       int maxarea=0;
       int l=0;
       int r=heights.length-1;
       while(l<r){
        int w=r-l;
        int h=Math.min(heights[r],heights[l]);
        int area=h*w;
        // if(maxarea<area){
        //     maxarea=area;
        // }

        maxarea=Math.max(area,maxarea);
        if(heights[r]>heights[l]){
            l++;
        }
else{r--;}

       }
       return maxarea;
    }
}