properties([
    parameters([
        booleanParam(defaultValue: true, description: 'Outlool', name: 'option1'),
        booleanParam(defaultValue: false, description: 'Excel', name: 'option2'),
        booleanParam(defaultValue: false, description: 'Word', name: 'option3')
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
