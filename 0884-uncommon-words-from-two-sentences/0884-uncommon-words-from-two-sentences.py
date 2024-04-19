class Solution(object):
    def uncommonFromSentences(self, s1, s2):
        """
        :type s1: str
        :type s2: str
        :rtype: List[str]
        """
        li1=s1.split()
        li2=s2.split()
        res=[]
        for x in li1:
            if x not in li2 and li1.count(x)==1:
                res.append(x)
        for x in li2:
            if x not in li1 and li2.count(x)==1:
                res.append(x)
        return list(set(res))