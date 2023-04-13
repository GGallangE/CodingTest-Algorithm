import sys
from collections import deque
input = sys.stdin.readline

queue = deque([])
N = int(input())

for i in range(N):
    X = input().split()
    if X[0] == 'push': queue.append(X[1])
    elif X[0] == 'front' :
        if not queue : print(-1)
        else : print(queue[0])
    elif X[0] == 'back' :
        if not queue : print(-1)
        else : print(queue[-1])
    elif X[0] == 'empty' :
        if not queue : print(1)
        else : print(0)
    elif X[0] == 'pop' :
        if not queue : print(-1)
        else : print(queue.popleft())
    elif X[0] == 'size' :
        print(len(queue))


