# https://www.acmicpc.net/problem/10768

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
