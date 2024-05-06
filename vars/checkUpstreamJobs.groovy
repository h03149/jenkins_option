def call(upstreamJobs) {
    def allUpstreamSuccess = upstreamJobs.every { jobName ->
        def job = Jenkins.instance.getItemByFullName(jobName)
        if (job) {
            def lastBuild = job.getLastBuild()
            return lastBuild && lastBuild.result == 'SUCCESS'
        } else {
            echo "Job '$jobName'을(를) 찾을 수 없습니다."
            return false
        }
    }
    return allUpstreamSuccess
}