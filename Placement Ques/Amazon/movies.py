def minGroups(movies, k):
    movies.sort()
    print(movies)
    ret = []
    l = 0
    for r in range(len(movies)):
        if (movies[r] - movies[l]) > k:
            ret.append(movies[l:r])
            l = r

    ret.append(movies[l : r + 1])
    print(ret)
    return len(ret)


print(minGroups([1, 5, 4, 6, 8, 9, 2], 3))
