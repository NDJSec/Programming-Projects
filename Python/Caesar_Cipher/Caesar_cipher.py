class cipherClass():
    
    def __init__(self, user_input, shift):
        self.user_input = user_input
        self.shift = shift
    
    def cipher(self):
        msg = list(self.user_input)
        emsg = []

        for c in msg:
            if c == 'z':
                c = chr(((ord(c)+self.shift)%26+78))
                emsg.append(c)
            else:
                c = chr(ord(c) + self.shift)
                emsg.append(c)

        message = ''.join(emsg)

        print(message)

        
