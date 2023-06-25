properties([
    parameters([
        booleanParam(defaultValue: true, description: 'Outlool', name: 'Outlool'),
        booleanParam(defaultValue: false, description: 'Excel', name: 'Excel'),
        booleanParam(defaultValue: false, description: 'Word', name: 'Word')
    ])
])

node {
    def options = []
    if (params.option1) {
        options.add('Option1')
    }
    if (params.option2) {
        options.add('Option2')
    }
    if (params.option3) {
        options.add('Option3')
    }

    println("Selected options: ${options}")
}
