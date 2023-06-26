properties([
parameters([
    [$class: 'CascadeChoiceParameter', 
        choiceType: 'PT_CHECKBOX', 
        description: 'Select Servers',  
        script: [
            $class: 'GroovyScript', 
            fallbackScript: [
                classpath: [], 
                sandbox: false, 
                script: 
                    return['server1', 'server2', 'server3']
            ], 
        ]
     ]
])])

