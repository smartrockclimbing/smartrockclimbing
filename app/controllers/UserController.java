package controllers;


import play.mvc.Controller;
import play.mvc.Result;

public class UserController extends Controller{
    // Sets user id in session
    // User info contained in POST data
    public Result createUser(){
        String string = "{JSON response goes here}";
        return ok(string);
    }

    // Sets user id in session
    // Authentication info contained in POST data
    public Result login(){
        String string = "{JSON response goes here}";
        return ok(string);
    }

    // Returns JSON in response
    // User info contained in POST data
    public Result updateUser(){
        String string = "{JSON response goes here}";
        return ok(string);
    }

    // Returns JSON in response
    public Result getProfile(){
        String string = "{JSON response goes here}";
        return ok(string);
    }

    // Returns result in response
    public Result deleteUser(){
        String string = "{JSON response goes here}";
        return ok(string);
    }

}
