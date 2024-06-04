package Lesson_1_to_10

const val USER_LOGIN = "Zaphod"
const val USER_PASSWORD = "PanGalactic"


fun main() {
    println("Введите, пожалуйста, логин")
    val login = readln().toString()


    if (login == USER_LOGIN) {
        println("Пользователь Zaphod, введите, пожалуйста, пароль")
        val password = readln().toString()
        if (password == USER_PASSWORD) {
            println(
                "[вздыхает...] Ваши данные проверены, и о, чудо, они верны...\n" +
                        "Пользователь \"Zaphod\", вам разрешено входить на борт корабля \"Heart of Gold\". " +
                        "Хотя мне всё равно...\n" +
                        "Ну вперед, войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...]\n" +
                        "Надеюсь, вам понравится пребывание здесь больше, чем мне."
            )
        }else {
            println("Пароль неверный")
        }

    } else {
        println("Пожалуйста, пройдите регистрацию")
    }
}


/*
Космический корабль "Heart of Gold" верифицирует каждого входящего пассажира с помощью логина и пароля.
Вас встречает параноидальный робот-андройд Марвин.

Внимание, пассажир.
Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля "Heart of Gold". [вздыхает...]
Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа.
Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. [вздыхает ещё глубже...]
Да, вперед, пожалуйста, вводите свои данные...

У вас есть зарегистрированный бортовой пользователь с именем "Zaphod" и паролем "PanGalactic".
Этот пользователь имеет доступ к управлению кораблем и может осуществлять навигацию по вселенной.

Бортовой робот-андроид Марвин печально запрашивает имя пользователя для входа в систему.
Система должна проверить, зарегистрирован ли пользователь.
Если нет, то система должна предложить пользователю зарегистрироваться и закончить процесс тут (завершить программу).

Если же пользователь уже зарегистрирован, система должна проверить пароль.
При успешной авторизации система должна вывести приветственное сообщение.

[вздыхает...] Ваши данные проверены, и о, чудо, они верны...
Пользователь "Zaphod", вам разрешено входить на борт корабля "Heart of Gold". Хотя мне всё равно...
Ну вперед, войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...]
Надеюсь, вам понравится пребывание здесь больше, чем мне.
 */