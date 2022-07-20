def rotate(arr, k):
    s1 = ""
    s2 = ""
    s3 = ""
    for i in arr:
        s1 = arr[:k]
        s2 = arr[k:]
        s3 = s2 + s1
    return s3


print(rotate([1 ,3 ,6 ,11, 12, 17, 22, 26 ,30 ,33 ,38 ], 78))
