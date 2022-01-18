while True:
    T = list(map(int, input().split()))
    if T[0] == 0:
        break
    else:
        print(T[0]//T[1],T[0]%T[1], '/', T[1])