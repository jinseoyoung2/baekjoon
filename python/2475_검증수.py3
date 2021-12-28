# 문제 : https://www.acmicpc.net/problem/2475

A=list(input().split())
B=0
for i in A:
   B+=int(i)*int(i)
print(B%10)