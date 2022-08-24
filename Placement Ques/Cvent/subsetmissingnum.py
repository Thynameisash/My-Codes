def subsets(nums):
    res = []
    sub = []

    def dfs(i):
        if i >= len(nums):
            res.append(sub.copy())
            return
        sub.append(nums[i])
        dfs(i + 1)

        sub.pop()
        dfs(i + 1)

    dfs(0)
    ans = 0
    for i in res:
        n = 1
        while n in i:
            n += 1
        ans += n
    print(ans)
    return res


subsets([1, 2, 1])
