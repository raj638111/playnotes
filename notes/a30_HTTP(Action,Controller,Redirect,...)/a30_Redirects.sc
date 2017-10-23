

# Defaults `respsonse type` is  `303 SEE OTHER`

	def index = Action {
	  Redirect("/user/home")
	}

# Setting specific status code

	def index = Action {
	  Redirect("/user/home", MOVED_PERMANENTLY)
	}
	
# Reference
  + https://www.playframework.com/documentation/2.6.x/ScalaActions#redirects-are-simple-results-too
  	