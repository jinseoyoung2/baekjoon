# https://www.acmicpc.net/problem/3085
# 문제
# N×N크기에 사탕을 채워 놓는다. 사탕의 색이 다른 인접한 두 칸을 고른다. 고른 칸에 들어있는 사탕을 서로 교환한다.
# 이제, 모두 같은 색으로 이루어져 있는 가장 긴 연속 부분(행 또는 열)을 고른 다음 그 사탕을 모두 먹는다.
# 입력 =>
# 첫째 줄에 보드의 크기 N이 주어진다. (3 ≤ N ≤ 50)
# 다음 N개 줄에는 보드에 채워져 있는 사탕의 색상이 주어진다.
# 사탕의 색이 다른 인접한 두 칸이 존재하는 입력만 주어진다.
# 출력 =>
# 첫째 줄에 상근이가 먹을 수 있는 사탕의 최대 개수를 출력한다.

N=int(input())
Bomboni = [list(input()) for _ in range(N)]
res=0
def bom(Bomboni):
    candy = 0
    for i in range(N):
        candy_row = 1
        candy_col = 1
        for j in range(N-1):
            if Bomboni[i][j]==Bomboni[i][j+1]:
                candy_row+=1
            else:
                candy=max(candy, candy_row)
                candy_row=1
            if Bomboni[j+1][i]==Bomboni[j][i]:
                candy_col+=1
            else:
                candy=max(candy, candy_col)
                candy_col=1
        candy = max(candy, candy_row, candy_col)
    return candy
for i in range(N):
    for j in range(N-1):
        if Bomboni[i][j] != Bomboni[i][j+1]:
            tmp = Bomboni[i][j]
            Bomboni[i][j] = Bomboni[i][j+1]
            Bomboni[i][j+1] = tmp
            res = max(res, bom(Bomboni))
            tmp = Bomboni[i][j]
            Bomboni[i][j] = Bomboni[i][j+1]
            Bomboni[i][j+1] = tmp
        if Bomboni[j][i] != Bomboni[j+1][i]:
            tmp = Bomboni[j][i]
            Bomboni[j][i] = Bomboni[j+1][i]
            Bomboni[j+1][i] = tmp
            res = max(res, bom(Bomboni))
            tmp = Bomboni[j][i]
            Bomboni[j][i] = Bomboni[j+1][i]
            Bomboni[j+1][i] = tmp
print(res)
