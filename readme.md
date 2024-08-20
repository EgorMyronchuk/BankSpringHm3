## Міні проєкт "Клієнт-банк" (продовження)

Суть проєкту: створення прототипу панелі адміністратора для клієнт-банку програми.

## DTO, ModelMapper, validations, Spring Data, Lombok

## Завдання

- Створити DTO для всіх сутностей
- Перевірка вхідних даних при отриманні їх з фронт-енду
- Підключити Spring Data JPA
- Підключити бібліотеку Lombok

#### Технічні вимоги:

- Додати користувачеві нове поле – пароль (`String password`). Ніколи не віддавати це поле у відповіді, яка йде на фронт-енд
- Додати користувачеві нове поле - номер телефону
- Додати в клас AbstractEntity поля `createdDate`, `lastModifiedDate`. Налаштувати функціонал JPA auditing таким чином, щоб ці поля автоматично зберігалися/оновлювалися під час запису об'єктів у базу даних
- Створити DTO для всіх сутностей у системі. Для кожної сутності треба створити два DTO класи - з приставками `Request` та `Response` (наприклад, `CustomerRequest`, `CustomerResponse`). Перший DTO клас буде використовуватися для валідації даних, які приходять з фронт-енду. Другий - для визначення списку та формату полів, які повертатимуться у відповіді на фронт-енд
- Додати до кожного `Request` DTO автоматичну валідацію вхідних даних перед використанням у контролері
- У DTO для класу Customer мають бути такі валідації:
  - вік користувача має бути не менше 18 років
  - ім'я має складатися щонайменше з 2 символів
  - телефон повинен валідуватися за допомогою регулярного виразу
  - Імейл повинен валідуватися за допомогою регулярного виразу
- У DTO для класу Account мають бути такі валідації:
  - баланс рахунку може бути негативним
- У DTO для класу Employer мають бути такі валідації:
  - ім'я компанії має містити щонайменше 3 символи
  - адреса компанії повинна містити щонайменше 3 символи
- Додати між контролерами та сервісами новий шар `Facade`, який займатиметься перетворенням DTO по суті та навпаки
- Використовувати `ModelMapper` для автоматичного мапінгу DTO по сутності та навпаки
- Використовувати функціонал Spring Data JPA для отримання цього з БД. Видалити раніше написані методи, які автоматично реалізовані за допомогою Spring Data
- Додати пагінацію для ендпоінта, що повертає список усіх користувачів. За замовчуванням він повинен повертати лише перших 10 користувачів. При цьому в запиті має бути можливість вказати номер запитуваної сторінки та кількість елементів на сторінці
- Використовувати Lombok у всіх сутностях для генерації геттерів, сеттерів, перевизначення методів `equals()`, `hashCode()` та `toString()`. Не забудьте знайти та встановити плагін Lombok для IDE, без нього код не буде працювати

#### Необов'язкове завдання просунутої складності:

- створити окремий клас для валідації пароля користувача. Пароль повинен бути не менше 8 символів, і містити як мінімум 1 велику й 1 малу літеру
- Використовуючи функціонал JsonView, додати два різні види для Response DTO користувача:
  - Один повертатиметься, якщо в контролері було запитано одного користувача. Відповідь має містити всі поля з класу Customer (крім пароля)
  - Другий повертатиметься, коли запрошено список усіх користувачів, і повинен включати лише айді, ім'я користувача, та його рахунки
- Додати пагінацію на фронт-енді. Готовий приклад можна знайти [тут](https://material-ui.com/components/tables/)

#### Література:
- [Налаштування валідації DTO у Spring Framework](https://dan-it.gitlab.io/fs-book-ua/java-frameworks/dto_validation.html)
- [ModelMapper: подорож туди та назад](https://dan-it.gitlab.io/fs-book-ua/java-frameworks/model_mapper.html)
- [Lombok повертає велич Java](https://dan-it.gitlab.io/fs-book-ua/java-frameworks/lombok.html)
- [Spring Framework та робота з базами даних: Spring Data JPA](https://dan-it.gitlab.io/fs-book-ua/java-frameworks/spring_data_jpa.html)
- [Spring Data JPA: Чарівні методи](https://dan-it.gitlab.io/fs-book-ua/java-frameworks/spring_data_jpa_methods.html)
- [Сортування та пагінація](https://dan-it.gitlab.io/fs-book-ua/java-frameworks/sorting_pagination.html)
