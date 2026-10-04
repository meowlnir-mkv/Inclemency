Function LoadAllSounds()
;Dim OpenDoorSFX%(3,3), CloseDoorSFX%(3,3)
For i = 0 To 2
	OpenDoorSFX(0,i) = LoadSound_Strict("SFX\Door\Normal\DoorOpen" + (i + 1) + ".ogg")
	CloseDoorSFX(0,i) = LoadSound_Strict("SFX\Door\Normal\DoorClose" + (i + 1) + ".ogg")
	OpenDoorSFX(2,i) = LoadSound_Strict("SFX\Door\Heavy\Door2Open" + (i + 1) + ".ogg")
	CloseDoorSFX(2,i) = LoadSound_Strict("SFX\Door\Heavy\Door2Close" + (i + 1) + ".ogg")
	OpenDoorSFX(3,i) = LoadSound_Strict("SFX\General\Elevator\ElevatorOpen" + (i + 1) + ".ogg")
	CloseDoorSFX(3,i) = LoadSound_Strict("SFX\General\Elevator\ElevatorClose" + (i + 1) + ".ogg")
Next
For i = 0 To 1
	OpenDoorSFX(1,i) = LoadSound_Strict("SFX\Door\Blast\BigDoorOpen" + (i + 1) + ".ogg")
	CloseDoorSFX(1,i) = LoadSound_Strict("SFX\Door\Blast\BigDoorClose" + (i + 1) + ".ogg")
Next

KeyCardSFX1 = LoadSound_Strict("SFX\Player\Interact\KeyCardUse1.ogg")
KeyCardSFX2 = LoadSound_Strict("SFX\Player\Interact\KeyCardUse2.ogg")
ButtonSFX2 = LoadSound_Strict("SFX\Player\Interact\Button2.ogg")
ScannerSFX1 = LoadSound_Strict("SFX\Player\Interact\ScannerUse1.ogg")
ScannerSFX2 = LoadSound_Strict("SFX\Player\Interact\ScannerUse2.ogg")

OpenDoorFastSFX=LoadSound_Strict("SFX\Door\DoorOpenFast.ogg")
CautionSFX% = LoadSound_Strict("SFX\General\Event\LockroomSiren.ogg")

 ;NuclearSirenSFX%

CameraSFX = LoadSound_Strict("SFX\General\Environment\Camera.ogg") 

StoneDragSFX% = LoadSound_Strict("SFX\SCP\173\StoneDrag.ogg")

For i = 0 To 3
	GunshotSFX(i) = LoadSound_Strict("SFX\General\Firearms\Gunshot" + (i + 1) + ".ogg")
Next

Gunshot2SFX% = LoadSound_Strict("SFX\General\Firearms\ApacheGunshot.ogg")
Gunshot3SFX% = LoadSound_Strict("SFX\General\Firearms\BulletMiss.ogg")
BullethitSFX% = LoadSound_Strict("SFX\General\Firearms\BulletHit.ogg")

TeslaIdleSFX = LoadSound_Strict("SFX\General\Event\room2tesla\Idle.ogg")
TeslaActivateSFX = LoadSound_Strict("SFX\General\Event\room2tesla\WindUp.ogg")
TeslaPowerUpSFX = LoadSound_Strict("SFX\General\Event\room2tesla\PowerUp.ogg")

MagnetUpSFX% = LoadSound_Strict("SFX\General\Event\room106\MagnetUp.ogg") 
MagnetDownSFX = LoadSound_Strict("SFX\General\Event\room106\MagnetDown.ogg")
 ;FemurBreakerSFX%
 ;EndBreathCHN%
 ;EndBreathSFX%

;Dim DecaySFX%(5)
For i = 0 To 3
	DecaySFX(i) = LoadSound_Strict("SFX\SCP\106\Decay" + i + ".ogg")
Next

BurstSFX = LoadSound_Strict("SFX\General\Event\TunnelBurst.ogg")

;DrawLoading(20, True)

;Dim RustleSFX%(3)
For i = 0 To 2
	RustleSFX(i) = LoadSound_Strict("SFX\SCP\372\Rustle" + i + ".ogg")
Next

Death914SFX% = LoadSound_Strict("SFX\SCP\914\PlayerDeath.ogg") 
Use914SFX% = LoadSound_Strict("SFX\SCP\914\PlayerUse.ogg")

;Dim DripSFX%(4)
For i = 0 To 3
	DripSFX(i) = LoadSound_Strict("SFX\Player\BloodDrip" + i + ".ogg")
Next

LeverSFX% = LoadSound_Strict("SFX\Player\Interact\LeverFlip.ogg") 
LightSFX% = LoadSound_Strict("SFX\General\Event\LightSwitch.ogg")

