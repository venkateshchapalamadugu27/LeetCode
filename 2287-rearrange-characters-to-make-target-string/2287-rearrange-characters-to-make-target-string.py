class Solution:
    def rearrangeCharacters(self, s: str, target: str) -> int:
        li=[]
        for x in target:
            li.append(s.count(x)//target.count(x))
        print(li)
        return min(li)