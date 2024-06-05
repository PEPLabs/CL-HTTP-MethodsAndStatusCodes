Status codes are how we tell the client machine how successful the HTTP Request was. HTTP Responses have 5 main categories of status codes:

There are 5 categories of status code responses:

* 100: Request was informational
* 200: Request was successful
* 300: Request is being redirected
* 400: Request failed due to a client-side error
* 500: Request failed due to a server-side error

CREATE ENDPOINTS FOR GET, POST, PUT, DELETE, PATCH:

    Define GET endpoint:

    Method: app.get(path, handler)
    Description:
        This method registers a handler to respond to HTTP GET requests at the specified path.

    Parameters:
        path (String): The URL path at which the handler will respond to GET requests.
        handler (HandlerFunction): The handler function or method reference that will process the 
                                   GET requests.

        app.get("/get-request", Main::handleGetRequest);

        Notes:
            The "handleGetRequest" method should contain the logic to process the GET request and return an appropriate response.

Similary, 

* Create endpoint for POST request in getInstance() method: 
    - Use the app.post() method, and pass the path as "/post-request".
    - For the Handler, create a method reference that contains the logic to process the POST 
      request and return an appropriate response.

* Create endpoint for PUT request in getInstance() method: 
    - Use the app.put() method, and pass the path as "/put-request".
    - For the Handler, create a method reference that contains the logic to process the PUT 
      request and return an appropriate response.

* Create endpoint for DELETE request in getInstance() method: 
    - Use the app.delete() method, and pass the path as "/delete-request".
    - For the Handler, create a method reference that contains the logic to process the DELETE 
      request and return an appropriate response.

* Create endpoint for PATCH request in getInstance() method: 
    - Use the app.patch() method, and pass the path as "/patch-request".
    - For the Handler, create a method reference that contains the logic to process the PATCH 
      request and return an appropriate response.


CREATE HANDLER METHODS FOR THE ENDPOINTS:

    Handler method for GET request: (handleGetRequest)

        private static void handleGetRequest(Context ctx) {
            
        }

    Function: ctx.result(message)
    Description:
        This function is used to set the result of a GET request endpoint to the specified message.
       
         private static void handleGetRequest(Context ctx) {
            ctx.result(message);
         }

    Parameters:
        message (string): The message to be set as the result of the GET request endpoint.          
                          Pass the message as "GET request endpoint".

        private static void handleGetRequest(Context ctx) {
            ctx.result("GET request endpoint");
         }

    Status Code:
    Description:
        This method sets the HTTP response status code to the specified code.

    Parameters:
        code (int): The HTTP status code to set for the response. Pass the "202 status code"      
                    indicating the request was ACCEPTED. 

Similarly, 

* Create handler method for POST request (handlePostRequest): 
    - Use ctx.result(message) to set the result by passing the message as "POST request endpoint".
    - Set the "201 status code" indicating the request was CREATED.

* Create handler method for PUT request (handlePutRequest):  
    - Use ctx.result(message) to set the result by passing the message as "PUT request endpoint".
    - Set the "201 status code" indicating the request was CREATED.

* Create handler method for DELETE request (handleDeleteRequest):  
    - Use ctx.result(message) to set the result by passing the message as "DELETE request endpoint".
    - Set the "200 status code" indicating the request was SUCCESS.
   
* Create handler method for PATCH request (handlePatchRequest):  
    - Use ctx.result(message) to set the result by passing the message as "PATCH request endpoint".
    - Set the "201 status code" indicating the request was CREATED.

