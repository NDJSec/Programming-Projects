import Caesar_cipher as cc

def main():
    
    user_input = input('Please enter something you like to be encrypted: ')
    shift = input('Please enter the shift for the cipher: ')

    user_input.lower()
    shift = int(shift)

    message = cc.cipherClass(user_input, shift)
    message.cipher()

if __name__ == "__main__":
    main()