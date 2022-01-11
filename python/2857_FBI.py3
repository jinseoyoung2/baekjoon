# https://www.acmicpc.net/problem/2857
# 문제
# 5명의 요원 중 FBI 요원을 찾는 프로그램을 작성하시오.
# 입력 =>
# 5개 줄에 요원의 첩보원명이 주어진다. 알파벳 대문자, 숫자 0~9, 대시 (-)로만 이루어져 있으며, 최대 10글자이다.
# 출력 =>
# 첫째 줄에 FBI 요원을 출력한다. 이때, 해당하는 요원이 몇 번째 입력인지를 공백으로 구분하여 출력해야 하며,
# 오름차순으로 출력해야 한다. 만약 FBI 요원이 없다면 "HE GOT AWAY!"를 출력한다

err=1
for i in range(1,6):
    fbi=input()
    if fbi.find('FBI')!=-1:
        print(i)
        err=0
if err == 1:
    print('HE GOT AWAY!')
