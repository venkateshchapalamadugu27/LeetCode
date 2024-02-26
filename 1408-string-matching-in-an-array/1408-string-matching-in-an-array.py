class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        result=[]
        for word in words:
            for word2 in words:
                if word!=word2 and word in word2 :
                    result.append(word)
        return list(set(result))