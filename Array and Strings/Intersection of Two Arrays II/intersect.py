class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        res = []
        #i = j = 0
        #nums1, nums2 = sorted(nums1), sorted(nums2)
        # while i < len(nums1) and j < len(nums2):
        #    a, b = nums1[i], nums2[j]
        #    if a == b:
        #        res.append(a)
        #        i += 1
        #        j += 1
        #    elif a < b:
        #        i += 1
        #    else:
        #        j += 1
        d1, d2 = {}, {}
        for num in nums1:
            d1[num] = d1.get(num, 0) + 1

        for num in nums2:
            d2[num] = d2.get(num, 0) + 1

        for key, value in d1.items():
            if key in d2:
                res += [key] * min(value, d2[key])

        return res
