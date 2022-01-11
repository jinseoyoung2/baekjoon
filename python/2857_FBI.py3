num=1
err=0
while True:
    try:
        fbi=input()
        if fbi.find('FBI')!=-1:
            print(num)
            err=1
        num+=1
    except EOFError:
        if err==0:
            print('HE GOT AWAY!')
        break
