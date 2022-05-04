
# Rapport

**Skriv din rapport här!**

_Du kan ta bort all text som finns sedan tidigare_.

## Följande grundsyn gäller dugga-svar:

Först så lades log.d till för on start, stop ect. sedan så skapdes en login screen med text, ruta 
för att skriva namn och en knapp. Sedan så skapas klick hanterare genom att för skapa en knapp 
variable private Button signin;, och sedan så görs en findviewbyid på signin så man kan göra en
setonclick som fungerar. För att koppla knappen till MainActivity 2 så skapades intent.
Sedan så skapades en "go Back button" för att gå från Main activity 2 till Main activity 1 genom
att sätta intent på knappen att den ska stänga av aktivitenten(finish) som är aktivt. efter det så
lades text till för att få fram ett användarnamn, detta är gjort genom att skapa en edit text
variable och som tidigare så använder man findbyviewid för att koppla den till text rutan, och
för att testa att det fungera så loggades den med en +name.getText().toString(). När det fungerar så
skapas en intent.putExtra med get text funktionen och ger taggen ett id för att kunna skicka den 
till main activity2, sedan så lades det till i main activity 2 en intent funktion för att hämta
namnet och String name = extras.getString("name"); är slut funktionen som definerar id:et vi vill
hämta. 

```
function errorCallback(error) {
    switch(error.code) {
        case error.PERMISSION_DENIED:
            // Geolocation API stöds inte, gör något
            break;
        case error.POSITION_UNAVAILABLE:
            // Misslyckat positionsanrop, gör något
            break;
        case error.UNKNOWN_ERROR:
            // Okänt fel, gör något
            break;
    }
}
```

Bilder läggs i samma mapp som markdown-filen.

![](android.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
