# https://www.acmicpc.net/problem/5361

for _ in range(int(input())):
    n = list(map(int, input().split()))
    m = [350.34,230.90,190.55,125.30,180.90]
    res = 0
    for i in range(5):
        res+=n[i]*m[i]
    print('$%.2f'%res)
