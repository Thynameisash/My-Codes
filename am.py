def minhp(l, armor):
    s = sum(l)
    ans = 0
    if s > armor:
        ans = s - armor + 1
    else:
        ans = s - max(l) + 1
    return ans


print(minhp([1, 2, 3], 1))
print(minhp([1, 2, 7, 6], 5))  # ( 16 + 5 = 21 )
print(minhp([1, 2, 6, 7, 100], 50))  # ( 116 + 50 ) = 166 + 1 = 67
print(minhp([1, 2, 6, 7, 100], 200))  # ( 116 + 200 ) = 316 + 1 = 317
print(minhp([100, 100, 100], 200))
# 300 dmg to ho hi rha hai , armor sirf 200 bachayega , +1
# sum of array - armor
