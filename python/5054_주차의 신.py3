# https://www.acmicpc.net/problem/5054

t = int(input())
for i in range(t):
    n = input()
    xi = list(map(int, input().split()))
    print(2*(max(xi)-min(xi)))