package Solution;

/**
 * Find the total area covered by two rectilinear rectangles in a 2D plane.

Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
 * @author wangqiang
 *
 */
public class LeetCode223 {
	
	 public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
	        int rectangle1 = (A-C)*(B-D);
	        int rectangle2 = (E-G)*(F-H);
	        
	        //若这两个矩形无交集直接返回面积和
	        if(E>C||H<B||G<A||F>D) return rectangle1+rectangle2;
	        
	        int a = Math.min(C,G)-Math.max(A,E);//相交矩形的宽
	        int b = Math.min(D,H)-Math.max(B,F);//相交矩形的高
	        
	        return rectangle1+rectangle2-a*b;
	    }

}
