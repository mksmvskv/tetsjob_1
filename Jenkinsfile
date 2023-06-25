properties([
    parameters([
        booleanParam(defaultValue: true, description: 'Outlook', name: 'Outlook'),
        booleanParam(defaultValue: false, description: 'Excel', name: 'Excel'),
        booleanParam(defaultValue: false, description: 'Word', name: 'Word'),
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
