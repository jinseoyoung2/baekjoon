N=int(input())
P=list(map(int, input().split()))
P.sort()
res=0
for i in range(N):
    for j in range(i+1):
        res+=P[j]
print(res)