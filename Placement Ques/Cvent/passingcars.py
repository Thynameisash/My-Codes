def cars():
    a = [0, 1, 0, 1, 1]
    east = 0
    pair = 0

    for i in range(len(a)):
        if a[i] == 0:
            east += 1
        else:
            pair += east

    print(pair)


cars()
