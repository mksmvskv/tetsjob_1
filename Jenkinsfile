properties([
    parameters([
        booleanParam(defaultValue: true, description: 'Outlool', name: 'Outlool'),
        booleanParam(defaultValue: false, description: 'Excel', name: 'Excel'),
        booleanParam(defaultValue: false, description: 'Word', name: 'Word')
    ])
])

node {
    def options = []
    if (params.Outlool) {
        options.add('Outlool')
    }
    if (params.Excel) {
        options.add('Excel')
    }
    if (params.Word) {
        options.add('Word')
    }

    println("Selected options: ${options}")
}
