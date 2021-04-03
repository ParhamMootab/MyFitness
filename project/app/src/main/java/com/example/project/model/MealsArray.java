package com.example.project.model;

import com.example.project.R;

import java.util.ArrayList;
import java.util.List;

public class MealsArray {

    public static List<Meal> mealList(){

        List<Meal> meals = new ArrayList<>();
        meals.add(new Meal("Spinach & Mushroom Quiche",
                "This healthy vegetarian quiche recipe is as simple as it gets." +
                        " It's a quiche without the fussy crust! It's filled with\n" +
                        " sweet wild mushrooms and savory Gruyère cheese. Enjoy it for " +
                        "breakfast or brunch, or serve it with a light salad for lunch. " +
                        "Find the recipe here: https://www.eatingwell.com/recipe/278023/spinach-mushroom-quiche/",
                R.drawable.spinach_mushroom));

        meals.add(new Meal("Spicy Weight-Loss Cabbage Soup",
                "Based on a popular weight-loss plan, this healthy cabbage soup recipe gets tons of flavor and a\n" +
                        " metabolism-boosting kick from spicy chiles. " +
                        "Find the recipe here: https://www.eatingwell.com/recipe/256474/mexican-cabbage-soup/",
                R.drawable.cabbage_soup));

        meals.add(new Meal("Veggie & Hummus Sandwich",
                "This mile-high vegetable and hummus sandwich makes the perfect heart-healthy vegetarian lunch to go.\n" +
                        " Mix it up with different flavors of hummus and different types of vegetables depending on your mood." +
                        " Find the recipe here: https://www.eatingwell.com/recipe/259817/veggie-hummus-sandwich/",
                R.drawable.hummus_sandwich));

        meals.add(new Meal("Zucchini Noodles with Avocado Pesto & Shrimp",
                "Cut some carbs and use spiralized zucchini in place of noodles in this zesty pesto pasta dish recipe.\n" +
                        " Top with Cajun-seasoned shrimp to complete this quick and easy dinner." +
                        " Find the recipe here: https://www.eatingwell.com/recipe/257004/zucchini-noodles-with-avocado-pesto-shrimp/",
                R.drawable.pesto_shrimp));

        meals.add(new Meal("Slow-Cooker Braised Beef with Carrots & Turnips",
                "The spice blend in this healthy beef stew recipe--cinnamon, allspice and cloves\n" +
                        "--may conjure images of apple pie, but the combo is a great fit in savory applications too.\n" +
                        " Serve over creamy polenta or buttered whole-wheat egg noodles." +
                        " Find the recipe here: https://www.eatingwell.com/recipe/256499/slow-cooker-braised-beef-with-carrots-turnips/",
                R.drawable.carrot_turnip));

        meals.add(new Meal("Sriracha-Buffalo Cauliflower Bites",
                "This recipe for spicy Buffalo cauliflower bites is a great vegetarian alternative to Buffalo wings. Roasted cauliflower stands in for chicken\n" +
                        " and provides more fiber and fewer calories. Serve this easy appetizer with carrot sticks, celery and your favorite ranch or blue cheese dressing." +
                        " Find the recipe here: https://www.eatingwell.com/recipe/251316/sriracha-buffalo-cauliflower-bites/",
                R.drawable.cauliflower));

        meals.add(new Meal("Spinach & Egg Sweet Potato Toast",
                "Skip the gluten and get some vitamin C with this healthy sweet potato toast recipe. \n" +
                        "Topped with spinach, egg and a dash of hot sauce, it's a delicious alternative to eggs Benedict." +
                        " Find the recipe here: https://www.eatingwell.com/recipe/262099/spinach-egg-sweet-potato-toast/",
                R.drawable.potato_toast));

        meals.add(new Meal("Chicken Cutlets with Sun-Dried Tomato Cream Sauce",
                "Though a chicken cutlet may be a chicken breast cut in half, this recipe shows how to make chicken cutlets \n" +
                        "with double the deliciousness. A jar of sun-dried tomatoes does double duty for this healthy dinner recipe.\n" +
                        " The flavorful oil they're packed in is used to sauté the chicken, and the tomatoes go into the cream sauce." +
                        " Find the recipe here: https://www.eatingwell.com/recipe/276341/chicken-cutlets-with-sun-dried-tomato-cream-sauce/",
                R.drawable.chicken_cutlets));


        meals.add(new Meal("Chocolate-Peanut Butter Energy Bars",
                "Dates provide all the sweetness you need for these no-bake energy bars. Each square serves up a hearty dose of protein--thanks\n" +
                        " to peanut butter and peanuts--as well as fiber from rolled oats. Kids will love the chewy bites with crunchy nuts." +
                        " Find the recipe here: https://www.eatingwell.com/recipe/266632/chocolate-peanut-butter-energy-bars/",
                R.drawable.chocalate_bars));

        meals.add(new Meal("Peanut Butter-Banana Cinnamon Toast",
                "This satisfying peanut butter-banana toast gets a sprinkle of cinnamon for an extra flavor boost." +
                        " Find the recipe here: https://www.eatingwell.com/recipe/261628/peanut-butter-banana-cinnamon-toast/",
                R.drawable.peanut_butter));
        return meals;
    }
}
