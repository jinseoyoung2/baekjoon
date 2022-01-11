# https://www.acmicpc.net/problem/5596
# 문제
# 4과목의 점수를 입력하면, 총점 S와 총점 T 중에서 큰 점수를 출력하는 프로그램을 작성하시오.
# 단, 서로 동점일 때는 총점 S를 출력한다.
# 입력 =>
# 입력은 2줄로 이루어져 있다. 정보, 수학, 과학, 영어 점수(정수형)가 있으며, 공백으로 구분되어 있다.
# 출력 =>
# 문제에서 요구하는 정답을 출력한다.

st1 = list(map(int, input().split()))
st2 = list(map(int, input().split()))
if sum(st1) >= sum(st2):
    print(sum(st1))
else:
    print(sum(st2))
