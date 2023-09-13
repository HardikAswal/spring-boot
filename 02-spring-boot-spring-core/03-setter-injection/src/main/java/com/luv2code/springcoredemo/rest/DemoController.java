package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;

    // Constructor injection
    //    @Autowired // optional when there is only one constructor
    //    DemoController(Coach myCoach) {
    //        this.myCoach = myCoach;
    //    }

    @Autowired
    public void setCoach(Coach theCoach) { // method name can be any, no such requirement of "set" keyword
        myCoach = theCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}

/*

Another type of injection is field injection which is not recommended by the spring team anymore. In field injection,
we can Autowire there is no need for constructor or setter method. It goes like this:

public class DemoController {

    @Autowired
    private Coach myCoach;

    ...

}

Now, spring will automatically inject the cricketCoach class here, even in private variables

 */
