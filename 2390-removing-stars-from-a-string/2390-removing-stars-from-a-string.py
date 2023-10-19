class Solution(object):
    def removeStars(self, s):
        def process_string(s):
            stack = []
            for char in s:
                if char != '*':
                    stack.append(char)
                elif stack:
                    stack.pop()
            return ''.join(stack)
        return process_string(s)        
        