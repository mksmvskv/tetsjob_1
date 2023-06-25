properties([
    parameters([
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

String testsTargets = "${params.APPTOBETESTED}"

String vmTemplate = "${params.VM_TEMPLATE}"


node{
    stage ("Tets stage") {
        sh """
            echo $testTargets
        """
    }
}
