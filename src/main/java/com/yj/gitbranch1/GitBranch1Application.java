package com.yj.gitbranch1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitBranch1Application {

    public static void main(String[] args) {
        SpringApplication.run(GitBranch1Application.class, args);
    }

    public static String feat2(){
        return "feat2";
    }

}
