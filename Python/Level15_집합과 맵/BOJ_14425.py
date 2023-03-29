import sys
input = sys.stdin.readline

N,M = map(int,input().split())
a = [str(input()) for _ in range(N)]
count = 0
for i in range(M):
    check = str(input())

    if check in a:
        count += 1
print(count)
