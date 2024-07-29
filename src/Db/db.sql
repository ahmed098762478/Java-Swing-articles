-- Création de la table Users
CREATE TABLE Users (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Email VARCHAR(255) NOT NULL,
    Password VARCHAR(255) NOT NULL
);

-- Création de la table customer
CREATE TABLE customer (
    ClientID INT AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(255) NOT NULL,
    LastName VARCHAR(255) NOT NULL,
    Address VARCHAR(255),
    City VARCHAR(255),
    Country VARCHAR(255),
    PhoneNumber VARCHAR(20)
);

-- Création de la table Product
CREATE TABLE Product (
    ProductID VARCHAR(50) PRIMARY KEY,
    ArticleName VARCHAR(255),
    StockQuantity INT,
    UnitPrice DECIMAL(10, 2)
);

-- Création de la table Fournisseurs
CREATE TABLE Fournisseurs (
    FournisseurID INT AUTO_INCREMENT PRIMARY KEY,
    SupplierName VARCHAR(255),
    SupplierCode VARCHAR(50),
    Address VARCHAR(255),
    City VARCHAR(255)
);

-- Création de la table DistributionCompany
CREATE TABLE DistributionCompany (
    DistributionCompanyID INT AUTO_INCREMENT PRIMARY KEY,
    CompanyName VARCHAR(255),
    CompanyPhone VARCHAR(50),
    CompanyStreet VARCHAR(255),
    CompanyCity VARCHAR(255),
    CompanyAddress VARCHAR(255),
    FournisseurID INT,
    FOREIGN KEY (FournisseurID) REFERENCES Fournisseurs(FournisseurID)
);

-- Création de la table Livraisons
CREATE TABLE Livraisons (
    LivraisonID INT AUTO_INCREMENT PRIMARY KEY,
    DeliveredQuantity INT NOT NULL,
    DeliveryDate DATE NOT NULL,
    FournisseurID INT,
    ProductID VARCHAR(50),
    FOREIGN KEY (FournisseurID) REFERENCES Fournisseurs(FournisseurID),
    FOREIGN KEY (ProductID) REFERENCES Product(ProductID)
);

-- Création de la table ordre (ou Commandes)
CREATE TABLE ordre (
    CommandeID INT AUTO_INCREMENT PRIMARY KEY,
    quantite_commandee INT NOT NULL,
    numero_depot VARCHAR(50),
    code_depot VARCHAR(50),
    ville_depot VARCHAR(100),
    numero_telephone_depot VARCHAR(20),
    ClientID INT,
    ProductID VARCHAR(50),
    TotalPrice DECIMAL(10, 2),
    FOREIGN KEY (ClientID) REFERENCES customer(ClientID),
    FOREIGN KEY (ProductID) REFERENCES Product(ProductID)
);
