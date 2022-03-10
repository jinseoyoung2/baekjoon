# https://www.acmicpc.net/problem/10988

A=list(input())
B=list(reversed(A)) # reversed()를 이용해 A의 순서를 뒤바꿈
if A==B:
    print(1)
else:
    print(0)
