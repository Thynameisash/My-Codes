from collections import Counter

list = [2, 2, 3, 2, 3, 2]
count = Counter(list)
listrev = list[::-1]

for num in listrev:
    if count[num] >= 3:
        listrev.remove(num)
        listrev.remove(num)
        listrev.remove(num)
        count[num] -= 3

print(listrev[::-1])
