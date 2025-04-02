package com.cult.gymapp;

import com.cult.gymapp.workout.Workout;



    public class GymRunner {
        public static void main(String[] args) {
            String strengthTraining[] = {"Squats", "Bench Press", "Deadlifts"};
            String cardioExercises[] = {"Running", "Jump Rope", "Cycling"};
            String flexibilityExercises[] = {"Yoga", "Stretching", "Pilates"};

            String locationOfGym = "Bangalore";
            String branchesOfGym[] = {"Hebbal", "Yelahanka", "Indiranagar"};

            Workout workouts[] = new Workout[3];

            Workout workout1 = new Workout();
            workout1.workoutId = 1;
            workout1.workoutName = "Strength Training";
            workout1.exercises = strengthTraining;

            Workout workout2 = new Workout();
            workout2.workoutId = 2;
            workout2.workoutName = "Cardio";
            workout2.exercises = cardioExercises;

            Workout workout3 = new Workout();
            workout3.workoutId = 3;
            workout3.workoutName = "Flexibility";
            workout3.exercises = flexibilityExercises;

            workouts[0] = workout1;
            workouts[1] = workout2;
            workouts[2] = workout3;

            Gym ref = new Gym();
            ref.gymId = 1;
            ref.location = locationOfGym;
            ref.branches = branchesOfGym;
            ref.workouts = workouts;

            System.out.println("Gym ID: " + ref.gymId);
            System.out.println("Location: " + ref.location);
            System.out.println("Branch: " + ref.branches[0]);
            System.out.println("Workout: " + ref.workouts[0].workoutName);
            System.out.println("Exercises: " + ref.workouts[0].exercises[0] + ", " + ref.workouts[0].exercises[1] + ", " + ref.workouts[0].exercises[2]);
        }
    }


