A='CAMBRIDGE'
S=list(input())
res=''
for i in range(len(S)):
    if S[i] not in A:
        res+=S[i]
print(res)