numsFirst = [1, 2, 3]
s = "".join(map(str, numsFirst))
sum = str(int(s) + int(s[::-1]))
list = [int(x) for x in sum]
print(list)
