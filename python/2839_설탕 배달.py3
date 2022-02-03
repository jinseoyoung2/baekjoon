N=int(input())
res=0
while True:
    if N<0:
        print(-1)
        break
    if N%5==0:
        res+=N//5
        print(res)
        break
    N-=3
    res+=1