# Shop-Management
## Descriere:

Acest proiect reprezintă o aplicație Java pentru gestionarea unui magazin online. Scopul aplicației este de a oferi utilizatorilor posibilitatea de a vizualiza și achiziționa produse disponibile în stoc, de a plasa comenzi și de a gestiona conturile lor.

### Funcționalități principale:

- **Gestionarea produselor:** Utilizatorii pot vizualiza produsele disponibile în stoc, pot căuta produse după diferite criterii și pot actualiza informațiile despre produse.
  
- **Plasarea și procesarea comenzilor:** Utilizatorii pot plasa comenzi pentru produsele dorite și pot monitoriza stadiul acestora. Sistemul procesează comenzile, generând facturi și actualizând stocurile.
  
- **Gestionarea utilizatorilor:** Utilizatorii pot crea conturi noi, se pot autentifica și își pot actualiza datele personale. Există posibilitatea de a gestiona diferite tipuri de utilizatori, cum ar fi clienți fideli.
  
- **Generarea de rapoarte:** Sistemul poate genera rapoarte despre vânzări, stocuri, comenzi etc., pentru a oferi o imagine de ansamblu asupra activității magazinului.

### Lista clase:

- Product (interfață)
- Person (superclasă pentru persoane)
- Phone (extinde Product)
- TV (extinde Product)
- Seller (extinde Person)
- Client (extinde Person)
- AbstractProduct
- AbstractShop
- ShopService (interfață funcționalități magazin)
- ShopServiceImpl (implementare funcții magazin)
- ProductFactory (interfață implementare Factory pentru Phone și TV)
- PhoneFactory
- TVFactory

### Lista interogări:

- Căutarea unui produs după numărul de serie: searchProduct
- Obținerea unei liste cu toate produsele de la un seller: getProducts
- Calcularea valorii totale a stocului disponibil în magazine: calculateTotalStockValue
- Adăugare produse: addProduct
- Funcția equals, care compară 2 telefoane după serialNumber
- makeProduct care face tipuri diferite de produs cu ajutorul claselor Factory
- Căutare produs după serialNumber: searchProduct
- Sortare a produselor pe care le are un Seller
- Obținere unei liste cu toți vânzătorii: getSeller

