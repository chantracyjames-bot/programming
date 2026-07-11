def authorize_transaction(balance, amount):
    if amount <= 0:
        output = 'Error: Invalid Transaction Amount'
        result = False
    elif amount > balance or balance < 100:
        output = 'Transaction Declined: Insufficient Funds or Low Balance Fee'
        result = False
    else:
        output = 'Transaction Approved'
        result = True
    print(output)
    return result

bal = float(input('Enter Balance: '))
amo = float(input('Enter Amount: '))
dec = authorize_transaction(bal, amo)
print(f'{dec}')