# https://www.acmicpc.net/problem/3062
# 문제
# 원래 수와 뒤집은 수를 합한 수가 좌우 대칭이 되는지 테스트 하는 프로그램을 작성하시오.
# 입력 =>
# 입력의 첫 줄에는 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄에 하나의 정수 N(10 ≤ N ≤ 100000)이 주어진다.
# 출력 =>
# 각 테스트 케이스에 대해서 원래 수와 뒤집은 수를 합한 수가 좌우 대칭이 되면 YES를 아니면 NO를 한 줄에 하나씩 출력한다.

for _ in range(int(input())):
    S = list(input())
    num = list(str(int("".join(S)) + int("".join(reversed(S)))))
    if "".join(num) == "".join(reversed(num)):
        print('YES')
    else:
        print('NO')
