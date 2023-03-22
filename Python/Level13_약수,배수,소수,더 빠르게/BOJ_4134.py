import sys
import math

input = sys.stdin.readline
n = int(input())

def isPrime(a):
  if a == 0 or a == 1:
    return False
  for i in range(2, int(math.sqrt(a))+1):
    if(a%i==0):
      return False
  return True

# run time error

# for i in range(n):
#     N = int(input())
#     list = []
#     for i in range(N+1):
#         if(isPrime(i)):
#             list.append(i)
    
#     if list[len(list) -1] == N: print(i)
#     else:
#         while True:
#             N += 1
#             if(isPrime(N)): 
#                 print(N)
#                 break
#     a += 1


T = int(input())
for i in range(T):
    z = int(input())
    while True:
        if isPrime(z):
            print(z)
            break
        else:
            z += 1