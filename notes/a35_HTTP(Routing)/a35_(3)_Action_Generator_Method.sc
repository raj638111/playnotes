
# General
  + Should be a method that returns `Action` value
  
# Method with No Parameters
  GET   /                     controllers.Application.homePage()
  
# Method With Parameters
  + Parameters are extractor from
    - URI path or
    - Query String
    
    # Extract the page parameter from the path.
    GET   /:page                controllers.Application.show(page)
    
    # Extract the page parameter from the query string.
    GET   /                     controllers.Application.show(page)    
    
    def show(page: String) = Action {
      loadContentFromDatabase(page).map { htmlContent =>
        Ok(htmlContent).as("text/html")
      }.getOrElse(NotFound)
    }    
    
# Reference
  + https://www.playframework.com/documentation/2.6.x/ScalaRouting#Call-to-the-Action-generator-method