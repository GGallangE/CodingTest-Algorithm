N = int(input())
locations = input().split()
x, y = 1, 1

dx = [0, 0, -1, +1]
dy = [-1, +1, 0, 0]
direction = ['L', 'R', 'U', 'D']

for location in locations:
    for i in range(len(direction)):
        if location == direction[i]:
           temp_x = x + dx[i]
           temp_y = y + dy[i]
           # 일단 무조건 임시 저장 후 아래 if문으로 조건 맞지 않을시 저장하지 않고 continue
           
    if temp_x < 1 or temp_y < 1 or temp_x > N or temp_y > N:
        continue
        
    x = temp_x
    y = temp_y
        
print(x, y) 