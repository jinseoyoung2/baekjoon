for _ in range(3):
    a1,a2,a3,b1,b2,b3=map(int,input().split())
    s1=a1*60*60+a2*60+a3
    s2=b1*60*60+b2*60+b3
    s=s2-s1
    res1=(s//60)//60%24
    res2=(s//60)%60
    res3=s%60
    print(res1,res2,res3)