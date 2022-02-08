for _ in range(int(input())):
    S = input()
    res = [0,0,0,0,0,0,0,0]
    for i in range(38):
        A=S[i:i+3]
        if A=='TTT':
            res[0]+=1
        elif A=='TTH':
            res[1]+=1
        elif A=='THT':
            res[2]+=1
        elif A=='THH':
            res[3]+=1
        elif A=='HTT':
            res[4]+=1
        elif A=='HTH':
            res[5]+=1
        elif A=='HHT':
            res[6]+=1
        elif A=='HHH':
            res[7]+=1
    for j in res:
        print(j, end=" ")