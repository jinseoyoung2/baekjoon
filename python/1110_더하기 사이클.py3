N=int(input())
res=N
cnt=0
while True:
    A=res//10
    B=res%10
    res=(B*10)+((A+B)%10)
    cnt+=1
    if res==N:
        break
print(cnt)