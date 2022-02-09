# https://www.acmicpc.net/problem/10810

N,M = map(int, input().split())
A = [0]*(N+1)
for _ in range(M):
    i, j, k = map(int, input().split())
    for n in range(i, j+1):
        A[n] = k 
for x in range(1, N+1):
    print(A[x], end = ' ')
