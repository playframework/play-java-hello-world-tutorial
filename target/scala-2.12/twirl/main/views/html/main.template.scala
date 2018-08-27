
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*15.54*/routes/*15.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.59*/routes/*16.65*/.Assets.versioned("images/favicon.png")),format.raw/*16.104*/("""">
        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*17.70*/("""" type="text/javascript"></script>
    </head>
  
    <body>
      <section id="top">
          <div class="wrapper">
              <img class="resize" src="assets/images/play_icon_reverse.svg" alt="logo" />
              <h1>Play Hello World Web Tutorial</h1>
          </div>
      </section>
        """),format.raw/*28.32*/("""
        """),_display_(/*29.10*/content),format.raw/*29.17*/("""
      
    """),format.raw/*31.5*/("""</body>

</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Aug 20 11:31:27 CDT 2018
                  SOURCE: C:/play-tutorial-example-java/play-java-hello-world-web/app/views/main.scala.html
                  HASH: 8ad3bc3e703d7f1abc75561a8af569c4ac3698b4
                  MATRIX: 1211->266|1336->296|1366->300|1449->408|1486->418|1521->426|1547->431|1717->574|1732->580|1795->621|1884->683|1899->689|1960->728|2013->754|2028->760|2090->801|2431->1205|2469->1216|2497->1223|2538->1237
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|58->28|59->29|59->29|61->31
                  -- GENERATED --
              */
          