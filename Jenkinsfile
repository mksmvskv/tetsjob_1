properties([
    parameters([
        booleanParam(defaultValue: true, description: 'Outlook', name: 'Outlook'),
        booleanParam(defaultValue: false, description: 'Excel', name: 'Excel'),
        booleanParam(defaultValue: false, description: 'Word', name: 'Word'),
        [$class: 'ChoiceParameter',
            choiceType: 'PT_CHECKBOX', 
            description: 'Select Options', 
            filterLength: 1, 
            filterable: false, 
            name: 'Options', 
            randomName: 'choice-parameter-5631311594605653', 
            script: [
                $class: 'GroovyScript', 
                fallbackScript: [
                    classpath: [], 
                    sandbox: false, 
                    script: 
                    'return["error"]'
                ], 
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
    def options = []
    if (params.Outlook) {
        options.add('Outlook')
    }
    if (params.Excel) {
        options.add('Excel')
    }
    if (params.Word) {
        options.add('Word')
    }

    println("Selected options: ${options}")
}
