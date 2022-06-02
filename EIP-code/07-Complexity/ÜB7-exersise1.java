// Auf Blatt 3 haben wir ein Dreieck auf der Konsole ausgegeben. Bestimmen Sie die Zeitkomplexität dieses Algorithmus’. In welche O-Komplexitätsklasse fällt er? Begründen Sie Ihre Lösung mit einem Satz.


static void drawTraiangle(int sizeOfTriangle){
    for(int i = 0; i < sizeOfTriangle; i++){  // (<) * sizeOfTriangle -> O(n) && i++ -> O(n) -> O(n)+O(n) = O(n)|
        for(int j = 0; j <= i; j++){  // (<) * sizeOfTriangle -> O(n) && i++ -> O(n) -> O(n)+O(n) = O(n)   
            System.out.println("*");
        }
        System.out.println();
    }
}

// T(n)= O(n) * O(n) = O(n^2)