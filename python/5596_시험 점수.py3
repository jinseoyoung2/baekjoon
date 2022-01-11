st1 = list(map(int, input().split()))
st2 = list(map(int, input().split()))
if sum(st1) >= sum(st2):
    print(sum(st1))
else:
    print(sum(st2))