from collections import defaultdict


class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        row = defaultdict(set)
        col = defaultdict(set)
        box = defaultdict(set)
        for i in range(9):
            for j in range(9):
                n = board[i][j]
                if n != '.':
                    idx = f'{i // 3}-{j // 3}'
                    if n in row[i] or n in col[j] or n in box[idx]:
                        return False
                    row[i].add(n)
                    col[j].add(n)
                    box[idx].add(n)
        return True
