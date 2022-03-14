# https://www.acmicpc.net/problem/2530

A,B,C=map(int,input().split()) # 입력받은 문자열을 공백을 기준으로 나누고 정수로 형변환
D=int(input()) # 입력받은 문자를 정수로 형변환
C+=D
if C>=60:
    B+=C//60 # // => 나누기 연산 후 소수점 이하의 수를 버리고, 정수 부분의 수만 구함
    C%=60
if B>=60:
    A=(A+B//60)%24 # A와 B를 더하고 60으로 나눈 값의 정수를 다시 24로 나눈 나머지 값 
    B%=60
print(A, B, C)
