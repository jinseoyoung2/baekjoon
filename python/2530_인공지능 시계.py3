A,B,C=map(int,input().split())
D=int(input())
C+=D
if C>=60:
    B+=C//60
    C%=60
if B>=60:
    A=(A+B//60)%24
    B%=60
print(A, B, C)