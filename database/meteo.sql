CREATE TABLE  Temperature_heure (
    Temperature_heureID int,
    Temperature int,
    Heure int,
    VilleID int,
    Temps(soleil,pluie,nuageux,orageux,enneigé) varchar(255),
    

);

CREATE TABLE Ville (
    VilleID int,
    Nom varchar(255)

);



