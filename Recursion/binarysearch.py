def bs(nums, target, start, end):
    if start > end:
        return -1
    mid = start + (end - start) // 2
    if nums[mid] == target:
        return mid
    if nums[mid] > target:
        return bs(nums, target, start, mid - 1)
    else:
        return bs(nums, target, mid + 1, end)

nums = [10, 20, 30, 80, 85, 90]
print(bs(nums, 80, 0, len(nums) - 1))
