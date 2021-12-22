A,B,C = map(int, input().split())
D = 0
if A==B==C:
    D=10000+A*1000
elif A==B or B==C:
    D=1000+B*100
elif A==C:
    D=1000+A*100
else:
    D=max(A,B,C)*100
print(D)