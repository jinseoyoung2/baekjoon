A1 = [1,2,3,3,4,10]
B1 = [1,2,2,2,3,5,10]
for i in range(int(input())):
    A2 = list(map(int, input().split()))
    B2 = list(map(int, input().split()))
    A3 = [x*y for x,y in zip(A1,A2)]
    B3 = [x*y for x,y in zip(B1,B2)]
    if sum(A3)==sum(B3):
        print('Battle '+str(i+1)+': No victor on this battle field')
    elif sum(A3)<sum(B3):
        print('Battle '+str(i+1)+': Evil eradicates all trace of Good')
    elif sum(A3)>sum(B3):
        print('Battle '+str(i+1)+': Good triumphs over Evil')