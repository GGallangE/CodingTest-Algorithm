import sys
from collections import deque
input = sys.stdin.readline

N = int(input())
queue = deque([])
for i in range(1,N+1):
    queue.append(i)

while True:
    if len(queue) == 1:
        print(queue[0])
        break
    queue.popleft()
    queue.append(queue.popleft())
