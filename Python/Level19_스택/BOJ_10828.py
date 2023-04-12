import sys
input = sys.stdin.readline

N = int(input())
i = 1
stack = []
while True:
    if i > N: break
    X = input().split()
    if X[0] == 'push':
        stack.append(X[1])
    elif X[0] == 'pop':
        if len(stack) == 0:
            print(-1)
        else: print(stack.pop())
    elif X[0] == 'top':
        if len(stack) == 0:
            print(-1)
        else: print(stack[-1])
    elif X[0] == 'size':
        print(len(stack))
    elif X[0] == 'empty':
        if len(stack) == 0:
            print(1)
        else: print(0)
    i += 1