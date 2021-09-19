class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l = len(nums)
        nums[:] = [x for x in nums if x]
        nums += [0] * (l - len(nums))
