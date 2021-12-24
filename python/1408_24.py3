a1,a2,a3 = map(int,input().split(':')) # ':'를 기준으로 나눠 정수형으로 저장
b1,b2,b3 = map(int,input().split(':')) 
a4=a1*3600+a2*60+a3 
b4=b1*3600+b2*60+b3 
if a4>b4: 
    b4+=24*3600 # 24시간을 분단위로 변경
c4=b4-a4
c1=str(c4//3600) 
c2=str(c4%3600//60) 
c3=str(c4%3600%60) 
if len(c1)<2:
    c1='0'+c1
if len(c2)<2:
    c2='0'+c2
if len(c3)<2:
    c3='0'+c3
print(c1+':'+c2+':'+c3)
