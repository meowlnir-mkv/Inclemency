Type Difficulty
	Field name$, localName$
	Field description$
	Field permaDeath%
	Field aggressiveNPCs
	Field saveType%
	Field otherFactors%
	
	Field r%
	Field g%
	Field b%
	
	Field customizable%
End Type

Global Difficulties.Difficulty[4]

Global SelectedDifficulty.Difficulty

Enum DifficultyID
	SAFE
	EUCLID
	KETER
	CUSTOM
End Enum

Enum DifficultySaveTypeID
	SAVEANYWHERE
	SAVEONQUIT
	SAVEONSCREENS
	NOSAVES
End Enum

Enum DifficultyFactorID
	EASY
	NORMAL
	HARD
End Enum

Difficulties[SAFE] = New Difficulty
Difficulties[SAFE]\name = "Safe"
Difficulties[SAFE]\localName = I_Loc\Difficulty_Safe
Difficulties[SAFE]\description = I_Loc\Difficulty_SafeDesc
Difficulties[SAFE]\permaDeath = False
Difficulties[SAFE]\aggressiveNPCs = False
Difficulties[SAFE]\saveType = SAVEANYWHERE
Difficulties[SAFE]\otherFactors = EASY
Difficulties[SAFE]\r = 120
Difficulties[SAFE]\g = 150
Difficulties[SAFE]\b = 50

Difficulties[EUCLID] = New Difficulty
Difficulties[EUCLID]\name = "Euclid"
Difficulties[EUCLID]\localName = I_Loc\Difficulty_Euclid
Difficulties[EUCLID]\description = I_Loc\Difficulty_EuclidDesc
Difficulties[EUCLID]\permaDeath = False
Difficulties[EUCLID]\aggressiveNPCs = False
Difficulties[EUCLID]\saveType = SAVEONSCREENS
Difficulties[EUCLID]\otherFactors = NORMAL
Difficulties[EUCLID]\r = 200
Difficulties[EUCLID]\g = 200
Difficulties[EUCLID]\b = 0

Difficulties[KETER] = New Difficulty
Difficulties[KETER]\name = "Keter"
Difficulties[KETER]\localName = I_Loc\Difficulty_Keter
Difficulties[KETER]\description = I_Loc\Difficulty_KeterDesc
Difficulties[KETER]\permaDeath = True
Difficulties[KETER]\aggressiveNPCs = True
Difficulties[KETER]\saveType = NOSAVES
Difficulties[KETER]\otherFactors = HARD
Difficulties[KETER]\r = 200
Difficulties[KETER]\g = 0
Difficulties[KETER]\b = 0

Difficulties[CUSTOM] = New Difficulty
Difficulties[CUSTOM]\name = "Esoteric"
Difficulties[CUSTOM]\localName = I_Loc\Difficulty_Esoteric
Difficulties[CUSTOM]\permaDeath = False
Difficulties[CUSTOM]\aggressiveNPCs = True
Difficulties[CUSTOM]\saveType = SAVEANYWHERE
Difficulties[CUSTOM]\customizable = True
Difficulties[CUSTOM]\otherFactors = EASY
Difficulties[CUSTOM]\r = 255
Difficulties[CUSTOM]\g = 255
Difficulties[CUSTOM]\b = 255

SelectedDifficulty = Difficulties[SAFE]
