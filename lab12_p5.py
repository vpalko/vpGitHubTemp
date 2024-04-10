# Read the contents of a coal data file and return the data in a dictionary format.
def read_data_file(filename):
    data_file = open(filename, "r")
    header_line = (
        data_file.readline()
    )  # Read the header line of the file to extract years

    years = header_line.strip().split(",")[1:]  # Extract the years from the header line

    # Initialize an empty dictionary to store the data
    data_dict = {}

    # Iterate over each line in the data file
    for line in data_file:
        # Remove leading and trailing whitespaces, and split the line into a list using commas
        line = line.strip().split(",")

        # Create a nested dictionary for each country in the data_dict
        data_dict[line[0]] = {}

        # Iterate over the years and assign the corresponding values to the data_dict
        for i in range(0, len(years)):
            data_dict[line[0]][int(years[i])] = line[i + 1]

    # Close the file
    data_file.close()

    # Return the final data dictionary
    return data_dict


def calculate_total_production(dict):
    data_dict = {}
    dict_keys = list(dict.keys())
    i = 0
    while i < len(dict_keys):
        KEY = dict_keys[i]
        dict_county_values = list(dict[KEY].values())
        n = 0
        while n < len(dict_county_values):
            KEY_VALUE = int(dict_county_values[n])
            if KEY in data_dict: 
                data_dict[KEY] = (data_dict[KEY] + KEY_VALUE)
            else:
                data_dict[KEY] = KEY_VALUE
            n = n + 1
        i = i + 1
    return data_dict


fileDict = read_data_file("coal_production.csv")
productionDict = calculate_total_production(fileDict)
print(productionDict)
