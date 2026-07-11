data_log = [
    [10.5, "A1", 100],
    [11.0, "B2"],
    "Corrupted Row",
    [12.5, 'C5', "95"],
    [13.0, 'D4', 0]
]

total_valid_entries = []
for i, row in enumerate(data_log):
    try:
        reading = row[2]
        try:
            temp = reading/10
        except TypeError:
            reading = float(reading)
    except IndexError:
        print(f'Index {i}: IndexError: Reading column is missing!!!')
    except ValueError:
        print(f'Index {i}: ValueError: Is not a valid entry!!!')
    else:
        print(f'Index {i}: is valid, Continuing...')
        total_valid_entries.append(reading/10)

print(f'Valid Entries: {total_valid_entries}')