for _ in range(int(input())):
    H1 = input()
    H2 = input()
    res=0
    for i in range(len(H1)):
        if H1[i]!=H2[i]:
            res+=1
    print('Hamming distance is %d.'%res)