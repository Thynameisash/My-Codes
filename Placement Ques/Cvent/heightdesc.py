a = [3, 2, 90, 86, -1, 7, 9, -1, 6, 5]
b = []
for i in a:
    if i != -1:
        b.append(i)

b.sort(reverse=True)
for i in range(len(a)):
    if a[i] == -1:
        b.insert(i, -1)
print(b)
