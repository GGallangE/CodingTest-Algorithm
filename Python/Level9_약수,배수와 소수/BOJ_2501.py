import sys

N,K = map(int,sys.stdin.readline().split())
measure = []
for i in range(1,N+1):
    if N % i == 0: measure.append(i)

if len(measure) < K: print(0)
else: print(measure[K-1])