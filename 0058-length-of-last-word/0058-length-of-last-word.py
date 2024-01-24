class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        li=s.split()
        y=li[-1]
        return len(y)