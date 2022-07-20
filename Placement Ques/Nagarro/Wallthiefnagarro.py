def wall(a, b, c, d):
    jumps, sum = 0, 0

    for i in range(len(d)):
        sum += d[i]
    while jumps <= sum:
        netdist = a - b
        jumps += netdist
    return jumps // c


print(wall(5, 1, 2, [20, 30, 50]))
