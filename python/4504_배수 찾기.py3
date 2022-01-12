# https://www.acmicpc.net/problem/4504
# 문제
# 목록에 들어있는 수가 n의 배수인지 아닌지를 구하는 프로그램을 작성하시오.
# 입력 =>
# 첫째 줄에 n이 주어진다. 다음 줄부터 한 줄에 한 개씩 목록에 들어있는 수가 주어진다
# 이 수는 0보다 크고, 10,000보다 작다. 목록은 0으로 끝난다.
# 출력 =>
# 목록에 있는 수가 n의 배수인지 아닌지를 구한 뒤 예제 출력처럼 출력한다.

num=int(input())
while True:
    N = int(input())
    if N==0:
        break
    if N%num==0:
        print(N,'is a multiple of '+str(num)+'.')
    else:
        print(N,'is NOT a multiple of '+str(num)+'.')
