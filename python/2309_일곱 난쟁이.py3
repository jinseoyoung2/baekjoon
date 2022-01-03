list = [int(input()) for _ in range(9)]
for i in list:
    for j in list:
        if i!=j and 100==sum(list)-(j+i):
            list.remove(i)
            list.remove(j)
list.sort()
for n in list:
    print(n)