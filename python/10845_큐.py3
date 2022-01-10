# https://www.acmicpc.net/problem/10845

import sys
stack = []
for i in range(int(sys.stdin.readline())):
    N = sys.stdin.readline().split()
    if N[0] == 'push':
        stack.append(N[1])
    elif N[0] == 'pop':
        if len(stack)==0:
            print(-1)
        else:
            print(stack.pop(0))
    elif N[0] == 'empty':
        if len(stack)==0:
            print(1)
        else:
            print(0)
    elif N[0] == 'size':
        print(len(stack))
    elif N[0] == 'front':
        if len(stack)==0:
            print(-1)
        else:
            print(stack[0])
    elif N[0] == 'back':
        if len(stack)==0:
            print(-1)
        else:
            print(stack[-1])
