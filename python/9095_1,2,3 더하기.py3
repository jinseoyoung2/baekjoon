# https://www.acmicpc.net/problem/9095
# 문제
# 정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
# 입력 =>
# 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.
# 출력 =>
# 각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.

def test(e):
    if e==1:
        return 1
    elif e==2:
        return 2
    elif e==3:
        return 4
    else:
        return test(e-1)+test(e-2)+test(e-3)

for i in range(int(input())):
    e=int(input())
    print(test(e))
