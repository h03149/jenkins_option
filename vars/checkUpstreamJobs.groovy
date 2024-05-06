def call(stageName) {
  def currentBuild = currentBuild()
  def stageResult = currentBuild.rawBuild.getStage(stageName).result
  return stageResult == 'SUCCESS'
}
