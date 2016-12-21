class p6{
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
            { 11,12,13,14,15},
            { 21,22,23,24,25},
            { 31,32,33,34,35},
            { 41,42,43,44,45},
            { 51,52,53,54,55}
        };
        p6 p = new p6();
        p.RotateImage(matrix);
        PrintMatrix(matrix);
    }

    public void RotateImage(int[][] matrix){
        int n = matrix[0].length;
        for (int layer=0;layer<n/2;layer++){
            int first = layer; //left most column
            int last = n-1-layer; //right most column of the layer
            for (int i=first;i<last;i++){
                int offset = i-first; // how far the row from its begining <-> how close the column from its bottom
                //save top
                int top = matrix[first][i];
                //top = left
                // row of new top (first) is from column (first) of left
                // column of new top is from last-(how far i from its first)=last-(i-first)=last-offset
                matrix[first][i] = matrix[last-offset][first];
                //left = bottom
                matrix[last-offset][first] = matrix[last][last-offset];
                //bottom = right
                matrix[last][last-offset] = matrix[i][last];
                //right = top
                matrix[i][last] = top;
            }
        }
    }
    static void PrintMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++) System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
    }
}
