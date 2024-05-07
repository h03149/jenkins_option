// vars/DataHandler.groovy
def saveData(String key, String value) {
    // 파일을 저장할 경로 직접 지정
    def directory = new File("/var/jenkins_home/shared_data")
    if (!directory.exists()) {
        directory.mkdirs()
    }
    new File(directory, "${key}.txt").write(value)
}

def loadData(String key) {
    return new File("/var/jenkins_home/shared_data/${key}.txt").text
}
