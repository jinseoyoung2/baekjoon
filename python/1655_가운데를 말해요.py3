# https://www.acmicpc.net/problem/1655

import sys
import heapq

maxH = []
minH = []
for _ in range(int(sys.stdin.readline())):
    num = int(sys.stdin.readline())

    if len(maxH) == 0:
        heapq.heappush(maxH, -1 * num)
    elif len(minH) == len(maxH):
        heapq.heappush(maxH, -1 * num)
    else:
        heapq.heappush(minH, num)

    if len(minH) != 0 and len(maxH) != 0 and minH[0] < (-1 * maxH[0]):
        minT = heapq.heappop(minH)
        maxT = heapq.heappop(maxH)
        heapq.heappush(maxH, -1 * minT)
        heapq.heappush(minH, -1 * maxT)
    print(-1 * maxH[0])
