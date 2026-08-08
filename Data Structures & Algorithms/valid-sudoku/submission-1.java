class Solution {
    public boolean isValidSudoku(char[][] board) {

        List<HashSet<Character>> row = new ArrayList<>();
        List<HashSet<Character>> column = new ArrayList<>();
        List<HashSet<Character>> square = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            row.add(new HashSet<>());
            column.add(new HashSet<>());
            square.add(new HashSet<>());
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if( board[i][j] !='.' && (row.get(i).contains(board[i][j]) || column.get(j).contains(board[i][j]) || square.get((i/3)*3 + (j/3)).contains(board[i][j]) ) ){
                    return false;
                }
                row.get(i).add(board[i][j]);
                column.get(j).add(board[i][j]);
                square.get((i/3)*3 + (j/3)).add(board[i][j]);
            }
        }
        
        return true;
    }
}
