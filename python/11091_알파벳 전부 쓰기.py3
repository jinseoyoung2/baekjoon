for i in range(int(input())):
    S = input().lower();
    sS = '';
    for i in range(ord('a'), ord('z')+1):
        if chr(i) not in S:
            sS+=chr(i)
    if len(sS)==0:
        print('pangram')
    else:
        print('missing '+sS)