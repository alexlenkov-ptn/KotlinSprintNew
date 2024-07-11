fun main() {
    val mainScreenViewModel = MainScreenViewModel()
    println(mainScreenViewModel.mainScreenState.isLoading)
    mainScreenViewModel.loadData()
    println(mainScreenViewModel.mainScreenState.isLoading)
    mainScreenViewModel.loadData()
    println(mainScreenViewModel.mainScreenState.isLoading)
}

class MainScreenViewModel(
    var mainScreenState: MainScreenState = MainScreenState()
) {

    data class MainScreenState(
        val data: String = "",
        val isLoading: Boolean = false,
    )

    fun loadData(): MainScreenState {
        mainScreenState = mainScreenState.copy(isLoading = !mainScreenState.isLoading)
        return mainScreenState
    }
}