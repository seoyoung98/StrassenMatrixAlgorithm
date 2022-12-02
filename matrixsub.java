private int[][] matrixSub(int[][] matrixX, int[][] matrixY) {
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      matrixResult[i][j] = matrixX[i][j] - matrixY[i][j];
    }
  }
}
