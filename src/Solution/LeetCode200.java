package Solution;


/**
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:

11110
11010
11000
00000
Answer: 1

Example 2:

11000
11000
00100
00011
Answer: 3
 * @author wangqiang
 *
 */
public class LeetCode200 {
	
	  int x[] = {-1,0,1,0};
	    int y[] = {0,1,0,-1};
	    
	    //将该小岛所有领土标记为x
	    public void explore(int i,int j,char[][] grid) {
	        grid[i][j] = 'x';
	        for(int k=0;k<4;k++) {
	            if(i+y[k]<grid.length&&i+y[k]>=0&&j+x[k]<grid[i].length&&j+x[k]>=0&&grid[i+y[k]][j+x[k]]=='1') {
	                explore(i+y[k],j+x[k],grid);
	            }
	        }
	    }
	    
	    public int numIslands(char[][] grid) {
	        int count = 0;
	        for(int i=0;i<grid.length;i++) {
	            for(int j=0;j<grid[i].length;j++) {
	                if(grid[i][j]=='1') {
	                    explore(i,j,grid); //将该小岛所有领土标记为x
	                    count++;
	                }
	            }
	        }
	        return count;
	    }

}
