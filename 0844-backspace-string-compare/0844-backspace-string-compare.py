class Solution(object):
    def backspaceCompare(self, s, t):
        def process_string(s):
            stack = []
            for char in s:
                if char != '#':
                    stack.append(char)
                elif stack:
                    stack.pop()
            return ''.join(stack)

        processed_s = process_string(s)
        processed_t = process_string(t)

        return processed_s == processed_t
solution = Solution()

s1 = "ab#c"
t1 = "ad#c"
result1 = solution.backspaceCompare(s1, t1)
print(result1)  # Output: True

s2 = "ab##"
t2 = "c#d#"
result2 = solution.backspaceCompare(s2, t2)
print(result2)  # Output: True

s3 = "a#c"
t3 = "b"
result3 = solution.backspaceCompare(s3, t3)
print(result3)  # Output: False
