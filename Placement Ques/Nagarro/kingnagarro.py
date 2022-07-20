# def houses(input):
#     a, b = 0, 1
#     for i in range(input + 1):
#         c=a+b
#         a, b = b,a+b
#     return b * b


# print(houses(5))












def calculateTime(X, Y, n, walls):
    jumps = 0
    for i in range(0, n):
        reach = X
        jump = 1
        while reach < walls[i]:
            reach += X - Y
            jump += 1
        jumps += jump
    return jumps


X = int(input())
Y = int(input())
n = int(input())
walls = list(map(int, input().split(" ")))
print(calculateTime(X, Y, n, walls))
