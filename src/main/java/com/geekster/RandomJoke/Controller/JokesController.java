package com.geekster.RandomJoke.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class JokesController {
    static ArrayList<String> newJokes = new ArrayList<>();
    @PostMapping(value="jokes")
    public String saveJokes(@RequestBody String jokes){
        newJokes.add(jokes);
        return "Joke saved";
    }
    @GetMapping(value="/Jokes")
    public String getJokes(){

        newJokes.add("what is little bear with no teeth is called?\n"+"\n"+
                "A gummy Bear.");
        newJokes.add("What’s an alligator in a vest called?\n" +
                "\n" +
                "An investi-gator.");
        newJokes.add("What’s the best way to throw a birthday party on Mars?\n" +
                "\n" +
                "You planet.");
        newJokes.add("Why did the chocolate chip cookie go to see the doctor?\n" +
                "\n" +
                "He felt crummy. Poor little guy—maybe we could cheer him up with these cookie puns that are batter than you think.");
        newJokes.add(". Why did the toddler toss the butter out the window?\n" +
                "\n" +
                "So she could see a butter-fly. For more foodie fun, check out these hilarious");
        int randomNumber = 0+(int)(Math.random()*(4-0)+1);
        return newJokes.get(randomNumber);
    }
}
