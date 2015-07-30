package pt.andre.ribeiro.testing.servlet.spark;

import spark.Request;
import spark.Response;
import spark.Route;
import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        get("/", new Route() {

            public Object handle(Request rqst, Response rspns) throws Exception {
               return "Hello world" ;
            }
        });
        
        
          
    }
}
