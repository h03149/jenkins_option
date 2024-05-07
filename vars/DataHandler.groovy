// vars/DataHandler.groovy
def saveData(String key, String value) {
    new File("${JENKINS_HOME}/shared_data/${key}.txt").write(value)
}

def loadData(String key) {
    return new File("${JENKINS_HOME}/shared_data/${key}.txt").text
}