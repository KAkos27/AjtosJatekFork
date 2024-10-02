Van 3 ajtó

1-et megjelöl a user, ezt nyithatja ki, de:
    megmutatja a másik 2-t is, nem a tartalmát
    mekgérdezi a játékost, hogy szeretne-e cserélni

Ezután megkapja ami mögötte van

statisztika: hányszor cserélt a user, hányszor nem
statisztika: cseréléssel, és cserélés nélkül hányszor sikerült eltalálnia



Terv:
    
    - 1 label (A játék neve)
    - 3 panel:
        > 1 panel tartalma => 1 gomb, 1 kép (ajtóról), 1 label
    - 1 újra gomb
    - A három gomb közül az egyik-el lehet megkapni a nyereményt => ez mindig random
    - A program folyamatosan fut, a játék az újra gombbal folytatható
        > Ez a gomb újra példányosítaná a játékot
        > A statisztikát külön kellene tárolni a játék osztálytól, hogy ne nullázódjon minden újraindításnál

