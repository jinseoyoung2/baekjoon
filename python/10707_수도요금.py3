X=int(input())
Y1=int(input())
Y2=int(input())
Y3=int(input())
J=int(input())
Y=Y1+(J-Y2)*Y3
if J>=Y2:
    print(X*J if X*J<=Y else Y)
else:
    print(X*J if X*J<=Y1 else Y1)