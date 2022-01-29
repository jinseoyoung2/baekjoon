sum = 0
for _ in range(5):
    N=int(input())
    sum+=40 if N<40 else N
print(sum//5)