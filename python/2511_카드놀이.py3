A = list(map(int, input().split()))
B = list(map(int, input().split()))
numA=0
numB=0
last=''
if A==B:
    print(10, 10)
    print('D')
else:
    for i in range(10):
        if A[i]>B[i]:
            numA+=3;
            last='A'
        elif A[i]<B[i]:
            numB+=3;
            last='B'
        else:
            numA+=1;
            numB+=1;
    print(numA, numB)
    if numA>numB:
        print('A')
    elif numA<numB:
        print('B')
    else:
        print(last)