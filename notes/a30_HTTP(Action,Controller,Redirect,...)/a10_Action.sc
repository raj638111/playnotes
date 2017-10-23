
# Action
  + Takes `Request` and returns `Response`
  + Can be build in any controller extending `BaseController`
  + Examaple
    def echo = Action { request =>
      Ok("Got request [" + request + "]")
    }     
    
# Examples
	Action {
	  Ok("Hello world")
	}
	
	Action { request =>
	  Ok("Got request [" + request + "]")
	}
	
	Action { implicit request => //By making `implicit` other APIs that need the `request` can use it 
	  Ok("Got request [" + request + "]")
	}				  
  
    
  Action(parse.json) { implicit request =>  // `Body parser` can be specified
	  Ok("Got request [" + request + "]")
	}      
     
     
     
# Reference: https://www.playframework.com/documentation/2.6.x/ScalaActions#building-an-action  