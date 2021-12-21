A,B=map(int,input().split())
C=int(input())
if B+C>=60:
    A=(A+int((B+C)/60))%24
    B=int((B+C)%60)
else:
    B+=C
print(A, B)