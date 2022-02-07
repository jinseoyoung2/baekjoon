A,B,C = map(int, input().split())
T = [list(map(int, input().split())) for _ in range(3)]
lastT = max(T[0][1],T[1][1],T[2][1])
resT = 0
for i in range(1, lastT+1):
    cntT = 0
    # 트럭이 머물러있었을 경우
    if T[0][0]< i <=T[0][1]:
        cntT+=1
    if T[1][0]< i <=T[1][1]:
        cntT+=1
    if T[2][0]< i <=T[2][1]:
        cntT+=1
    # 시간동안 머문 트럭 수
    if cntT==1:
        resT+=A*cntT
    elif cntT==2:
        resT+=B*cntT
    elif cntT==3:
        resT+=C*cntT
print(resT)