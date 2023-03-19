import sys

def kind(a,b):
    if a%b == 0: print("multiple")
    elif b%a == 0: print("factor")
    else: print("neither")

while True:
    A,B = map(int,sys.stdin.readline().split())
    if A ==0 and B == 0: break
    kind(A,B)

