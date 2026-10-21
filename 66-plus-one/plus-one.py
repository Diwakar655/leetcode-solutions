class Solution:
    def plusOne(self, digits: list[int]) -> list[int]:
        digits = map(str, digits)
        num = "".join(digits)
        num = list(str(int(num)+1))
        num = map(int, num)
        return list(num)
        


        