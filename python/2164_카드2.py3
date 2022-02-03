from collections import deque
NList = deque([i for i in range(1, int(input())+1)])
while len(NList)!=1:
    NList.popleft()
    NList.append(NList.popleft())
print(NList[0])