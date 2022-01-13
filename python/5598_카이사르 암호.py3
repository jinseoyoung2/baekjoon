S = list(input())
res = ''
for i in S:
    if ord(i)>=68:
        res+=chr(ord(i)-3)
    else:
        res+=chr(ord(i)+23)
print(res)