ButtGhostSFX% = LoadSound_Strict("SFX\SCP\Joke\789J.ogg")

;Dim RadioSFX(5,10)
RadioSFX(1,0) = LoadSound_Strict("SFX\Radio\RadioAlarm.ogg")
RadioSFX(1,1) = LoadSound_Strict("SFX\Radio\RadioAlarm2.ogg")
For i = 0 To 8
	RadioSFX(2,i) = LoadSound_Strict("SFX\Radio\scpradio"+i+".ogg")
Next
RadioSquelch = LoadSound_Strict("SFX\Radio\squelch.ogg")
RadioStatic = LoadSound_Strict("SFX\Radio\static.ogg")
RadioBuzz = LoadSound_Strict("SFX\Radio\buzz.ogg")

ElevatorBeepSFX = LoadSound_Strict("SFX\General\Elevator\Beep.ogg") 
ElevatorMoveSFX = LoadSound_Strict("SFX\General\Elevator\Moving.ogg") 

;Dim PickSFX%(10)
For i = 0 To 4
	PickSFX(i) = LoadSound_Strict("SFX\Player\Interact\PickItem" + i + ".ogg")
Next

For i = 0 To 4
	InvMoveWalSFX(i) = LoadSound_Strict("SFX\Player\Interact\Inventory\InvMoveClip" + i + ".ogg")
Next

For i = 0 To 4
	InvMoveClipSFX(i) = LoadSound_Strict("SFX\Player\Interact\Inventory\InvMoveWal" + i + ".ogg")
Next

For i = 0 To 4
	InvUseSFX(i) = LoadSound_Strict("SFX\Player\Interact\Inventory\InvUse" + i + ".ogg")
Next

 ;AmbientSFXCHN% 
;CurrAmbientSFX%
;Dim AmbientSFXAmount(6)
;0 = light containment, 1 = heavy containment, 2 = entrance
AmbientSFXAmount(0)=11 : AmbientSFXAmount(1)=11 : AmbientSFXAmount(2)=12
;3 = general, 4 = pre-breach
AmbientSFXAmount(3)=15 : AmbientSFXAmount(4)=5
;5 = forest
AmbientSFXAmount(5)=10

;Dim AmbientSFX%(6, 15)

;Dim OldManSFX%(6)
For i = 0 To 2
	OldManSFX(i) = LoadSound_Strict("SFX\SCP\106\Corrosion" + (i + 1) + ".ogg")
Next
OldManSFX(3) = LoadSound_Strict("SFX\SCP\106\Laugh.ogg")
OldManSFX(4) = LoadSound_Strict("SFX\SCP\106\Breathing.ogg")
OldManSFX(5) = LoadSound_Strict("SFX\SCP\106\PocketDimension\Enter.ogg")
For i = 0 To 2
	OldManSFX(6+i) = LoadSound_Strict("SFX\SCP\106\WallDecay"+(i+1)+".ogg")
Next

;Dim Scp173SFX%(3)
For i = 0 To 2
	Scp173SFX(i) = LoadSound_Strict("SFX\SCP\173\Rattle" + (i + 1) + ".ogg")
Next

;Dim HorrorSFX%(20)

;---------------------------- HORROR SFX ----------------------------

;Jumpscare sound effects
HorrorSFX(1) = LoadSound_Strict("SFX\Horror\Jumpscare\Jumpscare1.ogg")
HorrorSFX(2) = LoadSound_Strict("SFX\Horror\Jumpscare\Jumpscare2.ogg")
HorrorSFX(9) = LoadSound_Strict("SFX\Horror\Jumpscare\Jumpscare3.ogg")
HorrorSFX(14) = LoadSound_Strict("SFX\Horror\Jumpscare\Jumpscare4.ogg")

;Sight sound effects
HorrorSFX(0) = LoadSound_Strict("SFX\Horror\Sight\Sight1.ogg")
HorrorSFX(3) = LoadSound_Strict("SFX\Horror\Sight\Sight2.ogg")
HorrorSFX(4) = LoadSound_Strict("SFX\Horror\Sight\Sight3.ogg")
HorrorSFX(5) = LoadSound_Strict("SFX\Horror\Sight\Sight4.ogg")
HorrorSFX(6) = LoadSound_Strict("SFX\Horror\Sight\Sight5.ogg")
HorrorSFX(8) = LoadSound_Strict("SFX\Horror\Sight\Sight6.ogg")
HorrorSFX(10) = LoadSound_Strict("SFX\Horror\Sight\Sight7.ogg")
HorrorSFX(16) = LoadSound_Strict("SFX\Horror\Sight\Sight8.ogg")
HorrorSFX(17) = LoadSound_Strict("SFX\Horror\Sight\Sight9.ogg")
HorrorSFX(18) = LoadSound_Strict("SFX\Horror\Sight\Sight10.ogg")
HorrorSFX(19) = LoadSound_Strict("SFX\Horror\Sight\Sight11.ogg")
HorrorSFX(20) = LoadSound_Strict("SFX\Horror\Sight\Sight12.ogg")

