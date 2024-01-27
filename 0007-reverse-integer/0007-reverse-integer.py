class Solution:
    def reverse(self, x: int) -> int:
       if x>0:
           x=str(x)
           x=x[::-1]
           x=int(x)
           y=x
       else:
           x=abs(x)
           x=str(x)
           x=x[::-1]
           x=int(x)
           y=-x

       if y >= -2**31 and y <= 2**31 - 1:
              return y
       else:
            return 0

           

    