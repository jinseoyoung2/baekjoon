A = int(input())
for i in range(A):
    B,C = map(int, input().split())
    D = B*C
    while B%C!=0:
        B,C=C,B%C
    print(D//C)