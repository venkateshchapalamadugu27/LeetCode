class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        for x in ransomNote :
            if x not in magazine or magazine.count(x)<ransomNote.count(x) :
                return False
        return True