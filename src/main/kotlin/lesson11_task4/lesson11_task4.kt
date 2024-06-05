package lesson11_task4

fun main() {

}

class CategoryOfRecipe(
    val imageUrlCategory: String,
    val listOfRecipes: List<Recipe>,
) {

}

class Recipe(
    val imageUrlRecipe: String,
    val portionsCount: String,
    val ingredients: List<Ingredient>,
    val cookingMethod: String,
) {
}

class Ingredient(
    val name: String,
    val counts: String,
) {

}