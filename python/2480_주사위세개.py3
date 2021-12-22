A,B,C = map(int, input().split()) # 입력받은 문자열을 공백을 기준으로 나누고 정수로 형변환
D = 0
if A==B==C: # A,B,C의 값이 같은 경우
    D=10000+A*1000
elif A==B or B==C: # A와 B 또는 B와 C의 값이 같은 경우
    D=1000+B*100
elif A==C: # A와 C의 값이 같은 경우
    D=1000+A*100
else:
    D=max(A,B,C)*100 # max 함수로 A,B,C 중 가장 큰 값을 찾음
print(D)
