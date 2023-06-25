properties([
    parameters([
        booleanParam(defaultValue: true, description: 'Outlook', name: 'Outlook'),
        booleanParam(defaultValue: false, description: 'Excel', name: 'Excel'),
        booleanParam(defaultValue: false, description: 'Word', name: 'Word'),
        [$class: 'ActiveChoicesParameterDefinition',
            name: 'Choices',
            description: 'Select your choices',
            script: [
                $class: 'GroovyScript',
                script: 'return["Option1", "Option2", "Option3"]',
                fallbackScript: 'return["Error"]'
            ],
            choiceType: 'CHECKBOX',
            filterable: false
        ]
    ])
])

node {
    stage('Processing Options') {
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
}
