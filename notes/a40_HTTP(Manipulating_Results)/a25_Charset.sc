
# Charset
  + Is specified for text based responses
  + ***utf-8: Is the default
  + This information is used to,
    - Convert text to bytes for serialization
    - Used in 'Content-Type'
    
# How to change?
  + Just use an 'implicit' in the current scope
  
  class Application @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
    implicit val myCustomCharset = Codec.javaSupported("iso-8859-1")
    def index = Action {
      Ok(<h1>Hello World!</h1>).as(HTML)
    }
  }  
       
# Reference
  + https://www.playframework.com/documentation/2.6.x/ScalaResults#Changing-the-charset-for-text-based-HTTP-responses       
