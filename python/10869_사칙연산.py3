# 문제 : 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
# 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.

A,B = input().split() # input으로 입력받은 후 split을 통해 공백을 기준으로 나눠 저장
A = int(A) # 정수로 형변환하여 저장
B = int(B)
print(A+B) # 결과값 출력
print(A-B)
print(A*B)
print(int(A/B))
print(A%B)
