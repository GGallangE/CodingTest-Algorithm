location = input()
row = int(location[1])
column = int(ord(location[0]) - ord('a')) + 1

move = [(1, 2), (-1, 2), (-1, -2), (1, -2), (2, 1), (-2, 1), (-2, -1), (2, -1)]
count = 0

for i in range(len(move)):
    if column + move[i][0] >= 1 and column + move[i][0] <= 8 and row + move[i][1] >= 1 and row + move[i][1] <= 8:
        count += 1
        
print(count)