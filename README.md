# Shop-Management
Descriere:
Acest proiect reprezintă o aplicație Java pentru gestionarea unui magazin online. Scopul aplicației este de a oferi utilizatorilor posibilitatea de a vizualiza și achiziționa produse disponibile în stoc, de a plasa comenzi și de a gestiona conturile lor.

Funcționalități principale:
Gestionarea produselor: Utilizatorii pot vizualiza produsele disponibile în stoc, pot căuta produse după diferite criterii și pot actualiza informațiile despre produse.

Plasarea și procesarea comenzilor: Utilizatorii pot plasa comenzi pentru produsele dorite și pot monitoriza stadiul acestora. Sistemul procesează comenzile, generând facturi și actualizând stocurile.

Gestionarea utilizatorilor: Utilizatorii pot crea conturi noi, se pot autentifica și își pot actualiza datele personale. Există posibilitatea de a gestiona diferite tipuri de utilizatori, cum ar fi clienți fideli.

Generarea de rapoarte: Sistemul poate genera rapoarte despre vânzări, stocuri, comenzi etc., pentru a oferi o imagine de ansamblu asupra activității magazinului.

LISTA CLASE:
•	Product (interfata)
•	Person (superclasa pentru person)
•	Phone (extinde Product)
•	TV (extinde Product)
•	Seller (extinde Person)
•	Client (extinde Person)
•	AbstractProduct
•	AbstractShop
•	ShopService (interfata functionalitati Shop)
•	ShopServiceImpl (implementare functii Shop)
•	ProductFactory(interfata implementare Factory pt Phone si TV)
•	PhoneFactory
•	TVFactory



LISTA INTEROGARI:
•	Căutarea unui produs după numărul de serie: searchProduct
•	Obținerea unei liste cu toate produsele de la un seller : getProducts
•	Calcularea valorii totale a stocului disponibil în magazine: calculateTotalStockValue
•	Adaugare produse : addProduct
•	Functia equals, care compara 2 telefoane dupa serialNumber
•	makeProduct care face tipuri diferite de produs cu ajutorul claselor Factory
•	Cautare produs dupa serialNumber searchProduct
•	Sortare a produselor pe care le are un Seller
•	Obtinere unei liste cu toti vanzatorii getSeller
