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
	KENEQ
	EKHI
	AMIDA
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

Difficulties[KENEQ] = New Difficulty
Difficulties[KENEQ]\name = "Keneq"
Difficulties[KENEQ]\localName = I_Loc\Difficulty_Keneq
Difficulties[KENEQ]\description = I_Loc\Difficulty_KeneqDesc
Difficulties[KENEQ]\permaDeath = False
Difficulties[KENEQ]\aggressiveNPCs = False
Difficulties[KENEQ]\saveType = SAVEANYWHERE
Difficulties[KENEQ]\otherFactors = EASY
Difficulties[KENEQ]\r = 255
Difficulties[KENEQ]\g = 211
Difficulties[KENEQ]\b = 0

Difficulties[EKHI] = New Difficulty
Difficulties[EKHI]\name = "Ekhi"
Difficulties[EKHI]\localName = I_Loc\Difficulty_Ekhi
Difficulties[EKHI]\description = I_Loc\Difficulty_EkhiDesc
Difficulties[EKHI]\permaDeath = False
Difficulties[EKHI]\aggressiveNPCs = False
Difficulties[EKHI]\saveType = SAVEONSCREENS
Difficulties[EKHI]\otherFactors = NORMAL
Difficulties[EKHI]\r = 255
Difficulties[EKHI]\g = 109
Difficulties[EKHI]\b = 0

Difficulties[AMIDA] = New Difficulty
Difficulties[AMIDA]\name = "Amida"
Difficulties[AMIDA]\localName = I_Loc\Difficulty_Amida
Difficulties[AMIDA]\description = I_Loc\Difficulty_AmidaDesc
Difficulties[AMIDA]\permaDeath = True
Difficulties[AMIDA]\aggressiveNPCs = True
Difficulties[AMIDA]\saveType = NOSAVES
Difficulties[AMIDA]\otherFactors = HARD
Difficulties[AMIDA]\r = 196
Difficulties[AMIDA]\g = 2
Difficulties[AMIDA]\b = 51

Difficulties[CUSTOM] = New Difficulty
Difficulties[CUSTOM]\name = "Custom"
Difficulties[CUSTOM]\localName = I_Loc\Difficulty_Custom
Difficulties[CUSTOM]\permaDeath = False
Difficulties[CUSTOM]\aggressiveNPCs = True
Difficulties[CUSTOM]\saveType = SAVEANYWHERE
Difficulties[CUSTOM]\customizable = True
Difficulties[CUSTOM]\otherFactors = EASY
Difficulties[CUSTOM]\r = 255
Difficulties[CUSTOM]\g = 255
Difficulties[CUSTOM]\b = 255

SelectedDifficulty = Difficulties[KENEQ]
