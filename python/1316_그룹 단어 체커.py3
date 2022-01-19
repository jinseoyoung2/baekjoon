G=0
for i in range(int(input())):
    S = input()
    newS = ''
    N=0
    for j in range(0, len(S)-1):
        if S[j]!=S[j+1]:
            newS = S[j+1:]
            if S[j] in newS:
                N+=1
    if N==0:
        G+=1
print(G)