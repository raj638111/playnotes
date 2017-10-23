
# Content-Type
  + Is inferred from Scala value specified in the response body
  + Example 1:  
    val textResult = Ok("Hello World!")
    - Content-Type header set to text/plain
# Can be changed using 'as',
    val htmlResult = Ok(<h1>Hello World!</h1>).as("text/html")
    val htmlResult2 = Ok(<h1>Hello World!</h1>).as(HTML)
      - Has the benenfit of charset automatically handled # Read more...
    
    
# Reference
  https://www.playframework.com/documentation/2.6.x/ScalaResults#Changing-the-default-Content-Type
    