properties([
    parameters([
        booleanParam(defaultValue: true, description: 'Outlook', name: 'Outlook'),
        booleanParam(defaultValue: false, description: 'Excel', name: 'Excel'),
        booleanParam(defaultValue: false, description: 'Word', name: 'Word'),
        choice(
            choices: [
                'WinSrv2022Std',
                'WinSrv2019Std'
            ],
            description: 'OS version to use',
            name: 'VM_TEMPLATE'
        ),
        choice(
            choices: [
                'Outlook, Excel, Word',
                'Outlook, Excel',
                'Outlook, Word',
                'Excel, Word',
                'Outlook',
                'Excel',
                'Word'
            ],
            description: 'Application, which will be tested',
            name: 'APPTOBETESTED'
        )
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
