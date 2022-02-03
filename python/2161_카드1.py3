NList = [i for i in range(1, int(input())+1)]
while len(NList)!=1:
    print(NList.pop(0), end=" ")
    NList.append(NList.pop(0))
print(NList[0])