def missing(nums):
    n = 1
    nums = set(nums)
    while n in nums:
        n += 1
    return n


print(missing([1, 2, 3]))
