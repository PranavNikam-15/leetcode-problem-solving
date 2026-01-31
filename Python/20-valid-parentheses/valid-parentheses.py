class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        brackets = {')': '(', '}': '{', ']': '['}

        for ch in s:
            if ch in brackets:
                last = stack.pop() if stack else None
                if last != brackets[ch]:
                    return False
            else:
                stack.append(ch)

        return len(stack) == 0