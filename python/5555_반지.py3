S = input()
res=0
for _ in range(int(input())):
    i = input()
    if (i+i).count(S):
        res+=1
print(res)