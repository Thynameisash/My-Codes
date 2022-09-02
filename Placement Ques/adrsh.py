n = [1, 2, 3, 4, 5, 6]
k = [1, 0, 1]
res = []
i = 0

# Make res list
for i in range(len(n) - len(k) + 1):
    res.append(n[i : i + len(k)])

# Index of 0s in K
zeroes = []
for i in range(len(k)):
    if k[i] == 0:
        zeroes.append(i)

# Set 0 to A[k]
for i in zeroes:
    for sublist in res:
        sublist[i] = 0

print(res)
