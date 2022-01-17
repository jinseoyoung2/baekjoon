# https://www.acmicpc.net/problem/10768
# 문제
# 날짜가 2월 18일 전이면, "Before"을 출력한다. 만약 날짜가 2월 18일 후면, "After"을 출력한다. 만약 2월 18일이라면 "Special" 을 출력한다.
# 입력 =>
# 입력은 두 개의 정수가 각 줄에 걸쳐 입력된다. 이 정수들은 2015년의 날짜에 포함된다.
# 첫 번째 줄은 1에서 12사이의 월을 입력한다.
# 두 번째 줄은 1에서 31사이의 그 달에 들어있는 날짜를 입력한다 .
# 출력 =>
# 마지막 줄에 "Before", "After"나 "Special"을 출력한다.

# 풀이1
M=int(input())
D=int(input())
if M<2:
    print('Before')
elif M>2:
    print('After')
else:
    if D<18:
        print('Before')
    elif D>18:
        print('After')
    else:
        print('Special')
       
# 풀이2
M=int(input())*100
D=int(input())
MD=M+D
if MD<218:
    print('Before')
elif MD==218:
    print('Special')
else:
    print('After')
