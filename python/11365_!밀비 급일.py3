# https://www.acmicpc.net/problem/11365
# 문제
# 암호가 뒤집으면 해독된다는 것을 발견했다. 암호를 해독하는 프로그램을 작성하시오.
# 입력 =>
# 한 줄에 하나의 암호가 주어진다. 암호의 길이는 500을 넘지 않는다.
# 마지막 줄에는 "END"가 주어진다.
# 출력 =>
# 각 암호가 해독된 것을 한 줄에 하나씩 출력한다.

while True:
    A = input()
    if A=='END':
        break
    else:
        print("".join(reversed(A)))
