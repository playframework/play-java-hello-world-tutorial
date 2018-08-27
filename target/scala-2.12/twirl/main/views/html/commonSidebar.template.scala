
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

object commonSidebar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),_display_(/*2.2*/defining(play.core.PlayVersion.current)/*2.41*/ { version =>_display_(Seq[Any](format.raw/*2.54*/("""
"""),format.raw/*3.1*/("""<h3>Table of Contents</h3>
<ul>
  <li><a href=""""),_display_(/*5.17*/routes/*5.23*/.HomeController.index),format.raw/*5.44*/("""#Introduction">Welcome</a>
  <li><a href=""""),_display_(/*6.17*/routes/*6.23*/.HomeController.explore),format.raw/*6.46*/("""">Play application overview</a>
  <li><a href=""""),_display_(/*7.17*/routes/*7.23*/.HomeController.tutorial),format.raw/*7.47*/("""">Implementing Hello World</a>
</ul>
<h3>Related Resources</h3>
<ul>
  <li><a href="https://playframework.com/documentation/"""),_display_(/*11.57*/version),format.raw/*11.64*/("""" target="_blank">Play documentation</a></li>
  <li><a href="//groups.google.com/forum/#!forum/play-framework" target="_blank">Mailing list</a></li>
  <li><a href="//gitter.im/playframework/playframework" target="_blank">Gitter Channel</a></li>
  <li><a href="//stackoverflow.com/questions/tagged/playframework" target="_blank">Stackoverflow</a></li>
  <li><a href="//lightbend.com/how" target="_blank">Professional support</a></li>
</ul>
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
                  DATE: Sun Aug 26 10:45:29 CDT 2018
                  SOURCE: C:/play-tutorial-example-java/play-java-hello-world-web/app/views/commonSidebar.scala.html
                  HASH: 1f02fc88ce1a62fd64cd848ea7c7aeb7fb4f743f
                  MATRIX: 949->1|1045->3|1073->6|1120->45|1170->58|1198->60|1274->110|1288->116|1329->137|1399->181|1413->187|1456->210|1531->259|1545->265|1589->289|1745->418|1773->425
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|43->11|43->11
                  -- GENERATED --
              */
          