#10813
N,M = map(int,input().split())

basket = [(number+1) for number in range(N)]
for _ in range(M):
    i,j = map(int,input().split())
    temp = basket[i-1]
    basket[i-1] = basket[j-1]
    basket[j-1] = temp

for i in range(N):
    print(basket[i] , end=" ")