package kz.yerzhan.menuapp

sealed class Screen(val route:String) {
    object RecipeScreen:Screen("recipeScrssn")
    object DetailScreen:Screen("detailScrssn")
}