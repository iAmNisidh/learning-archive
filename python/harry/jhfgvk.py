def format_name(full_name: str) -> str:
    name_parts = [part.strip() for part in full_name.split()]
    
    if not name_parts:
        return ""
    
    name_parts = [part.capitalize() for part in name_parts]
    
    if len(name_parts) == 1:
        return f"{name_parts[0][0]}."
    elif len(name_parts) == 2:
        return f"{name_parts[0][0]}. {name_parts[1]}"
    else:
        abbreviated = [f"{name[0]}." for name in name_parts[:-1]]
        return f"{' '.join(abbreviated)} {name_parts[-1]}"

def test_name_formatter():
    test_cases = [
        "john",
        "john doe",
        "john michael doe",
        "john michael james doe",
        "mary jane ann smith",
        "JAMES DOE",
        "james michael SMITH",
    ]
    
    for name in test_cases:
        print(f"Input: {name}")
        print(f"Output: {format_name(name)}")
        print("-" * 30)

if _name_ == "_main_":
    test_name_formatter()