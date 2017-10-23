

  # Done through dependency injection or explicit passing
  
    class MyController @Inject() (config: Configuration, c: ControllerComponents) extends AbstractController(c) {
      def getFoo = Action {
        Ok(config.get[String]("foo"))
      }
    }  
    
  # `get method example
		config.get[String]("foo")
		// bar = 8
		config.get[Int]("bar")
		// baz = true
		config.get[Boolean]("baz")
		// listOfFoos = ["bar", "baz"]
		config.get[Seq[String]]("listOfFoos")
		config.getAndValidate[String]("foo", Set("bar", "baz"))
		+ Note: `ConfigLoader for common types(Int, Boolean etc...) are already defined
		
  # `ConfigLoader
    + Can be used implicitly to support custom types
    + More here: https://www.playframework.com/documentation/2.6.x/ScalaConfig#ConfigLoader
    
  # Best practice
    + Optional configuration keys
      - Set it to null in the config file and access like get[Option[A]]
      - https://www.playframework.com/documentation/2.6.x/ScalaConfig#Optional-configuration-keys
      
