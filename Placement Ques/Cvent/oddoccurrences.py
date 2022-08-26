def odd():
    a = [9, 3, 9, 3, 7, 7, 7]
    res = 0
    num = []
    for i in a:
        res ^= i
    print(res)


odd()
