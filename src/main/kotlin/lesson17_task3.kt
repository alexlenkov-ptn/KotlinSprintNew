fun main() {
    val folderSecret = Folder("folder secret", 2, true)
    val folder = Folder("folder", 5, false)
    println(
        "${folderSecret.name}\n" +
                "${folderSecret.numberFiles}"
    )
    println(
        "${folder.name}\n" +
                "${folder.numberFiles}"
    )
}

class Folder(
    name: String,
    numberFiles: Int,
    isSecret: Boolean,
) {
    private val nameSecret: String = "Секретная папка"
    private val isSecret = isSecret

    val name: String = name
        get() = if (isSecret == true) nameSecret
        else field
    val numberFiles = numberFiles
        get() = if (isSecret == true) 0
        else field
}