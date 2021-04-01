package com.example.project.model;

import java.util.ArrayList;
import java.util.List;

public class ExerciseArray {


    public static List<Exercise> dataList(){
        List<Exercise> exerciseList = new ArrayList<Exercise>();

        Exercise ex1 = new Exercise("Cable Rope Triceps Pushdown",
                "1.) Start off standing in front of a cable machine, attaching a rope to the high pulley and grabbing the attachment with an overhand (palms down) grip." +
                        " 2.) Keeping your abs drawn in, back straight and elbows in at your sides, push the rope down towards your thighs." +
                        " 3.) As you push down towards your thighs, split the rope apart at the bottom and isolate the tricep muscle." +
                        " 4.) Hold this position for a count and return back up to the starting position. " +
                        "5.) Repeat for as many reps and sets as desired.", "Triceps");

        exerciseList.add(ex1);

        Exercise ex2 = new Exercise("Dumbbell Standing Triceps Extension", "1.) Start off standing with your feet shoulder width apart," +
                " keeping your back straight and your abs drawn in. 2.) Hold a dumbbell in both hands, with your palms facing up. " +
                "3.) Raise the dumbbell over your head and slowly lower the dumbbell in an arc behind your head and hold for a count. " +
                "4.) Slowly raise the dumbbell back up to the starting position.", "Triceps");
        exerciseList.add(ex2);

        Exercise ex3 = new Exercise("Dip", "1.) Start off by gripping the bars of a dip bar (if you do not know what this machine is ask for assistance)" +
                " and push yourself up into the starting position. 2.) In the starting position of this exercise your arms should be kept straight and close to your " +
                "body and knees bent so that it never touches the ground. 3.) Performing this exercise, slowly lower your body towards the ground, leading with your " +
                "chest on the descent. 4.) As you lower your body, your chest should be pointing down towards the ground at a 45 degree angle. 5.) Continue to lower " +
                "your body until you feel a stretch in your chest and shoulders, hold for a count then return back to the starting position. Tips : 1.) If you cannot " +
                "manage this exercise yet, it is important to get or use a spotter to hold onto your feet and assist you in the motion. 2.) Prevent from locking your " +
                "elbows in the starting position and keep your abs tight throughout the exercise.", "Triceps");
        exerciseList.add(ex3);

        Exercise ex4 = new Exercise("Barbell Curl", "1.) Start off standing up straight with your feet shoulder-width apart, " +
                "keeping your knees slightly bent and abs drawn in tight. 2.) Grab a barbell with a shoulder width underhand (palms up) grip, " +
                "lowering your arms down to your thighs fully and bending slightly at your elbows as this will be your starting position. 3.) " +
                "Slowly raise the bar towards your upper chest, squeezing your muscles and isolating the biceps. 4.) Hold this position for a " +
                "count and then return back to the starting position.", "Biceps");
        exerciseList.add(ex4);

        Exercise ex5 = new Exercise("Dumbbell Alternate Bicep Curl", "1.) Start by standing with your feet shoulders width apart. " +
                "2.) Pick up the barbells using a palm inward grip. 3.) Curl each barbell alternating each time. 4.) Repeat for the desired amount " +
                "of reps.", "Biceps");
        exerciseList.add(ex5);


        Exercise ex6 = new Exercise("Cable Drag Curl", "1.) Start off by standing up straight in front of a low pulley cable " +
                "machine with a straight bar attached to the machine, with your arms rested at your sides and feet flat on the floor. 2.) Grab" +
                " the bar in an underhand grip then slowly, keeping the bar as close as possible to your body, raise it up towards your shoulders" +
                ", isolating the bicep and hold for a count. 3.) Return back to the starting position. 4.) Repeat for as many reps and sets as desired.", "Biceps");
        exerciseList.add(ex6);


        Exercise ex7 = new Exercise("Barbell Deadlift", "1.) Start off standing in front of a barbell with your feet shoulder-width apart." +
                " 2.) Pick up the barbell while keeping your arms extended straight down. 3.) Stand up straight with the barbell in your hands, and refrain" +
                " from moving your arms. 4.) Bend back down at the knees with barbell. 5.) Repeat for the desired amount of reps.", "Back");
        exerciseList.add(ex7);


        Exercise ex8 = new Exercise("Barbell Bent Over Row", "1.) To begin this exercise, stand in front of a barbell with your " +
                "feet shoulder-width apart and bend over until your back is parallel with the floor. 2.) Grab the bar with a shoulder width grip " +
                "then lift the bar up off of the ground and this will be your starting position. 3.) Take the bar and raise it up towards you chest" +
                " using a controlled motion and continue until the bar is almost touching your lower chest. 4.) Hold this position for a few seconds," +
                " squeezing your back muscles and then lower the bar back to the starting position.", "Back");
        exerciseList.add(ex8);


        Exercise ex9 = new Exercise("Wide Grip Lat Pulldown", "1.) Start off sitting a cable pull down machine that has a wide bar " +
                "attachment and grab it with a wide overhand grip. 2.) Keeping your abs drawn in, back straight and pull down on the bar to your upper " +
                "chest. 3.) Hold for a count at the bottom position, squeeze your lats and then slowly return back to the starting position.", "Back");
        exerciseList.add(ex9);


        Exercise ex10 = new Exercise("Seated Calf Raise", "1.) Start off sitting at a calf raise machine, putting the balls of your feet" +
                " on the footpad and your thighs under the leg pad above your knees as this will be your starting position.. 2.) Unlock the bar and slowly " +
                "raise your toes up as high as possible, feeling a stretch in your calf muscles. 3.) Once you reach the top position, hold for a count then " +
                "return back to the start. 4.) Repeat for as many reps and sets as desired.", "Lower Legs");
        exerciseList.add(ex10);

        Exercise ex11 = new Exercise("Standing Calf Raises", "1.) Start off standing up straight with your toes on the footpads of the machine" +
                " and adjust your shoulder so that they are rested underneath the upper pads. 2.) Slowly raise up on the balls of your feet so that your heels are" +
                " lifted off of the pad and hold this position for a count. 3.) Return back to the starting position and repeat for as many reps and sets as desired.",
                "Lower Legs");
        exerciseList.add(ex11);

        Exercise ex12 = new Exercise("Seated Leg Curl", "1.) Start off by adjusting the machine so that the footpad is above your heels, " +
                "then sit upright with your abs tightly drawn in and your legs positioned in front of you. 2.) Slowly curl your legs back towards you, " +
                "isolating your calf muscles and hold for a count. 3.) Return back to the starting position and repeat for as many reps and sets as desired."
                , "Upper Legs");
        exerciseList.add(ex12);

        Exercise ex13 = new Exercise("Lying Leg Curls", "1.) Facing bench, stand between bench and lever pads. 2.) Lie prone on bench " +
                "with knees just beyond edge of bench and lower legs under lever pads. Grasp handles. 3.) Raise lever pad to back of thighs by flexing " +
                "knees. 4.) Lower lever pads until knees are straight. 5.) Repeat for the desired amount of reps and sets.", "Upper Legs");
        exerciseList.add(ex13);

        Exercise ex14 = new Exercise("Barbell Full Squat", " 1.) To begin this exercise; start off with a weighted barbell rested" +
                " upon your shoulders behind your neck. 2.) Bend at your knees and start to sit back with your hips as you go down for a standard " +
                "squat keeping your back and chest straight out. 3.) Continue on with the squat until your hamstrings are on your calves and hold on " +
                "for a few seconds. 4.) Then using the force of your heels and lower legs, straighten out and extend your hips to get back to your " +
                "starting position. 5.) Repeat this exercise for as many repetitions as needed", "Upper Legs");
        exerciseList.add(ex14);

        Exercise ex15 = new Exercise("Jackknife Sit up", "1.) Start by lying on your back with your arms by your side." +
                " 2.) Do a sit up while at the same time bringing your legs also to your chest. 3.) Try to keep your hands towards the" +
                " ground. 4.) Extend your self flat on the ground. 5.) Repeat for the desired amount of reps.", "Abs");
        exerciseList.add(ex15);

        Exercise ex16 = new Exercise("Reverse Crunch", "1.) To begin this exercise; start off with your back flat " +
                "on the floor and your legs extended with knees bent. 2.) Your arms should be at your sides during the entire exercise." +
                " 3.) Keeping your knees bent, move your legs up in the air, followed by inhaling and moving your legs towards your chest," +
                " rolling your pelvis back and lift your hips up off of the floor. 4.) Squeeze your abs as you reach the final position," +
                "hold on for a few seconds then return your legs back to the starting position. 5.) Repeat this exercise for as many repetitions as needed.", "Abs");
        exerciseList.add(ex16);

        Exercise ex17 = new Exercise("Sit Up", "1.) To begin this exercise; start off lying with your back flat on the floor. 2.) You can place your feet flat" +
                ", keep an object above them, or have a partner hold them. 3.) Bend your legs at the knees and place your hands behind your head. 4.) Then lift your upper body" +
                " towards your knees, contracting your abdominals on the way up. 5.) When reaching the final position, hold and squeeze for a few seconds then return back to the" +
                " starting position. 6.) Repeat this exercise for as many repetitions as needed.", "Abs");
        exerciseList.add(ex17);


        Exercise ex18 = new Exercise("Cable Reverse Grip Curl", "1.) Start of by setting up either a straight or EZ " +
                "bar on a low pulley cable machine and grab the bar using a reverse shoulder width grip. 2.) Keep your elbows tucked in" +
                " at your sides and slowly raise the bar up towards your shoulders, squeezing your forearms and hold for a count. 3.)" +
                " Return back to the starting position. 4.) Repeat for as many reps and sets as desired.", "Forearm");
        exerciseList.add(ex18);

        Exercise ex19 = new Exercise("Cable Reverse Grip Curl", "1.) Start of by setting up either a straight or EZ " +
                "bar on a low pulley cable machine and grab the bar using a reverse shoulder width grip. 2.) Keep your elbows tucked in" +
                " at your sides and slowly raise the bar up towards your shoulders, squeezing your forearms and hold for a count. 3.)" +
                " Return back to the starting position. 4.) Repeat for as many reps and sets as desired.", "Forearm");
        exerciseList.add(ex19);

        Exercise ex20 = new Exercise("Dumbbell Palms Up Wrist Curl Over A Bench", "1.) Start by picking up a dumbbell " +
                "in each hand while kneeling over a bench. 2.) With your palms facing upwards flex each forearm by lifting and lowering " +
                "the dumbbell with only your wrist. 3.) Exhale while raising your wrist. 4.) Inhale while lowering your wrist. 5.) Repeat" +
                " for the desired amount of reps and sets.", "Forearm");
        exerciseList.add(ex20);

        Exercise ex21 = new Exercise("Dumbbell Standing Reverse Curl", " 1.) Start off standing up straight, " +
                "feet shoulder width apart and arms rested at your sides holding a dumbbell in each hand with a palms down" +
                " reverse grip. 2.) Slowly with elevate the dumbbells up to your shoulders, squeezing your forearm, and hold" +
                " for a count. 3.) Return back to the starting position. 4.) Repeat for as many reps and sets as desired.",
                "Forearm");
        exerciseList.add(ex21);

        Exercise ex22 = new Exercise("Barbell Bench Press", "1.) Lie with your back flat on a bench with your " +
                "feet firmly on the ground and the bar resting on the bench’s rack. 2.) Slowly lift the bar off the rack and hold" +
                " it above your chest as this will be the starting position. 3.) Then lower the bar down until it is slightly above" +
                " your chest, making sure that it doesn't touch or slam against your chest. 4.) Hold this position briefly and make " +
                "sure you have complete control of the bar, then raise it back up to the starting postion. 3.) Place the bar on the" +
                " rack and that will complete your set.", "Chest");
        exerciseList.add(ex22);

        Exercise ex23 = new Exercise("Barbell Decline Bench Press", "1.) Start off lying on a decline" +
                " bench so that your head is lower than your feet. 2.) Grab onto the barbell with an overhand shoulder-" +
                "width grip and hold it directly above your chest as this will be your starting position. 3.) Then slowly" +
                " lower the bar until it is just above your chest, stop and hold for a second then return back to the starting" +
                " position. 4.) Repeat for as many reps and sets as desired.", "Chest");
        exerciseList.add(ex23);

        Exercise ex24 = new Exercise("Barbell Incline Bench Press", "1.) Start off setting up your " +
                "incline bench to a 45 degree angle or use a pre-designed incline bench press bench. 2.) Then lie flat " +
                "on your back on the bench with your feet firmly planted on the floor gripping the barbell with a slightly" +
                " wider than shoulder-width apart. 3.) Lift the bar off of the rack and hold it right above your chest as " +
                "this will be your starting position. 4.) Slowly lower the bar until it almost touches you and you feel a " +
                "stretch in your chest, and hold the position for a count. 5.) Return back up to the starting position and " +
                "repeat for as many reps and sets as desired.", "Chest");
        exerciseList.add(ex24);

        Exercise ex25 = new Exercise("Butterfly", "1.) Begin by sitting on a fly machine with your " +
                "back flat against the pad, having a firm grip upon the handles, keeping your upper arms parallel " +
                "to the floor and feet flat on the ground. 2.) Slowly bring the handles together and squeeze your " +
                "chest as you come closer together. 3.) As soon as you feel tension in your chest, stop and hold the" +
                " position for a count. 4.) Return back to the starting position and repeat for as many reps and sets as desired.", "Chest");
        exerciseList.add(ex25);

        Exercise ex26 = new Exercise("Barbell Front Raise", "1.) Start off grabbing a barbell with " +
                "an overhand grip and keeping your abs tight. 2.) Keeping your arms relatively straight, slightly" +
                " bend your elbows, bend your knees and raise the barbell to shoulder level. 3.) Once at shoulder " +
                "level, hold for a second then return back to the starting position in a controlled motion.", "Shoulders");
        exerciseList.add(ex26);

        Exercise ex27 = new Exercise("Barbell Standing Military Press", "1.) To begin this exercise; " +
                "start off by taking a weighted barbell and have it pressed up against your chest with your palms " +
                "facing outward. 2.) With the barbell in position, lift it above your head with locked arms and hold " +
                "for a few seconds squeezing your back and shoulders tightly. 3.) Return back to the starting position. " +
                "4.) Repeat this exercise for as many repetitions as needed.", "Shoulders");
        exerciseList.add(ex27);

        Exercise ex28 = new Exercise("Dumbbell Power Partials", "1.) Start off standing up straight " +
                "with your feet shoulder width apart and your arms at your sides, holding a dumbbell in each hand. 2.) " +
                "Keeping the palms of your hands inward facing your torso, slowly lift the weights out towards your sides" +
                " until they are at shoulder level and hold for a count, feeling a stretch in your muscles. 3.) Return back" +
                " to the starting position. 4.) Repeat for as many reps and sets as desired.", "Shoulders");
        exerciseList.add(ex28);


        return exerciseList;
    }
}
