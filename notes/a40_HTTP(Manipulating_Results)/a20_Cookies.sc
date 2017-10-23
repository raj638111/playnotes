
# Set Cookie

  val result = Ok("Hello world")
    .withCookies(Cookie("theme", "blue"))
    .bakeCookies()
    
# Discard Cookie

  val result2 = result.discardingCookies(DiscardingCookie("theme"))
  
# Set & Discard Cookie
  
  val result3 = result.withCookies(Cookie("theme", "blue")).discardingCookies(DiscardingCookie("skin"))
  
# Reference
  + https://www.playframework.com/documentation/2.6.x/ScalaResults#Setting-and-discarding-cookies          