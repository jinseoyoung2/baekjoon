for _ in range(int(input())):
    A = []
    for _ in range(int(input())):
        A.append(int(input()))
    B = max(A)
    if A.count(B) != 1:
        print('no winner')
    else:
        if sum(A)//2<B:
            print('majority winner',A.index(B)+1)
        else:
            print('minority winner',A.index(B)+1)