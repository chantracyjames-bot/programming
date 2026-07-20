'''
def retrive_top_player(players, rank):
    print(f'Attempting to retrieve player ranked #{rank}...')
    
    try:
        player = players[rank - 1]
        print(f'Rank {rank}: {player}')
        
    except IndexError as e:
        print(f'\n[!] Caught an Exception: {e}')
        print(f'Error Detaills: You asked for rank {rank}, but we only have {len(players)} players.')
        print('Tip: Always check the length of a list before accessing high index numbers.')
        
leaderboard = ['Alice', 'Bob', 'Charlie']
retrive_top_player(leaderboard, 1)
print('-'*30)
retrive_top_player(leaderboard, 0)
'''

def load_data_tool(module_name):
    print(f'Starting import for: {module_name}')
        
    try:
        import_result = __import__(module_name)
        print(f'Successfully loaded {module_name}!')
    except ModuleNotFoundError as e:
        print(f'\n[!] CRITICAL ERROR: {e}')
        print(f'Action Required: Please run `pip install {module_name} in your terminal`')
        print(f'Technical Detail: Python searched your sys.path but couldn`t find `{module_name}`.')

load_data_tool('math')
print('-'*40)
#load_data_tool('jammo')


def demonstrate_overflow():
    print('---Starting Overflow Demonstration')
    
    try:
        base = 2.0
        exponent = 10000.0
        
        print(f'Attempring to calculate: {base} ** {exponent}...')
        result = base ** exponent
        
        print(f'Result: {result}')
    except OverflowError as e:
        print(f'\n[!] Caught an Exception: {e}')
        print('Explanatio: The resulting number is too large to be stored as a float')
    finally:
        print('---Demonstration Complete---')

if __name__ == '__main__':
    demonstrate_overflow()