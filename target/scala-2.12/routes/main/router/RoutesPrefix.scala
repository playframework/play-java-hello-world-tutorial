// @GENERATOR:play-routes-compiler
// @SOURCE:C:/play-tutorial-example-java/play-java-hello-world-web/conf/routes
// @DATE:Mon Aug 27 10:48:53 CDT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
