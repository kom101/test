job('job1') {
    description('For pulling the github repo')
    label('docker')
    scm {
        git {
            remote {
                url('https://github.com/kom101/test.git')
            }
            branch('*/' + 'master')
        }
    }
    steps{
        echo 'Hello world!'
        }    
    }



buildPipelineView('Task6_view') {
    filterBuildQueue(false)
    filterExecutors(false)
    displayedBuilds(1)
    selectedJob('job1')
    alwaysAllowManualTrigger(true)
    showPipelineParameters()
    refreshFrequency(3)
}

    queue('job1')
