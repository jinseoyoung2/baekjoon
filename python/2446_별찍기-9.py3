N=int(input())
for i in range(0, 2*N):
    if i<N:
        print(' '*i+'*'*(2*(N-i)-1))
    elif i>N:
        print(' '*(2*N-i-1)+'*'*(2*(i-N)+1))