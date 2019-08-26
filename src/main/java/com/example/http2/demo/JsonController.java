package com.example.http2.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JsonController {

    @GetMapping("/api")
    public List<Dummy> getJsonResponse() {
        List<Dummy> dummies = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            dummies.add(new Dummy(i));
        }

        return dummies;
    }


    private class Dummy {
        private int id;
        private String name;

        public Dummy() {
        }

        Dummy(int id) {
            this.id = id;
            this.name = "Name" + id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
