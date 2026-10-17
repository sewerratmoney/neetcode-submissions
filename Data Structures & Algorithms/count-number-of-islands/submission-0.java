class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        for (int col = 0; col < grid[0].length; col++) {
            for (int row = 0; row < grid.length; row++) {
                if (grid[row][col] == '1') {
                    explore(grid, row, col);
                    islands += 1;
                }
            }
        }
        return islands;
    }

    public void explore(char[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != '1')
            return;

        if (grid[r][c] == '1')
            grid[r][c] = '2';

        explore(grid, r + 1, c);
        explore(grid, r, c + 1);
        explore(grid, r - 1, c);
        explore(grid, r, c - 1);
    }
}
