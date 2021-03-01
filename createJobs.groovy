pipelineJob('myspringapp') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/AdnanZiSAP/myspringapp.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}
