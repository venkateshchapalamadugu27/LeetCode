class Solution:
    def arrangeWords(self, text: str) -> str:
        res=text.split()
        res.sort(key=len)
        # print(res)
        s=" ".join(res)
        return s.capitalize()