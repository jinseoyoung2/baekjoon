A,B = input().split()
Max = int(A.replace('5','6'))+int(B.replace('5','6'))
Min = int(A.replace('6','5'))+int(B.replace('6','5'))
print(Min, Max)