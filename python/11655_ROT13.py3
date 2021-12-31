# https://www.acmicpc.net/problem/11655
# 문제
# ROT13은 카이사르 암호의 일종으로 영어 알파벳을 13글자씩 밀어서 만든다.
# 문자열이 주어졌을 때, "ROT13"으로 암호화한 다음 출력하는 프로그램을 작성하시오.
# 입력 =>
# 첫째 줄에 알파벳 대문자, 소문자, 공백, 숫자로만 이루어진 문자열 S가 주어진다. S의 길이는 100을 넘지 않는다.
# 출력 =>
# 첫째 줄에 S를 ROT13으로 암호화한 내용을 출력한다.

S=input()
ROT13 = ''
for i in S:
    if 'a' <= i <= 'z':
        ROT13 += chr((ord(i)+13) if i <= 'm' else ord(i)-13) 
    elif 'A' <= i <= 'Z':
        ROT13 += chr((ord(i)+13) if i <= 'M' else ord(i)-13)
    else:
        ROT13 += i
print(ROT13)

# ord() : 한문자를 아스키 코드값으로 변환
# chr() : 아스키 코드값을 문자로 변환
