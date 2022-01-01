for i in range(int(input())):
    moneylist=[]
    namelist=[]
    for j in range(int(input())):
        money,name=input().split()
        moneylist.append(int(money))
        namelist.append(name)
    print(namelist[moneylist.index(max(moneylist))])