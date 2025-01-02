import random
import shutil

def folder_roulette(path):
    if random.randint(0,6) == 6:
        shutil.rmtree(path)