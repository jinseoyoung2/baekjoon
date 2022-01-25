S=input()
if S.count(':-)')==0 and S.count(':-(')==0:
    print('none')
elif S.count(':-)')>S.count(':-('):
    print('happy')
elif S.count(':-)')<S.count(':-('):
    print('sad')
else:
    print('unsure')