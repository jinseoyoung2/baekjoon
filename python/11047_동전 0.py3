# https://www.acmicpc.net/problem/11047
# 문제
# 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
# 입력 =>
# 첫째 줄에 N과 K가 주어진다. 둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. 
# 출력 =>
# 첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.

coinNum,money = map(int, input().split())
coin = [int(input()) for i in range(coinNum)] # 반복문을 돌며 입력 받은 값을 C에 배열로 저장
count = 0
for i in reversed(coin):
    count += money//i
    money%=i
print(count)
