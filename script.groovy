def buildApp() {
    echo 'building the application...'
} 

def testApp() {
    echo 'testing the application...'
} 

def deployApp() {
    echo 'deplying the application...'
    echo "deploying version ${params.VERSION}"
   
    def files = findFiles(glob: '**/*.*', excludes: 'b/*.txt,**/aba/*.txt')
    for (file in files) {
      echo """
      ${file.name} ${file.path} ${file.directory} 
      ${file.length} ${file.lastModified}
      """
    }

} 

return this
