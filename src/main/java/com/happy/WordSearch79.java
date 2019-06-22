package com.happy;

/**
 * 第79题 单词搜索
 * 给定一个二维网格和一个单词，找出该单词是否存在于网格中。
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中相邻单元格是那些水平相邻或垂直相邻的单元格。
 * 同一个单元格内的字母不允许被重复使用。
 *
 * @author qgl
 * @date 2019/06/22
 */
public class WordSearch79 {
    /**
     * 深度优先搜索 + 回溯算法
     *
     * @param board
     * @param word
     * @return
     */
    public boolean exist(char[][] board, String word) {
        if (board == null || word == null) {
            return false;
        }
        int row = board.length;
        int column = board[0].length;
        char[] words = word.toCharArray();
        boolean[][] visit = new boolean[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (backTrack(board, i, j, row, column, visit, words, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backTrack(char[][] board, int i, int j, int row, int column, boolean[][] visit, char[] words, int index) {
        if (i < 0 || j < 0 || i >= row || j >= column || board[i][j] != words[index] || visit[i][j]) {
            return false;
        }
        if (index == words.length - 1) {
            return true;
        }

        visit[i][j] = true;
        if (backTrack(board, i + 1, j, row, column, visit, words, index + 1) ||
                backTrack(board, i, j + 1, row, column, visit, words, index + 1) ||
                backTrack(board, i - 1, j, row, column, visit, words, index + 1) ||
                backTrack(board, i, j - 1, row, column, visit, words, index + 1)) {
            return true;
        }
        visit[i][j] = false;
        return false;
    }
}
