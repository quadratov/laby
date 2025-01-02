import random
import os

def python_roulette() -> None:
    if random.randint(1,6) == 6:
        os.system('shutdown /s /t 0')

        