# https://www.acmicpc.net/problem/2309
# 문제
# 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.
# 아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.
# 입력 =>
# 아홉 개의 줄에 걸쳐 난쟁이들의 키가 주어진다. 주어지는 키는 100을 넘지 않는 자연수이며,
# 아홉 난쟁이의 키는 모두 다르며, 가능한 정답이 여러 가지인 경우에는 아무거나 출력한다.
# 출력 =>
# 일곱 난쟁이의 키를 오름차순으로 출력한다. 일곱 난쟁이를 찾을 수 없는 경우는 없다.

list = [int(input()) for _ in range(9)]
for i in list:
    for j in list:
        if i!=j and 100==sum(list)-(j+i):
            list.remove(i)
            list.remove(j)
list.sort()
for n in list:
    print(n)
