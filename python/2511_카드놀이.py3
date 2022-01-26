# https://www.acmicpc.net/problem/2511
# 입력 =>
# 입력 파일은 두 개의 줄로 이루어진다. 첫 번째 줄에는 A가 늘어놓은 카드의 숫자들이 빈칸을 사이에 두고 순서대로 주어진다.
# 두 번째 줄에는 B가 늘어놓은 카드의 숫자들이 빈칸을 사이에 두고 순서대로 주어진다. 
# 출력 =>
# 첫 번째 줄에는 게임이 끝난 후, A와 B가 받은 총 승점을 순서대로 빈칸을 사이에 두고 출력한다.
# 두 번째 줄에는 이긴 사람이 A인지 B인지 결정해서, 이긴 사람을 문자 A 또는 B로 출력한다. 만약 비기는 경우에는 문자 D를 출력한다. 

A = list(map(int, input().split()))
B = list(map(int, input().split()))
numA=0
numB=0
last=''
if A==B:
    print(10, 10)
    print('D')
else:
    for i in range(10):
        if A[i]>B[i]:
            numA+=3;
            last='A'
        elif A[i]<B[i]:
            numB+=3;
            last='B'
        else:
            numA+=1;
            numB+=1;
    print(numA, numB)
    if numA>numB:
        print('A')
    elif numA<numB:
        print('B')
    else:
        print(last)
