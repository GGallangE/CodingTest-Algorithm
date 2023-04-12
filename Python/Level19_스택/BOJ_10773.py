import sys
input = sys.stdin.readline

K = int(input())

stack = []
for i in range(K):
    number = int(input())
    if number != 0:
        stack.append(number)
    else:
        if len(stack) != 0:
            stack.pop()

sum = 0
for i in range(len(stack)):
    sum += stack[i]
print(sum)