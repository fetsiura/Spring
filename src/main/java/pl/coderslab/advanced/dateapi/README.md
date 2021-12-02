## Zadanie 1 - rozwiązywane z wykładowcą

1. Uzupełnij implementację metody klasy `AddressBook`.
```Optional<String> findNameByAddress(String phoneNumber)```
tak by dla zadanego adresu zwróciła odpowiedniego użytkownika.
2. Zachowaj istniejącą sygnaturę metody.


## Zadanie 2 - rozwiązywane z wykładowcą

1. Napisz program, który wypisze na standardowym wyjściu aktualną godzinę we wszystkich europejskich strefach czasowych
 Wykorzystaj `getAvailableZoneIds()` z klasy `ZoneId` - filtruj sprawdzając czy strefa czasowa zawiera słowo `Europe`.


## Zadanie 3

1. Uzupełnij implementację metody klasy `AddressBook`.
```public Optional<String> findAddressByName(String name) ```
tak by dla zadanego użytkownika zwróciła odpowiedni adres.
2. Zachowaj istniejącą sygnaturę metody.


## Zadanie 4

1.Skonstruuj strumień, który z listy podanej poniżej wybierze i wypisze na ekranie tylko niepuste łańcuchy.
````
List<Optional<String>> listOfOptionals = Arrays.asList(
                Optional.empty(), Optional.of("java"), Optional.empty(), Optional.of("python"), Optional.of("php"), Optional.empty(), Optional.of(""));
````


## Zadanie 5

1. Napisz metodę, która na ekranie wypisze dzień tygodnia, w który przez kolejnych dziesięć lat będzie wypadała Wigilia.
Wykorzystaj `LocalDate date = LocalDate.of(2019, Month.DECEMBER, 24);` a następnie pobieraj odpowiednie dane w pętli.


## Zadanie 6

1. Utwórz klasę **MapTime** a w niej metodę o sygnaturze:
````
public static Map<String, LocalTime> getMapTime()
````
metoda ma zwracać mapę, gdzie kluczem jest nazwa strefy czasowej, a wartością aktualna godzina w tej strefie.
 Wykorzystaj `getAvailableZoneIds()` z klasy `ZoneId`  oraz `toMap` klasy `Collectors`.


## Zadanie 7

1.  Korzystając z Date API oblicz ile miesięcy upłynęło od początku epoki Uniksa (`01.01.1970`).
