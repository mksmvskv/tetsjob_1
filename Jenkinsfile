properties([
parameters([
    [$class: 'CascadeChoiceParameter', 
        choiceType: 'PT_CHECKBOX', 
        description: 'Select Servers', 
        filterLength: 1, 
        filterable: true, 
        name: 'Server', 
        randomName: 'choice-parameter-5631314456178619', 
        referencedParameters: 'Env', 
        script: [
            $class: 'GroovyScript', 
            fallbackScript: [
                classpath: [], 
                sandbox: false, 
                script: 
                    'return['server1', 'server2', 'server3']'
            ], 
            script: [
                classpath: [], 
                sandbox: false, 
                script: 
                    ''' return['server1', 'server2', 'server3']
                    '''
            ]
        ]
     ]
])])

