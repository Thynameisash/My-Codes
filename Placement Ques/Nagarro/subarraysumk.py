class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        res = 0
        m = {0: 1}
        prefix = 0
        for i in range(0, len(nums)):
            prefix += nums[i]
            if prefix - k in m:
                res += m[prefix - k]
            if prefix in m:
                m[prefix] += 1
            else:
                m[prefix] = 1
        return res
        
