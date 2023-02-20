configuration testdsc {
    
    Import-DSCResource -ModuleName PSDesiredStateConfiguration
    
    node win1 {
        File createfolder {
            Ensure = "Present"
            Type = "Directory"
            DestinationPath = "C:\test_jenkins"
        
        }
    }
}
