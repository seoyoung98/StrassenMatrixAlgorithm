public static int[][] matrixMul(int n, int[][] matrixX, int[][] matrixY) {
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      for (int k = 0; k < n; k++) {
        result[i][j] += matrixX[i][k] * matrixY[k][j];
      }
    }
  }
}
