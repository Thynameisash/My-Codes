def check(inputs, laptops, selection, budget):
    laptops = sum(laptops, [])
    budget = sum(budget, [])
    ans = []
    for j in range(0, len(budget), 2):
        globalmax = 0
        for i in range(0, len(laptops), 2):
            if laptops[i] >= budget[j] and laptops[i] <= budget[j + 1]:
                maxrating = laptops[i + 1]
                globalmax = max(maxrating, globalmax)
        ans.append(globalmax)
    print(ans)


check(5,[[1000, 300], [1100, 400], [1300, 200], [1700, 500], [2000, 600]],3,[[1000, 1400], [1700, 1900], [0, 2000]])
