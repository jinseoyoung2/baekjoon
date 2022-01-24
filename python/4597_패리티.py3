while True:
    Bit = input()
    if Bit == '#':
        break
    if Bit[-1]=='e':
        if Bit.count('1')%2==0:
            print(Bit[:-1]+'0')
        else:
            print(Bit[:-1]+'1')
    elif Bit[-1]=='o':
        if Bit.count('1')%2==0:
            print(Bit[:-1]+'1')
        else:
            print(Bit[:-1]+'0')