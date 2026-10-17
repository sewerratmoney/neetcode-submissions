class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    area = Math.max(area, explore(grid, r, c));
                }
            }
        }
        return area;
    }

    public int explore(int[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != 1)
            return 0;

        grid[r][c] = 2;
        int area = 1;
        area += explore(grid, r + 1, c);
        area += explore(grid, r, c + 1);
        area += explore(grid, r - 1, c);
        area += explore(grid, r, c - 1);

        System.out.println(area);

        return area;
    }
}
