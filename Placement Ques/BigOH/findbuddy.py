nums = [25, 85, 89, 63, 20, 80]
target = 100
map = {}
flag = 0
for i, val in enumerate(nums):

    tg = target - val
    if tg in map:
        flag = 1
    map[val] = i

if flag == 1:
    print([nums[map[tg]], nums[i]])
else:
    print("No Buddy Found")
