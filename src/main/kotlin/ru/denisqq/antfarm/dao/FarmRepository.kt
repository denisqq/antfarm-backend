package ru.denisqq.antfarm.dao

import ru.denisqq.antfarm.model.Farm
import ru.denisqq.antfarm.model.QFarm

interface FarmRepository : AntfarmRepository<Farm, QFarm>