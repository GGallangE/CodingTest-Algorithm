n = 1260
count = 0

money = [500,100,50,10]

for coin in money:
    count += n // coin
    n %= coin
    
print(count)