for _ in range(int(input())):
    S = list(input())
    num = list(str(int("".join(S)) + int("".join(reversed(S)))))
    if "".join(num) == "".join(reversed(num)):
        print('YES')
    else:
        print('NO')
