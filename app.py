def convertir(montant, taux):
    return montant * taux


if __name__ == "__main__":
    montant = float(input("Montant en EUR : "))
    taux = 1.17

    resultat = convertir(montant, taux)

    print(f"{montant} EUR = {resultat:.2f} USD")