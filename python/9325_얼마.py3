A=int(input())
for i in range(A):
    money=int(input())
    B=int(input())
    if B!=0:
        for j in range(B):
            C,D=map(int,input().split())
            money=money+C*D
    print(money)