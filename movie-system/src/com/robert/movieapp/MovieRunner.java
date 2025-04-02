package com.robert.movieapp;
import com.robert.movieapp.director.Director;
import com.robert.movieapp.producer.Producer;
import com.robert.movieapp.actor.Actor;
import com.robert.movieapp.movie.Movie;



    public class MovieRunner {
        public static void main(String[] args) {
            String famousMovies[] = {"Inception", "Interstellar", "Dunkirk"};
            String rolesOfActor1[] = {"Hero", "Detective", "Scientist"};
            String rolesOfActor2[] = {"Villain", "Businessman", "Spy"};

            Director director = new Director();
            director.directorId = 1;
            director.directorName = "Christopher Nolan";
            director.famousMovies = famousMovies;

            Producer producer = new Producer();
            producer.producerId = 1;
            producer.producerName = "Emma Thomas";
            producer.productionHouse = "Syncopy Films";

            Actor actors[] = new Actor[2];

            Actor actor1 = new Actor();
            actor1.actorId = 1;
            actor1.actorName = "Leonardo DiCaprio";
            actor1.roles = rolesOfActor1;

            Actor actor2 = new Actor();
            actor2.actorId = 2;
            actor2.actorName = "Tom Hardy";
            actor2.roles = rolesOfActor2;

            actors[0] = actor1;
            actors[1] = actor2;

            Movie movie = new Movie();
            movie.movieId = 101;
            movie.movieName = "Inception";
            movie.director = director;
            movie.producer = producer;
            movie.actors = actors;

            System.out.println("Movie ID: " + movie.movieId);
            System.out.println("Movie Name: " + movie.movieName);
            System.out.println("Director: " + movie.director.directorName);
            System.out.println("Producer: " + movie.producer.producerName);
            System.out.println("Production House: " + movie.producer.productionHouse);
            System.out.println("Lead Actor: " + movie.actors[0].actorName);
            System.out.println("Role: " + movie.actors[0].roles[0]);
        }
    }


