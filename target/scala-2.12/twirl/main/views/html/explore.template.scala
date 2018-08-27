
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object explore extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Hello World")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
  """),_display_(/*4.4*/defining(play.core.PlayVersion.current)/*4.43*/ { version =>_display_(Seq[Any](format.raw/*4.56*/(""" 
  
  """),format.raw/*6.3*/("""<section id="content" >
  <div class="wrapper doc">
  <article>
    <h2>Play application overview</h2>

    <p>This tutorial is implemented as a Play application that demonstrates Play's basics. The starting point was the Play Java seed template, which set up the application project structure and the configuration to build with either Gradle or sbt. We added stylesheets to the project that use Play's colors and provide a TOC.</p>
    <p>Let's start by looking at what happens at runtime. When you entered the server name and port number, <a target="play-docs" href="http://localhost:9000/">http://localhost:9000/</a>, in your browser:</p>
    <ul>
      <li>The browser requested the root <code>/</code> URI from the HTTP server using the <code>GET</code> method.</li>
      <li>The Play internal HTTP Server received the request.</li>
      <li>Play resolved the request using the <code>routes</code> file, which maps URIs to controller action methods.</li>
      <li>The action method used Twirl templates to render the <code>index</code> page.</li>
      <li>The HTTP server returned the response as an HTML page.</li>
    </ul>
    <p> At a high level, the flow looks something like this:</p>
    <p><img src="assets/images/play-request-response.png" alt="Request and response"/></p>
    <h3>Explore the project</h3
    <p>Next, let's look at the tutorial project to locate the implementation for the following:</p>
    <ul>
      <li>The controller action method that defines how to handle a request to the root URI.</li>
      <li>The <code>routes</code> file that maps the request to the controller method.</li>
      <li>The Twirl template that the action method calls to render the HTML markup.</li>
    </ul>  
    <p>Using a command window or a GUI, start with the top-level project directory. The following directories contain application components:</p>

    <note>Note: When changing directories in Windows shells, substitute <code>/</code> for <code>\</code> in path names.</note>
    <p>
    <ol>
      <li>The <code>app</code> subdirectory contains directories for <code>controllers</code> and <code>views</code>, which will be familiar to those experienced with the Model View Controller (MVC) architecture. Since this simple project does not need an external data repository, it does not contain a <code>models</code> directory, but this is where you would add it.</li>
      <li>The <code>public</code> subdirectory contains directories for <code>images</code>, <code>javascripts</code>, and <code>stylesheets</code>.</li>
      <li>The <code>conf</code> directory contains application configuration. For details on the rest of the project's structure see <a href="https://www.playframework.com/documentation/2.6.x/Anatomy#The-Play-application-layout" target="blank" />Play Application Layout</a>.</li>
    
      <li>To locate the controller action method, open <code>app/controllers/HomeController.java</code> file with your favorite text editor. 
        <p>The <code>Homecontroller</code> class includes the <code>index</code> action method, as shown below. This is a very simple action method that generate an HTML page from the <code>index.scala.html</code> Twirl template file.</p>
        <pre><code>public Result index() """),format.raw/*40.42*/("""{"""),format.raw/*40.43*/("""
            """),format.raw/*41.13*/("""return ok(views.html.index.render());
        """),format.raw/*42.9*/("""}"""),format.raw/*42.10*/("""</code></pre>
        </p></li>
      <li>To view the route that maps the browser request to the controller method, open the <code>conf/routes</code> file. 
        <p>A route consists of an HTTP method, a path, and an action. This control over the URL schema makes it easy to design clean, human-readable, bookmarkable URLs. The following line maps a GET request for the root URL <code>/</code> to the <code>index</code> action in <code>HomeController</code>:</p>
        <code>GET     /                           controllers.HomeController.index</code></li>
      <li>Open <code>app/views/index.scala.html</code> with your text editor. 
        <p>The main directive in this file calls the main template <code>main.scala.html</code> with the string <code>"Welcome"</code> to generate the page. 
          You can open <code>app/views/main.scala.html</code> to see how a <code>String</code> parameter sets the page title.</p></li>
    </ol>
  </p>
 <p>With this overview of the tutorial application, you are ready to <a href=""""),_display_(/*52.80*/routes/*52.86*/.HomeController.tutorial),format.raw/*52.110*/("""">add  your own "Hello World" greeting</a>.</p>
</article>
<aside>
  """),_display_(/*55.4*/commonSidebar()),format.raw/*55.19*/("""
"""),format.raw/*56.1*/("""</aside>
</div>
</section>

""")))}),format.raw/*60.2*/("""
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Aug 27 11:21:46 CDT 2018
                  SOURCE: C:/play-tutorial-example-java/play-java-hello-world-web/app/views/explore.scala.html
                  HASH: 1ece1b73b482b03f6719752250b0b88ee17e8ad9
                  MATRIX: 943->1|1039->3|1069->8|1096->27|1135->29|1165->34|1212->73|1262->86|1297->95|4613->3383|4642->3384|4684->3398|4758->3445|4787->3446|5852->4484|5867->4490|5913->4514|6012->4587|6048->4602|6077->4604|6140->4637
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|38->6|72->40|72->40|73->41|74->42|74->42|84->52|84->52|84->52|87->55|87->55|88->56|92->60
                  -- GENERATED --
              */
          