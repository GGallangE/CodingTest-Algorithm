import sys
input = sys.stdin.readline

T = int(input())
for i in range(T):
    a = input()
    X = list(a)
    sum = 0
    for j in X:
        if j == '(':
            sum += 1
        elif j == ')': sum -= 1

        if sum < 0:
            print("NO")
            break
    if sum == 0:
        print("YES")
    elif sum > 0:
        print("NO")
    