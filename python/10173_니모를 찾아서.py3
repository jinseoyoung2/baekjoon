while True:
    s = input()
    if s=='EOI':
        break
    else:
        s=s.lower()
        if s.find('nemo')!=-1:
            print('Found')
        else:
            print('Missing')