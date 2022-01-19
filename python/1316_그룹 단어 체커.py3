# https://www.acmicpc.net/problem/1316
# 문제
# 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
# 입력 =>
# 첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다.
# 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
# 출력 =>
# 첫째 줄에 그룹 단어의 개수를 출력한다.

G=0
for i in range(int(input())):
    S = input()
    newS = ''
    N=0
    for j in range(0, len(S)-1):
        if S[j]!=S[j+1]:
            newS = S[j+1:]
            if S[j] in newS:
                N+=1
    if N==0:
        G+=1
print(G)
