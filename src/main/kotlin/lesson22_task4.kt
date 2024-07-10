fun main() {
    var mainScreenState = MainScreenState()
    println(mainScreenState.isLoading)
    mainScreenState = loadData(mainScreenState)
    println(mainScreenState.isLoading)
    mainScreenState = loadData(mainScreenState)
    println(mainScreenState.isLoading)

}

data class MainScreenState (
        val data: String = "",
        val isLoading : Boolean = false,
        ) {}

fun loadData(mainScreenState: MainScreenState) : MainScreenState {
    return mainScreenState.copy(isLoading = !mainScreenState.isLoading)
}