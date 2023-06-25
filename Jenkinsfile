properties([
    parameters([
        [$class: 'ChoiceParameter', 
            choiceType: 'PT_CHECKBOX', 
            description: 'Select Options', 
            filterable: false, 
            name: 'Options', 
            script: [
                $class: 'GroovyScript', 
                script: [
                    classpath: [], 
                    sandbox: false, 
                    script: 
                    'return["Option1", "Option2", "Option3"]'
                ]
            ]
        ]
    ])
])

node {
    stage('Processing Options') {
        def options = params.Options.tokenize(',')

        println("Selected options: ${options}")
    }
}
