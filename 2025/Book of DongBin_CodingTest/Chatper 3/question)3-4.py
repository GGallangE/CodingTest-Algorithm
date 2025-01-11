N = int(input())
coin = list(map(int,input().split()))
coin.sort()
join = 1


for i in coin:
    if join < i:
        break
    join += i
        
print(join)
            
            
            
        