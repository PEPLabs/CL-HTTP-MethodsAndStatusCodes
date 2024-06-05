import io.javalin.Javalin;
import io.javalin.http.Context;

public class Main {
     
    public static Javalin getInstance() { 
       
        Javalin app = Javalin.create();
        
        // Define endpoint for GET request
        app.get("/get-request", Main::handleGetRequest);
     
        // Define endpoint for POST request
       
     
        // Define endpoint for PUT request
      

        // Define endpoint for DELETE request
       
        
        // Define endpoint for PATCH request
       
          
        return app;
    
    }
     
    // Handler method for GET request
    private static void handleGetRequest(Context ctx) {
        ctx.result("GET request endpoint").status(202);
    }
     
    // Handler method for POST request
       
     
    // Handler method for PUT request
       
     
    // Handler method for DELETE request
        
     
    // Handler method for PATCH request
        
  
}


