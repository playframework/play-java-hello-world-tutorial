
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""


"""),_display_(/*4.2*/main("Welcome")/*4.17*/ {_display_(Seq[Any](format.raw/*4.19*/("""
"""),_display_(/*5.2*/defining(play.core.PlayVersion.current)/*5.41*/ { version =>_display_(Seq[Any](format.raw/*5.54*/("""   
  
  """),format.raw/*7.3*/("""<section id="content" >
  <div class="wrapper doc">
  <article>
  <h2>Welcome to the Hello World Tutorial!</h2>
  <p>This tutorial introduces Play Framework, describes how Play web applications work, and walks you through steps to create page that displays a Hello World greeting.</p> 
  <p>If you loaded this page from the web server running on <code>localhost:9000</code>, congratulations! You have successfully built and run a Play application. If not, you likely opened the source <code>index.scala.html</code> file. Please follow the directions in the <code>README.md</code> file in the top-level project directory to run the tutorial.</li>

  <h2 id="introduction">Introduction to Play</h2>
  <p>As illustrated below, Play is a full-stack framework with all of the components you need to build a Web Application or a REST service, including:</p> 
  <ul>
    <li>An integrated HTTP server</li>
    <li>Form handling</li>
    <li>Cross-Site Request Forgery (CSRF) protection</li>
    <li>A powerful routing mechanism</li>
    <li>I18n support, and more.</li>
  </ul>    

   <img src="assets/images/play-stack.png" alt="Play Stack" />
   
   <p>Play integrates with many object relational mapping (ORM) layers. It has out-of-the-box support for Anorm, JavaEbean, PlaySlick, and JPA. See <a href="https://www.playframework.com/documentation/latest/JavaDatabase" target="_blank">Accessing an SQL Database</a> for more information. Many customers use NoSQL, other ORMs or even access data from a REST service.</p>

   
   <p>Play APIs are available in both Java and Scala. The Framework uses <a href="https://akka.io" target="_blank" >Akka</a> and <a href="https://doc.akka.io/docs/akka-http/current/index.html" target="_blank">Akka HTTP</a> under the hood. This endows Play applications with a stateless, non-blocking, event-driven architecture that provides horizontal and vertical scalability and uses resources more efficiently. Play projects contain Scala components, but because Play has a Java API, Java developers do not need to learn Scala to use Play successfully.</p>
   
   <p>Here are just a few of the reasons developers love using Play Framework:</p>
   <ul>
     <li>Its Model-View-Controller (MVC) architecture is familiar and easy to learn.</li>
     <li>Direct support of common web development tasks and hot reloading saves precious development time.</li>
     <li>A large active community promotes knowledge sharing.</li>
     <li>Use of <a href="https://github.com/playframework/twirl">Twirl templates</a> to render pages. The Twirl template language is:
       <ol>
         <li>Easy to learn</li>
         <li>Requires no special editor</li>
         <li>Provides type safety</li>
         <li>Is compiled so that errors display in the browser</li>
       </ol> 
       
   <p>To learn more about Play's benefits, visit the <a href="https://www.playframework.com" target="_blank" >Play website</a>. Now, let's <a href=""""),_display_(/*44.150*/routes/*44.156*/.HomeController.explore),format.raw/*44.179*/("""">explore the tutorial Play application</a>.</p>
</article>
<aside>
  """),_display_(/*47.4*/commonSidebar()),format.raw/*47.19*/("""
"""),format.raw/*48.1*/("""</aside>
</div>
</section>
  """)))}),format.raw/*51.4*/("""
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
                  DATE: Mon Aug 27 10:48:55 CDT 2018
                  SOURCE: C:/play-tutorial-example-java/play-java-hello-world-web/app/views/index.scala.html
                  HASH: 9e7b1ad482689739e2f4767c4bc7f632f6ddeb56
                  MATRIX: 941->1|1037->3|1069->10|1092->25|1131->27|1159->30|1206->69|1256->82|1293->93|4303->3075|4319->3081|4364->3104|4464->3178|4500->3193|4529->3195|4592->3228
                  LINES: 28->1|33->1|36->4|36->4|36->4|37->5|37->5|37->5|39->7|76->44|76->44|76->44|79->47|79->47|80->48|83->51
                  -- GENERATED --
              */
          