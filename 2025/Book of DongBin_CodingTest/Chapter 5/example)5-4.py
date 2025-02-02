def reversive_function(i):
    if i == 100:
        return
    print(i, "번째 재귀 함수에서", i + 1, "번쨰 재귀 함수를 호출합니다")
    print(1)
    reversive_function(i + 1)
    print(2)
    print(i, "번재 재귀 함수를 종료합니다")

reversive_function(1)