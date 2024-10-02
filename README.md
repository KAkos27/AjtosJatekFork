Van 3 ajtó

1-et megjelöl a user a gombra kattintással, ezt kinyithatja, de:
- megmutat egy rosszat a másik két NEM megjelölt közül
- megkérdezi a játékost egy felugró ablakban (Jop), hogy ki szeretné-e cserélni a másik lehetséges jó ajtóra, VAGY marad az 1. választásánál

Ezután megkapja ami mögötte van

- statisztika: hányszor cserélt a user, hányszor nem
- statisztika: cseréléssel, és cserélés nélkül hányszor sikerült eltalálnia

![Kep a programrol](Ajtos_prg.png?raw=true "ProgramGUI")

Terv: (Még módosítható)
    
    - 1 label (A játék neve)
    - 3 panel:
        > 1 panel tartalma => 1 gomb, 1 kép (ajtóról), 1 label
    - 1 újra gomb
    - 4 label 
    - A három gomb közül az egyik-el lehet megkapni a nyereményt => ez mindig random
    - A program folyamatosan fut, a játék az újra gombbal folytatható
        > Ez a gomb újra példányosítaná a játékot
        > A statisztikát külön kellene tárolni a játék osztálytól, hogy ne nullázódjon minden újraindításnál

// Véletlen 2 action gombot legeneráltam, azt vagy hasznosítsd, vagy ignoráld
// A component-ek nincsenek elnevezve, ez ajánlott!