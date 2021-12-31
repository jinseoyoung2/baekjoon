# https://www.acmicpc.net/problem/11170
# 문제
# N부터 M까지의 수들을 종이에 적었을 때 종이에 적힌 0들을 세는 프로그램을 작성하라.
# 입력 =>
# 첫 번째 줄에 테스트 케이스의 수 T가 주어진다. 각 줄에는 N과 M이 주어진다.
# 출력 =>
# 각각의 테스트 케이스마다 N부터 M까지의 0의 개수를 출력한다.

for i in range(int(input())):
    N,M = map(int, input().split())
    count=0
    for j in range(N,M+1):
        count+=str(j).count('0')
    print(count)