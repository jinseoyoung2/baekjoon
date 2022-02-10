# https://www.acmicpc.net/problem/7523

for i in range(int(input())):
    A,B=map(int, input().split())
    res=(B-A+1)*(A+B)//2
    print("Scenario #"+str(i+1)+":")
    print(res)
    print()
