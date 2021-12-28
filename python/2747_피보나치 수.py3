# https://www.acmicpc.net/problem/2747
# 문제 : n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

# 입력 => 첫째 줄에 n이 주어진다. n은 45보다 작거나 같은 자연수이다.
# 출력 => 첫째 줄에 n번째 피보나치 수를 출력한다.

N=int(input())
A=0
B=1
for i in range(N):
    A, B = B, A+B
print(A)