;Other
HorrorSFX(7) = LoadSound_Strict("SFX\SCP\079\Horror.ogg")
HorrorSFX(11) = LoadSound_Strict("SFX\Horror\Spiral.ogg")
HorrorSFX(12) = LoadSound_Strict("SFX\SCP\049\Idle.ogg")
HorrorSFX(13) = LoadSound_Strict("SFX\SCP\049\Kill.ogg")
HorrorSFX(15) = LoadSound_Strict("SFX\Horror\StopHiding.ogg")

;Template
;HorrorSFX(i) = LoadSound_Strict("SFX\Horror\X\Y.ogg")

;--------------------------------------------------------------------
;For i = 0 To 11
;	HorrorSFX(i) = LoadSound_Strict("SFX\Horror\Horror" + i + ".ogg")
;Next
;For i = 14 To 15
;	HorrorSFX(i) = LoadSound_Strict("SFX\Horror\Horror" + i + ".ogg")
;Next

For i = 0 to 17
	ScreamSFX(i) = LoadSound_Strict("SFX\Player\Damage\Scream" + (i + 1) + ".ogg")
Next

For i = 0 to 17
	DamagedSFX(i) = LoadSound_Strict("SFX\Player\Damage\Damaged" + (i + 1) + ".ogg")
Next

For i = 0 to 17
	ScreamGasSFX(i) = LoadSound_Strict("SFX\Player\Damage\GasMask\ScreamGas" + (i + 1) + ".ogg")
Next

For i = 0 to 17
	DamagedGasSFX(i) = LoadSound_Strict("SFX\Player\Damage\GasMask\DamagedGas" + (i + 1) + ".ogg")
Next

;DrawLoading(25, True)

;Dim IntroSFX%(20)

For i = 7 To 9
	IntroSFX(i) = LoadSound_Strict("SFX\Intro\Bang" + (i - 6) + ".ogg")
Next
For i = 10 To 12
	IntroSFX(i) = LoadSound_Strict("SFX\General\Environment\Light" + (i - 9) + ".ogg")
Next
;IntroSFX(13) = LoadSound_Strict("SFX\intro\shoot1.ogg")
;IntroSFX(14) = LoadSound_Strict("SFX\intro\shoot2.ogg")
IntroSFX(15) = LoadSound_Strict("SFX\SCP\173\173Vent.ogg")

;Dim AlarmSFX%(5)
AlarmSFX(0) = LoadSound_Strict("SFX\General\Environment\Alarm\Alarm.ogg")
;AlarmSFX(1) = LoadSound_Strict("SFX\Alarm\Alarm2.ogg")
AlarmSFX(2) = LoadSound_Strict("SFX\General\Environment\Alarm\Alarm3.ogg")

;room_gw alarms
AlarmSFX(3) = LoadSound_Strict("SFX\General\Environment\Alarm\Alarm4.ogg")
AlarmSFX(4) = LoadSound_Strict("SFX\General\Environment\Alarm\Alarm5.ogg")

;Dim CommotionState%(23)

 HeartBeatSFX = LoadSound_Strict("SFX\Player\Heartbeat.ogg")

 ;VomitSFX%

;Dim BreathSFX(2,5)
 ;BreathCHN%
For i = 0 To 14
	BreathSFX(0,i)=LoadSound_Strict("SFX\Player\Breathing\breath"+i+".ogg")
	BreathSFX(1,i)=LoadSound_Strict("SFX\Player\Breathing\GasMask\breath"+i+"gas.ogg")
Next


;Dim NeckSnapSFX(3)
For i = 0 To 2
	NeckSnapSFX(i) =  LoadSound_Strict("SFX\SCP\173\NeckSnap"+(i+1)+".ogg")
Next

;Dim DamageSFX%(9)
For i = 0 To 8
	DamageSFX(i) = LoadSound_Strict("SFX\General\Damage\Damage"+(i+1)+".ogg")
Next

;Dim MTFSFX%(8)

;Dim CoughSFX%(3)
	;CoughCHN% 
	;VomitCHN%
For i = 0 To 2
	CoughSFX(i) = LoadSound_Strict("SFX\Player\Cough" + (i + 1) + ".ogg")
