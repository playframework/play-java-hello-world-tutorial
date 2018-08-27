
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

object tutorial extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
    <h2>Implementing Hello World</h2>
    <p>This tutorial provides the instructions for using <a href="http://www.scala-sbt.org/" target="_blank"><code>sbt</code></a> (simple build tool) from a command window to build the application, but you can also integrate Play projects with your <a href="https://playframework.com/documentation/"""),_display_(/*10.300*/version),format.raw/*10.307*/("""/IDE" target="_blank">favorite IDE</a>.</p>
    <p> To see how simple it is to work with Play, let's add a customized "Hello World" greeting to this tutorial app. The main steps include:</p>
     <ul>
       <li><a href="#create">Create a new page</a></li>
       <li><a href="#action">Add an action method</a></li>
       <li><a href="route">Define a route</a></li>
       <li><a href="customize">Customize the greeting</a></li>
     </ul>

     <h3 id="create">Create the Hello World page</h3>
     <p>Follow these instructions to add a new page:</p>
     <ol>
       <li>With any text editor, create a file named <code>hello.scala.html</code> and save it in the <code>app/views</code> directory of this tutorial project.</li>
       <li>Add the following contents to the file:
   <pre><code>&#64;main("Hello") """),format.raw/*24.34*/("""{"""),format.raw/*24.35*/("""
      """),format.raw/*25.7*/("""&lt;section id="content"&gt;
          &lt;div class="wrapper doc"&gt;
             &lt;article&gt;
              &lt;h1&gt;Hello World&lt;/h1&gt;
            &lt;/article&gt;  
            &lt;aside&gt;
              &#64;commonSidebar()
            &lt;/aside&gt;
          &lt;/div&gt;
        &lt;/section&gt;
  """),format.raw/*35.3*/("""}"""),format.raw/*35.4*/("""</code></pre>
   <p>The Twirl and HTML markup for your new page accomplishes the following:</p>
   <ul>
     <li>The <code>&#64;</code> sign tells the template engine to interpret what follows.
       <p>In this case, <code>&#64;main("Hello")</code> calls the main template, <code>main.scala.html</code> and passes it the page title of <code>Hello</code>.</p></li>
     <li>The <code>content</code> section contains the <code>Hello World</code> greeting. The main template will insert this into the body of the page.</li>
     <li>The <code>&lt;aside&gt;</code> section adds the TOC to the right side so that you will be able to navigate back to this page.  
  </ul>
</ol>
    <h3 id="action">Add an action method</h3>
  <p>Next, add an action method that will render the new page. To keep things simple, you will add the new controller to the existing class. In a real application, you can organize controllers in multiple classes if you wish.</p> 
  <p>Open the <code>app/controllers/HomeController.java</code> file. Below the tutorial method and above the closing brace, add the following method:
      <pre><code>public Result hello() """),format.raw/*47.40*/("""{"""),format.raw/*47.41*/("""
            """),format.raw/*48.13*/("""return ok(views.html.hello.render());
        
      """),format.raw/*50.7*/("""}"""),format.raw/*50.8*/("""</code></pre>
  </p>
  <p>This method has no input parameters and simply renders the new <code>hello</code> page.

  <h3 id="route">Define a route</h3>

  <p>A <code>route</code> tells Play how to handle incoming requests and includes the request path, an HTTP method, and the controller action to invoke. When you add a route to the <code>routes</code> file, Play's routes compiler will automatically generate a router class that calls that action using an instance of that controller. For more information see <a href="https://www.playframework.com/documentation/2.6.x/ScalaRouting#HTTP-routing" target="blank">HTTP Routing</a>. By default, the controller instances are created using dependency injection. See <a href="https://www.playframework.com/documentation/latest/ScalaDependencyInjection#Dependency-Injection" target="blank">Dependency Injection</a> for more information.</p>
 <p>To define a route for the new page:</p>
 <ol>
   <li>Open the <code>conf/routes</code> file.</li>
   <li>Below the <code>tutorial</code> page route, add the following line:
     <p><code>GET     /hello      controllers.HomeController.hello</code></p></li>
 </ol>
 <p>Test the new page:
 <ol>
   <li>If you stopped the application for some reason, restart it with the <code>sbt run</code> command.</li>
   <li>Enter the URL <a href="http://localhost:9000/hello">http://localhost:9000/hello</a> to view the results of your work. The browser should respond with something like the following:
 <p><img src="assets/images/hello-one.png" alt="Add Request and response screen"/></p></li>
</ol>

<h3 id="customize">Customize the greeting</h3>

 <p>As the final part of this tutorial, we'll modify the hello page to accept an HTTP request parameter that passes in a name. The steps include a deliberate mistake to demonstrate how Play provides useful feedback.</p>
 <p>To customize the Hello World greeting, follow these steps:</p>
 <ol>
   <li>In the <code>app/controllers/HomeController.java</code> file, modify the <code>hello</code> action method to accept a <code>String name</code> parameter. The modified action should look like the following:
     <pre><code>public Result hello(String name) """),format.raw/*76.50*/("""{"""),format.raw/*76.51*/("""
           """),format.raw/*77.12*/("""return ok(views.html.hello.render());
         """),format.raw/*78.10*/("""}"""),format.raw/*78.11*/("""</code></pre></li>
  <li>In the <code>conf/routes</code> file, add a <code>(name: String)</code> parameter at the end of the <code>/hello</code> route:
   <p><code>GET  /hello        controllers.HomeController.hello(name: String)</code></p></li>
 <li>In Twirl templates, all variables and their types must be declared. From the <code>app/views/</code> directory, open the <code>hello.scala.html</code> file and do the following:
   <ul>
     <li>Insert a new line at the top of the file.</li>
     <li>On that line, add an <code>&#64;</code> directive that declares the name parameter and its type: <code>&#64;(name: String)</code>.</li>
     <li>To use the variable on the page, change the text in the <code>&lt;h2&gt;</code> heading from <code>Hello World</code> to <code>&lt;h2&gt;Hello &#64;name!&lt;/h2&gt;</code>.
    </li>
  </ul>
 <p>To test the cusomization:</p>
 <ol>
   <li>Open a new browser tab</li> 
   <li>Enter the following URL and pass in any name as a query parameter to the hello method: <a target="play-docs" href="http://localhost:9000/hello?name=MyName">http://localhost:9000/hello?name=MyName</a>. 
     <p>Play responds with a helpful compilation error that tells you the file and line number causing the problem. The message shows that the render method in the return value requires a typed parameter: </p>
     <p><img src="assets/images/compilation-error.png" alt="Error message"/></p></li>
</ol>
<p>To fix the compilation error, modify the <code>hello</code> action method in <code>HomeController</code> so that the it includes the <code>name</code> parameter when rendering the view:
<pre><code>public Result hello(String name) """),format.raw/*96.45*/("""{"""),format.raw/*96.46*/("""
          """),format.raw/*97.11*/("""return ok(javaguide.hello.html.helloName.render(name));
  """),format.raw/*98.3*/("""}"""),format.raw/*98.4*/("""</code></pre></p>
<p> Save the file and refresh the browser. The page should display a customized greeting similar to the following:</p>
<p><img src="assets/images/hello-custom.png" alt="Hello Malitha"/></p>
 
 <h3>Summary</h3>
 <p>Thanks for trying our tutorial. You learned how to use an action method, routes, Twirl template, and input parameter to create a customized Hello World greeting! You experienced how template compilation makes it easier to identify and fix problems and how auto-reloading saves time.
</p> 
</article>
<aside>
  """),_display_(/*107.4*/commonSidebar()),format.raw/*107.19*/("""
"""),format.raw/*108.1*/("""</aside>
</div>
</section>
""")))}),format.raw/*111.2*/("""
""")))}),format.raw/*112.2*/("""
"""))
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
                  SOURCE: C:/play-tutorial-example-java/play-java-hello-world-web/app/views/tutorial.scala.html
                  HASH: bde98b7ddc4710bc213e90cc4d7decca87312033
                  MATRIX: 944->1|1040->3|1070->8|1097->27|1136->29|1166->34|1213->73|1263->86|1299->96|1736->505|1765->512|2620->1339|2649->1340|2684->1348|3037->1674|3065->1675|4244->2826|4273->2827|4315->2841|4397->2896|4425->2897|6659->5103|6688->5104|6729->5117|6805->5165|6834->5166|8538->6842|8567->6843|8607->6855|8693->6914|8721->6915|9300->7467|9337->7482|9367->7484|9429->7515|9463->7518
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|38->6|42->10|42->10|56->24|56->24|57->25|67->35|67->35|79->47|79->47|80->48|82->50|82->50|108->76|108->76|109->77|110->78|110->78|128->96|128->96|129->97|130->98|130->98|139->107|139->107|140->108|143->111|144->112
                  -- GENERATED --
              */
          