fun main() {
    val folderSecret = Folder("folder secret", 2, true)
    val folder = Folder("folder", 5, false)
    folderSecret.name
    folder.name
}

class Folder(
    name: String,
    numberFiles: Int,
    isSecret: Boolean,
) {

    val name: String = name
        get() = if (isSecret == true) println(
            "Скрытая папка\n" +
                    "Количество файлов - 0"
        ).toString()
        else println(
            "Папка <$field>\n" +
                    "Количество файлов - ${numberFiles}"
        ).toString()

    private val numberFiles = numberFiles
    private val isSecret = isSecret

}