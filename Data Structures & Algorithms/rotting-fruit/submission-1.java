class Solution {
    public int orangesRotting(int[][] grid) {
        int[][] dirs = new int[][] {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        Queue<int[]> q = new LinkedList<>();
        int freshCount = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 2) {
                    q.add(new int[] {r, c});
                }
                if (grid[r][c] == 1) {
                    freshCount += 1;
                }
            }
        }

        System.out.println("f count: " + freshCount);
        if (q.size() == 0)
            return 0;

        int time = -1;
        while (!q.isEmpty()) {
            int count = q.size();

            System.out.println("queue size at time " + time + ": " + count);
            while (count > 0) {
                int[] curRC = q.poll();
                int r = curRC[0];
                int c = curRC[1];
                for (int[] dir : dirs) {
                    int nR = r + dir[0];
                    int nC = c + dir[1];

                    if (nR < 0 || nR >= grid.length || nC < 0 || nC >= grid[0].length) {
                        continue;
                    }

                    if (grid[nR][nC] == 1) {
                        q.add(new int[] {nR, nC});
                        grid[nR][nC] = 2;
                        freshCount -= 1;
                    }
                }
                count -= 1;
            }
            time += 1;
        }
        System.out.println("f count: " + freshCount);
        if (freshCount != 0)
            return -1;
        return time;
    }
}
