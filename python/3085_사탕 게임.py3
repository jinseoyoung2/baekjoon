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