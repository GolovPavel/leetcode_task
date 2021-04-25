package ru.golov.leetcode.tasks.medium.number_of_islands;

class Solution {
    public int numIslands(char[][] grid) {
        var islandCount = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    islandCount++;
                    markVisited(grid, i, j);
                }
            }
        }
        
        return islandCount;
    }
    
    private void markVisited(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != '1') {
            return;
        }
        
        grid[i][j] = '2';
        
        markVisited(grid, i - 1, j);
        markVisited(grid, i + 1, j);
        markVisited(grid, i, j - 1);
        markVisited(grid, i, j + 1);
    }
}