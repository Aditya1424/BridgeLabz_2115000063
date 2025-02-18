import java.util.*;
interface MealPlan {
  void displayMeal();
}

class VegetarianMeal implements MealPlan {
  private String mealName;

  public VegetarianMeal(String mealName) {
    this.mealName = mealName;
  }

  @Override
  public void displayMeal() {
    System.out.println("Vegetarian Meal: " + mealName);
  }
}

class VeganMeal implements MealPlan {
  private String mealName;

  public VeganMeal(String mealName) {
    this.mealName = mealName;
  }

  @Override
  public void displayMeal() {
    System.out.println("Vegan Meal: " + mealName);
  }
}

class KetoMeal implements MealPlan {
  private String mealName;

  public KetoMeal(String mealName) {
    this.mealName = mealName;
  }

  @Override
  public void displayMeal() {
    System.out.println("Keto Meal: " + mealName);
  }
}

class HighProteinMeal implements MealPlan {
  private String mealName;

  public HighProteinMeal(String mealName) {
    this.mealName = mealName;
  }

  @Override
  public void displayMeal() {
    System.out.println("High-Protein Meal: " + mealName);
  }
}

class Meal<T extends MealPlan> {
  private List<T> mealList = new ArrayList<>();

  public void addMeal(T meal) {
    mealList.add(meal);
  }

  public List<T> getMeals() {
    return mealList;
  }
}

class MealPlanGenerator{
  public static <T extends MealPlan> void generateMealPlan(List<T> meals) {
    System.out.println("\nGenerated Personalized Meal Plan:");
    for (T meal : meals) {
      meal.displayMeal();
    }
  }
}

public class PersonalizedMeal {
  public static void main(String[] args) {

    Meal<VegetarianMeal> vegetarianPlan = new Meal<>();
    vegetarianPlan.addMeal(new VegetarianMeal("Grilled Veggie"));
    vegetarianPlan.addMeal(new VegetarianMeal("Vegetable Stir"));

    Meal<VeganMeal> veganPlan = new Meal<>();
    veganPlan.addMeal(new VeganMeal("Salad"));
    veganPlan.addMeal(new VeganMeal("Vegan"));

    Meal<KetoMeal> ketoPlan = new Meal<>();
    ketoPlan.addMeal(new KetoMeal("Grilled Salmon"));
    ketoPlan.addMeal(new KetoMeal("Cheese and Nuts"));

    Meal<HighProteinMeal> highProteinPlan = new Meal<>();
    highProteinPlan.addMeal(new HighProteinMeal("Chicken"));
    highProteinPlan.addMeal(new HighProteinMeal("Protein Shake"));

    MealPlanGenerator.generateMealPlan(vegetarianPlan.getMeals());
    MealPlanGenerator.generateMealPlan(veganPlan.getMeals());
    MealPlanGenerator.generateMealPlan(ketoPlan.getMeals());
    MealPlanGenerator.generateMealPlan(highProteinPlan.getMeals());
  }
}