def call(String gitUrl) {
    // Git URL 형식에 따라 분리 방법 조정
    def repoName = gitUrl.split('/')[-1].replace('.git', '')
    return repoName
}