# https://www.acmicpc.net/problem/2789
# 문제
# 어떤 단어가 주어졌을 때, 검열을 거친 후에는 어떤 단어가 되는지 구하는 프로그램을 작성하시오.
# 입력 =>
# 첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 이 단어는 적어도 3글자이며, 많아야 100글자이다.
# 출력 =>
# 단어에서 CAMBRIDGE에 포함된 알파벳을 모두 지운 뒤 출력한다. 항상 정답의 길이는 0보다 크다.

A='CAMBRIDGE'
S=list(input())
res=''
for i in range(len(S)):
    if S[i] not in A:
        res+=S[i]
print(res)
