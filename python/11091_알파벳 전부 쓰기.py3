# https://www.acmicpc.net/problem/11091
# 문제
# 어떠한 문장이 팬그램인지 아닌지를 판별해주는 프로그램을 짜는 것이다.
# 입력 =>
# 입력의 첫 번째 줄은 1 ≤ N ≤ 50의 N이 주어진다.
# 다음 N개의 줄은 각각 한 문장이 주어지는데, 알파벳의 대소문자, 공백, 숫자, 그리고 분장부호들(. , ? ! ' ")이 포함될 수 있다.
# 각 문장은 최소 한개의 문자를 포함하며 100개를 넘지는 않는다.
# 출력 =>
# 각 입력에 대해, 팬그램에 해당하면 "pangram"을 출력한다.
# 만약 팬그램이 아닐 경우, "missing"을 출력한 후 한칸 띄고 문장에 나타나지 않은 문자들을 모두 출력한다.
# 나타나지 않은 문자들은 모두 소문자로 출력하며 알파벳 순서대로 정렬된상태로 출력해야 한다.

for i in range(int(input())):
    S = input().lower();
    sS = '';
    for i in range(ord('a'), ord('z')+1):
        if chr(i) not in S:
            sS+=chr(i)
    if len(sS)==0:
        print('pangram')
    else:
        print('missing '+sS)
