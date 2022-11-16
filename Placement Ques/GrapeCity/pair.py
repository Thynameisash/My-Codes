def pair(A):
    A = sorted(A)
    return abs(sum(A[::2]) - sum(A[1::2]))


print(pair([9, 3, 9, 3, 9, 7, 9]))  # 3 3 7 9 9 9 9
