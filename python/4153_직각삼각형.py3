while True:
    x=list(map(int, input().split()))
    if x[0]==x[1]==x[2]==0:
        break
    x.sort()
    if (x[0]*x[0])+(x[1]*x[1])==(x[2]*x[2]):
        print('right')
    else:
        print('wrong')