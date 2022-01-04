def test(e):
    if len(res) == M:
        print(*res)
        return
    for i in range(e, N+1):
        if i in res:
            continue
        res.append(i)
        test(i+1)
        res.pop()
N,M=map(int, input().split())
res=[]
test(1)