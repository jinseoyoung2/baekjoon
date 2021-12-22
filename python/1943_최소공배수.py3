A = int(input()) # input으로 입력받아 int형으로 저장
for i in range(A): # range에 반복할 횟수 지정
    B,C = map(int, input().split()) # 입력받은 문자열을 공백을 기준으로 나누고 정수로 형변환
    D = B*C
    while B%C!=0:
        B,C=C,B%C
    print(D//C)
