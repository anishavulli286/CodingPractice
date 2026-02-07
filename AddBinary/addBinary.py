def addBinary(a: str, b: str) -> str:
        i, j = len(a)-1, len(b)-1
        carry = 0
        out = []

        while i >= 0 or j >= 0 or carry:
            if i >= 0:
                carry += ord(a[i]) - ord('0')
                i -= 1
            if j >= 0:
                carry += ord(b[j]) - ord('0')
                j -= 1
            out.append(str(carry & 1))
            carry >>= 1
        return "".join(reversed(out))
    
a = input("Enter one binary number")
b = input("Enter another binary")

print(addBinary(a,b))