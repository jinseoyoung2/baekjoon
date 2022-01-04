# https://www.acmicpc.net/problem/15650
# 문제
# 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
# 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
# 고른 수열은 오름차순이어야 한다.
# 입력 =>
# 첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
# 출력 =>
# 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다.
# 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
# 수열은 사전 순으로 증가하는 순서로 출력해야 한다.

def test(e):
    if len(res) == M:
        print(*res)
        return
    for i in range(e, N+1):
        if i in res:
            continue
        res.append(i)
        test(i+1) # 함수 호출, i에 1을 더한 값을 보냄
        res.pop()
N,M=map(int, input().split())
res=[]
test(1)
