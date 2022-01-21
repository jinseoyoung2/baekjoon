for i in range(int(input())):
    N=int(input())
    print('Pairs for %d:'%N, end=' ')
    num=1
    for j in range((N-1)//2):
        if j!=0:
            print(',', end=' ')
        print(num, N-num, end='')
        num+=1
    print()