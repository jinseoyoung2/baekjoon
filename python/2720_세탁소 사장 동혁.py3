# https://www.acmicpc.net/problem/2720
# 문제 
# 거스름돈의 액수가 주어지면 줘야할 쿼터(Quarter, $0.25)의 개수, 다임(Dime, $0.10)의 개수,
# 니켈(Nickel, $0.05)의 개수, 페니(Penny, $0.01)의 개수를 구하는 프로그램을 작성하시오.
# 거스름돈은 항상 $5.00 이하이고, 손님이 받는 동전의 개수를 최소로 하려고 한다.
# 입력 =>
# 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 거스름돈 C를 나타내는 정수 하나로 이루어져 있다. C의 단위는 센트이다
# 출력 =>
# 각 테스트케이스에 대해 필요한 쿼터의 개수, 다임의 개수, 니켈의 개수, 페니의 개수를 공백으로 구분하여 출력한다.

for i in range(int(input())):
    C=int(input())
    print(C//25, (C%25)//10, ((C%25)%10)//5, (((C%25)%10)%5)//1)
