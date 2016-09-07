#!groovy

node {

  this.buildVersion = "1.22"

  return this
}

def getBuildVersion () {
  return this.buildVersion;
}
