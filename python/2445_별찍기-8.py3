N=int(input())
for i in range(1, 2*N):
    if i<=N:
        print('*'*i+' '*(2*(N-i))+'*'*i)
    else:
        print('*'*(2*N-i)+' '*(2*(i-N))+'*'*(2*N-i))