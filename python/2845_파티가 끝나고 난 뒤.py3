L,P = map(int, input().split())
list = list(map(int, input().split()))
for i in list:
    print(i-L*P, end=' ')