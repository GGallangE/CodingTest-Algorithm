    #10811
N,M = map(int,input().split())
basket = [(number+1) for number in range(N)]

for _ in range(M):
    i,j = map(int,input().split())
    basket = basket[:i-1] + basket[i-1:j][::-1] + basket[j:]

for i in basket:
    print(i,end=" ")
    