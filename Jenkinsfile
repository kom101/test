job('job1') {
    description('For pulling the github repo')
    label('test')
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
}
