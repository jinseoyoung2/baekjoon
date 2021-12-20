# 문제 : 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

A,B = input().split() # input으로 입력받은 후 split을 통해 공백을 기준으로 나눠 저장
print(int(A)-int(B)) # A와 B를 정수로 형변환시켜 계산 후 결과값 출력

