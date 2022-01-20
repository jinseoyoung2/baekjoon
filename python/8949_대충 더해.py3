# https://www.acmicpc.net/problem/8949
# 문제
# "받아 올림"을 하지 않고 그냥 두 숫자의 합을 적어버린다. 
# 입력 =>
# 두 정수 A, B가 공백을 두고 주어진다. A와 B는 1과 1,000,000 사이의 정수이다.
# 출력 =>
# 더한 결과를 출력한다.

A,B = input().split()
res=''
if len(A)>len(B):
    B='0'*(len(A)-len(B))+B
else:
    A='0'*(len(B)-len(A))+A
for i in range(len(A)):
    res+=str(int(A[i])+int(B[i]))
print(res)
