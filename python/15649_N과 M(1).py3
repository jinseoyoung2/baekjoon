def test():
    if len(res) == M:
        print(*res)
        return
    for i in range(1, N+1):
        if i in res:
            continue
        res.append(i)
        test()
        res.pop() 
N,M=map(int, input().split())
res=[]
test()