import os
import unittest
import traceback
import sys
import re

def runTests():
    lsPaths = []
    cwd = os.getcwd()        

    #Find all relevant subdirectories that contain unit tests
    root_dir = "src"
    for root, dirs, files in os.walk(root_dir):
        dirs.sort()
        for file in files:
            if "pycache" not in root and file.startswith("test_"):
                test_folder = os.path.join(cwd, root)
                lsPaths.append(test_folder)    

    #loop through subdirectories and run individually
    for path in lsPaths:
        sys.path.append(path)
        loader = unittest.TestLoader()
        suite = unittest.TestSuite()
        suite = loader.discover(path)
        testresult = unittest.TextTestRunner().run(suite)
        sys.path.remove(path)
        solution_test_keys = []
        solution_keys = []
        for key in sys.modules:
            if re.match(r'(test_solution)', key):
                solution_test_keys.append(key)
            if re.match(r'(solution)', key):
                solution_keys.append(key)
        for solution_test_key in solution_test_keys:
            sys.modules.pop(solution_test_key)
        for solution_key in solution_keys:
            sys.modules.pop(solution_key)
        if len(testresult.failures) > 0 or len(testresult.errors) > 0:
            raise Exception()

def main():
    """main method."""
    try:              
        print("Running unit tests...")
        runTests()
        print("Finished running unit tests.")
    except Exception as e:
        sys.exit(f"Failure in unit test run. Exception: {e}.")

if __name__ == '__main__':
    main()