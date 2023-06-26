properties([
    parameters([
        [$class: 'ChoiceParameter', 
            choiceType: 'PT_CHECKBOX', 
            description: 'Select the options you want to install', 
            filterLength: 1, 
            filterable: false, 
            name: 'Software', 
            randomName: 'choice-parameter-5631316734540', 
            script: [
                $class: 'GroovyScript', 
                fallbackScript: [
                    classpath: [], 
                    sandbox: false, 
                    script: 
                        'return[\'Error\']'
                ], 
                script: [
                    classpath: [], 
                    sandbox: false, 
                    script: 
                        'return[\'Outlook\', \'Excel\', \'Word\']'
                ]
            ]
        ]
    ])
])

pipeline {
    agent any

    stages {
        stage('Install Software') {
            steps {
                echo "Installing the following software: ${params.Software}"
                // Тут должен быть ваш код для установки выбранного программного обеспечения
            }
        }
    }
}
