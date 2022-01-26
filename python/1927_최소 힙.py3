import sys
import heapq
heap = []
for _ in range(int(input())):
    N = int(sys.stdin.readline())
    if N == 0:
        if not heap:
            print(0)
        else:
            print(heapq.heappop(heap))
    else:
        heapq.heappush(heap, N)