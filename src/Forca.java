public class Forca<palavraSecretas> {

    String palavraSecreta;
    String dica;
    char[] letrasChutadasCertas;
    char[] letrasChutadasErradas = new char[6];
    char[] palavraSecretas;
    int contadorVitoria = 0;
    int contadorErros = 0;
    int vidasRestantes = 6;


    public Forca(String dica, String palavraSecreta) {
        this.palavraSecreta = palavraSecreta;
        this.dica = dica;
        letrasChutadasCertas = new char[palavraSecreta.length()];
        palavraSecretas = palavraSecreta.toCharArray();
    }

    void chutarLetra(Character letraChutada) {
        String comparador = String.valueOf(letraChutada);
        if (palavraSecreta.contains(comparador)) {
            System.out.println("Você acertou!");
            salvarNoVetor(letraChutada);
            buscarEstado();
        }else {
                vidasRestantes--;
                contadorErros++;
                letrasChutadasErradas[contadorErros] = letraChutada;
                System.out.println("Você errou! Vidas restantes: " + vidasRestantes);
                buscarEstado();
            }
        }

    void salvarNoVetor(Character letraChutada) {
        for (int i = 0; i < palavraSecretas.length; i++) {
            if (String.valueOf(letraChutada).equalsIgnoreCase(String.valueOf(palavraSecretas[i]))) {
                contadorVitoria++;
                letrasChutadasCertas[i] = letraChutada;
                System.out.println(letrasChutadasCertas);
            }
        }
    }

    void buscarEstado() {
        if (vidasRestantes == 0) {
            System.out.println("Perdeu!");
        } else if (contadorVitoria == palavraSecretas.length) {
            System.out.println("Ganhou!!! ;) ");
        } else {
            System.out.println("Aguardando chute...");
        }

    }
}
