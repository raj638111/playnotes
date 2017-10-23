
# Controllers
  + Are `Action Generators`: ie generates `Action` values
  + Takes advantage of `Dependency injection`
    
# Available built-in `Result`
  + All these are available in `play.api.mvc.Results` trait
	val ok = Ok("Hello world!")
	val notFound = NotFound
	val pageNotFound = NotFound(<h1>Page not found</h1>)
	val badRequest = BadRequest(views.html.form(formWithErrors))
	val oops = InternalServerError("Oops")
	val anyStatus = Status(488)("Strange response type")
  
  
# Example 1

	package controllers
	import javax.inject.Inject
	import play.api.mvc._
	
	class Application @Inject() (cc: ControllerComponents) extends AbstractController(cc) {
	
	  def index = Action {
	    Ok("It works!")
	  }
	  
		def hello(name: String) = Action {
	    Ok("Hello " + name)
	  }
  }  
  
# Example 2: Using `HttpEntity`

	import play.api.http.HttpEntity
	
	def index = Action {
	  Result(
	    header = ResponseHeader(200, Map.empty), // Header
	    body = HttpEntity.Strict(ByteString("Hello world!"), Some("text/plain")) // Body (Response Body)
	  )
	}
	  

# Note:
  + *** Use Classes. Defining `object` as controller will not be supported in future
# Reference
  + https://www.playframework.com/documentation/2.6.x/ScalaActions#Controllers-are-action-generators
  