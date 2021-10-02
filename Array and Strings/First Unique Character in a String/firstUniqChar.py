class Solution:
    def firstUniqChar(self, s: str) -> int:
        seen = set()
        for i in range(len(s)):
            c = s[i]
            if c not in seen:
                if c in s[i + 1:]:
                    seen.add(c)
                else:
                    return i
        return -1
