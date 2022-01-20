A,B = input().split()
res=''
if len(A)>len(B):
    B='0'*(len(A)-len(B))+B
else:
    A='0'*(len(B)-len(A))+A
for i in range(len(A)):
    res+=str(int(A[i])+int(B[i]))
print(res)