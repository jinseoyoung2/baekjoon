num=int(input())
while True:
    N = int(input())
    if N==0:
        break
    if N%num==0:
        print(N,'is a multiple of '+str(num)+'.')
    else:
        print(N,'is NOT a multiple of '+str(num)+'.')