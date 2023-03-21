import sys
x,y,w,h = map(int,sys.stdin.readline().split())

min = min(min(x-0,w-x),min(y-0,h-y))
print(min)