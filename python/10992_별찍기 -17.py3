# https://www.acmicpc.net/problem/10992

star = int(input())
for i in range(1, star+1):
    if i == 1:
        print(' '*(star-i)+'*')
    elif i == star:
        print('*'*(2*star-1))
    else:
        print(' '*(star-i)+'*'+' '*(2*i-3)+'*')
        
