class Solution:
    def reverse(self, x: int) -> int:
        sign = -1 if x < 0 else 1
        x *= sign
        res = sign * int(str(x)[::-1])
        return res if -2**31 <= res <= 2**31 - 1 else 0
