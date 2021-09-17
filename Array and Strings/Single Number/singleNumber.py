class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        d = {}
        for num in nums:
            d[num] = d.get(num, 0) + 1
        # return list(d.keys())[list(d.values()).index(1)]
        for key, value in d.items():
            if value == 1:
                return key
