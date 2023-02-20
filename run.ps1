. C:\Jenkins\test_output.ps1
testdsc -OutputPath "c:\Jenkins"
Start-DscConfiguration -Wait -Force -Verbose -Path C:\Jenkins -ComputerName win1