N=int(input())
M=int(input())
numL = list(map(int, input().split()))
numL.sort()
N1=0
N2=N-1
res=0
while N1<N2:
    if numL[N1]+numL[N2]==M:
        res+=1
        N1+=1
        N2-=1
    elif numL[N1]+numL[N2]<M:
        N1+=1
    else:
        N2-=1
print(res)