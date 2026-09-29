from app import convertir


def test_conversion():
    resultat = convertir(10, 1.17)

    assert resultat == 11.7