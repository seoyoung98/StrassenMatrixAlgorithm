# StrassenMatrixAlgorithm
#### 2021.1학기 중간고사
### 1. 스트라센 행렬 알고리즘이란?
독일의 수학자인 폴커 스트라센에 의해 고안된, 행렬 곱셈 알고리즘\
**장점** - 일반 정렬에 따라 ``N * N`` 크기의 두 행렬을 곱하면 O(n^3) 의 시간이 소요되지만 스트라센 알고리즘을 사용한다면 실행시간이 ``O(n^2)`` 에 가까워진다\
![image](https://user-images.githubusercontent.com/80522538/205192050-05026682-d343-4129-a7c7-289b4be24f3a.png)


##### 일반적인 행렬의 경우
총 8번의 곱셈과 4번의 덧셈이 필요 \
 C11 = A11B11 + A12B21 \
 C12 = A11B12 + A12B22 \
 C13 = A21B11 + A22B21 \
 C14 = A21B12 + A22B22 \
![image](https://user-images.githubusercontent.com/80522538/205192091-fb285f46-fdd3-44d7-ac60-c4649cb72dbf.png)


##### Strassen의 경우
일반 행렬의 경우 연산수가 많으므로 행렬의 곱셈을 더하기 연산으로 풀어서 각 원소를 구할 수 있는 M이라는 연산 행렬로 표현할 수 있다 \
7번의 곱셈과 10번의 덧셈의 연산으로 나타냄\
M1 = (A11 + A22) (B11 + B22) \
M2 = (A21 + A22) B11 \
M3 = A11 (B12 - B22) \
M4 = A22 (B21 - B11) \
M5 = (A11 + A12) B22 \
M6 = (A21 - A11) (B11 + B12) \
M7 = (A12 - A22) (B21 + B22) \

이제 이 M행렬로 C행렬을 표현하게되면 \
 C11 = M1 + M4 - M5 + M7 \
 C12 = M3 + M5 \
 C21 = M2 + M4 \
 C22 = M1 - M2 + M3 + M6 \
##### 분할 정복 알고리즘과 동일하며 M에서는 각 행렬을 작은 단위로 분할하며 최종 행렬을 구하기 위해서는 분할된 원소를 재조립하는 과정으로 최종 행렬을 얻어낸다
