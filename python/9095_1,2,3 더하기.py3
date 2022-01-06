def test(e):
    if e==1:
        return 1
    elif e==2:
        return 2
    elif e==3:
        return 4
    else:
        return test(e-1)+test(e-2)+test(e-3)

for i in range(int(input())):
    e=int(input())
    print(test(e))