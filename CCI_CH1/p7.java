class p7{
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
            { 11,12,13,14,15},
            { 21,0,23,24,25},
            { 31,32,33,34,35},
            { 41,42,43,0,45},
            { 51,52,53,54,55}
        };
        p7 p = new p7();
        p.SetZero(matrix);
        PrintMatrix(matrix);
    }

    public void SetZero(int[][] matrix){
        boolean row[] = new boolean[matrix.length];
        boolean column[] = new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    column[i] = true;
                }
            }
        }
        for(int i=0;i<row.length;i++){
            if(row[i]){
                for(int j=0;j<column.length;j++) matrix[i][j] = 0;
            }
        }

        for(int j=0;j<column.length;j++){
            if(column[j]){
                for(int i=0;i<row.length;i++) matrix[i][j] = 0;
            }
        }
    }

    static void PrintMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++) System.out.print(matrix[i][j]+"\t");
            System.out.println();
        }
    }
}
