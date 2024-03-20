class Solution(object):
    def addToArrayForm(self, num, k):
        """
        :type num: List[int]
        :type k: int
        :rtype: List[int]
        """
        li=[]
        number =int("".join(map(str,num)))
        sum=number+k
        while sum>0:
           n=sum%10
           li.append(n)
           sum=sum//10
        return li[::-1]