while 1: # 무한 반복 1===true
    A,B=map(int,input().split()) # 입력받은 문자열을 공백을 기준으로 나누고 정수로 형변환
    if A==0 and B==0:
        break # A도 0 B도 0일 경우 break로 while문 탈출 
    elif A>B:
        print('Yes')
    else:
        print('No')
