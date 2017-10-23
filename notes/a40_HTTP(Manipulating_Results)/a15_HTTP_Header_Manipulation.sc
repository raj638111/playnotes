
# Example
  
  val result = Ok("Hello World!").withHeaders(
    CACHE_CONTROL -> "max-age=3600",
    ETAG -> "xx")  
    
# Reference
  https://www.playframework.com/documentation/2.6.x/ScalaResults#Manipulating-HTTP-headers    