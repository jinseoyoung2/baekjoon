# https://www.acmicpc.net/problem/4435
# 문제
# 중간계는 매우 신비한 곳이어서 각 전투의 승리는 날씨, 장소, 용맹에 영향을 받지 않는다. 전투에 참여한 각 종족의 점수를 합한 뒤, 큰 쪽이 이긴다.
# 전투에 참여한 종족의 수가 주어졌을 때, 어느 쪽이 이기는지 구하는 프로그램을 작성하시오.
# 입력 =>
# 첫째 줄에 전투의 개수 T가 주어진다. 각 전투는 두 줄로 이루어져 있다. 
# 첫째 줄에 간달프 군대에 참여한 종족의 수가 주어진다. 이 값은 공백으로 구분되어 있으며, 호빗, 인간, 엘프, 드워프, 독수리, 마법사 순서이다. 
# 둘째 줄에는 사우론 군대에 참여한 종족의 수가 주어진다. 이 값 역시 공백으로 구분되어 있으며, 오크, 인간, 워그, 고블린, 우럭하이, 트롤, 마법사 순서이다. 
# 모든 값은 음이 아닌 정수이고, 각 군대의 점수의 합은 32비트 정수 제한을 넘지 않는다.
# 출력 =>
# 각 전투에 대해서, "Battle"과 전투 번호를 출력한다. 그 다음에 간달프의 군대가 이긴다면 "Good triumphs over Evil"를, 
# 사우론의 군대가 이긴다면 "Evil eradicates all trace of Good", 점수의 합이 같아 이기는 쪽이 없다면 "No victor on this battle field"를 출력한다.

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
