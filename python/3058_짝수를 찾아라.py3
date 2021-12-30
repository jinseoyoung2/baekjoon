T=int(input())
for i in range(T):
    A=list(map(int, input().split()))
    B=[]
    for j in A:
        if j%2==0:
            B.append(j)
    print(sum(B), min(B))