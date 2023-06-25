properties([
    parameters([
        booleanParam(defaultValue: true, description: 'Outlook', name: 'Outlook'),
        booleanParam(defaultValue: false, description: 'Excel', name: 'Excel'),
        booleanParam(defaultValue: false, description: 'Word', name: 'Word'),
        choice(name: 'Choices', choices: ['None', 'Option1', 'Option2', 'Option3'], description: 'Select your choice')
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

        if (params.Choices != 'None') {
            options.add(params.Choices)
        }

        println("Selected options: ${options}")
    }
}
