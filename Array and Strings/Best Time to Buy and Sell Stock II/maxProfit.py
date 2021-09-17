class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        i = 0
        res = 0
        while i < len(prices) - 1:
            if prices[i] > prices[i + 1]:
                i += 1
            else:
                j = i + 1
                while j < len(prices) - 1 and prices[j] < prices[j + 1]:
                    j += 1
                res += prices[j] - prices[i]
                i = j + 1
        return res
