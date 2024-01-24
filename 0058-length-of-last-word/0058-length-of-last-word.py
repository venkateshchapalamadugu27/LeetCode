class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        li=s.split()
        print(li)
        return len(li[-1])