Next

 MachineSFX% = LoadSound_Strict("SFX\SCP\914\Refining.ogg")

 ApacheSFX = LoadSound_Strict("SFX\Ending\Apache\Propeller.ogg")

 ;CurrStepSFX
;Dim StepSFX%(4, 2, 8) ;(normal/metal, walk/run, id)
For i = 0 To 11
	StepSFX(0, 0, i) = LoadSound_Strict("SFX\Player\Footsteps\Concrete\Step" + (i + 1) + ".ogg")
	StepSFX(1, 0, i) = LoadSound_Strict("SFX\Player\Footsteps\Metal\Step" + (i + 1) + ".ogg")
	StepSFX(5, 0, i) = LoadSound_Strict("SFX\Player\Footsteps\Tile\Step" + (i + 1) + ".ogg")
	StepSFX(6, 0, i) = LoadSound_Strict("SFX\Player\Footsteps\Metal\Thin\Step" + (i + 1) + ".ogg")
	StepSFX(7, 0, i) = LoadSound_Strict("SFX\Player\Footsteps\Metal\Thick\Step" + (i + 1) + ".ogg")
	StepSFX(8, 0, i) = LoadSound_Strict("SFX\Player\Footsteps\Carpet\Step" + (i + 1) + ".ogg")
	StepSFX(0, 1, i) = LoadSound_Strict("SFX\Player\Footsteps\Concrete\Run" + (i + 1) + ".ogg")
	StepSFX(1, 1, i) = LoadSound_Strict("SFX\Player\Footsteps\Metal\Run" + (i + 1) + ".ogg")
	StepSFX(5, 1, i) = LoadSound_Strict("SFX\Player\Footsteps\Tile\Run" + (i + 1) + ".ogg")
	StepSFX(6, 1, i) = LoadSound_Strict("SFX\Player\Footsteps\Metal\Thin\Run" + (i + 1) + ".ogg")
	StepSFX(7, 1, i) = LoadSound_Strict("SFX\Player\Footsteps\Metal\Thick\Run" + (i + 1) + ".ogg")
	StepSFX(8, 1, i) = LoadSound_Strict("SFX\Player\Footsteps\Carpet\Run" + (i + 1) + ".ogg")
	If i < 3
		StepSFX(2, 0, i) = LoadSound_Strict("SFX\MTF\Step" + (i + 1) + ".ogg")
		StepSFX(3, 0, i) = LoadSound_Strict("SFX\SCP\049\Step"+ (i + 1) + ".ogg")
	EndIf
	If i < 4
        StepSFX(4, 0, i) = LoadSound_Strict("SFX\SCP\Footsteps\StepSCP" + (i + 1) + ".ogg") ;new one 1.3.9
    EndIf
Next

;Dim Step2SFX(6)
For i = 0 To 2
	Step2SFX(i) = LoadSound_Strict("SFX\Player\Footsteps\StepPD" + (i + 1) + ".ogg")
	Step2SFX(i+3) = LoadSound_Strict("SFX\Player\Footsteps\StepForest" + (i + 1) + ".ogg")
Next 

For i = 0 To 2
	CrouchSFX(i) = LoadSound_Strict("SFX\Player\Foley\Crouch\Foley" + (i + 1) + ".ogg")
Next

For i = 0 To 8
	FoleySFX(0, i) = LoadSound_Strict("SFX\Player\Foley\Footstep\Foley" + (i + 1) + ".ogg")
	FoleySFX(1, i) = LoadSound_Strict("SFX\Player\Foley\Footstep\RunFoley" + (i + 1) + ".ogg")
Next

For i = 0 To 19
	GearSFX(i) = LoadSound_Strict("SFX\Player\Foley\Footstep\Vest\Foley" + (i + 1) + ".ogg")
Next

For i = 0 To 4
	ScrapeSFX(0, i) = LoadSound_Strict("SFX\Player\Footsteps\Concrete\Scrape" + (i + 1) + ".ogg")
	ScrapeSFX(1, i) = LoadSound_Strict("SFX\Player\Footsteps\Metal\Scrape" + (i + 1) + ".ogg")
	ScrapeSFX(5, i) = LoadSound_Strict("SFX\Player\Footsteps\Tile\Scrape" + (i + 1) + ".ogg")
	ScrapeSFX(6, i) = LoadSound_Strict("SFX\Player\Footsteps\Metal\Thin\Scrape" + (i + 1) + ".ogg")
	ScrapeSFX(7, i) = LoadSound_Strict("SFX\Player\Footsteps\Metal\Thick\Scrape" + (i + 1) + ".ogg")
Next

End Function










;~IDEal Editor Parameters:
;~F#0
;~C#Blitz3D