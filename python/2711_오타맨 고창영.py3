for _ in range(int(input())):
    A,B = input().split()
    print(B[:int(A)-1]+B[int(A):])