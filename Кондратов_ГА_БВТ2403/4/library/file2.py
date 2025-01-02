import random
import os

def file_roulette(path):
    if random.randint(0,6) == 6:
        os.remove(path)