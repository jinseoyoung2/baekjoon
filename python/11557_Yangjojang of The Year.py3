for _ in range(int(input())):
    SL=[]
    for i in range(int(input())):
        S,L=input().split()
        SL.append([S, int(L)])
    SL=sorted(SL, key=lambda x: x[1])
    print(SL[-1][0])