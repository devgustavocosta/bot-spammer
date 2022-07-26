public enum EnumCor {

    // Cores normais
    RESET("\u001B[0m"),
    PRETO("\033[0;30m"),
    VERMELHO("\033[0;31m"),
    VERDE("\033[0;32m"),
    AMARELO("\033[0;33m"),
    AZUL("\033[0;34m"),
    MAGENTA("\033[0;35m"),
    CIANO("\033[0;36m"),
    BRANCO("\033[0;37m"),

    // Negrito
    PRETO_NEGRITO("\033[1;30m"),
    VERMELHO_NEGRITO("\033[1;31m"),
    VERDE_NEGRITO("\033[1;32m"),
    AMARELO_NEGRITO("\033[1;33m"),
    AZUL_NEGRITO("\033[1;34m"),
    ROXO_NEGRITO("\033[1;35m"),
    CIANO_NEGRITO ("\033[1;36m"),
    BRANCO_NEGRITO("\033[1;37m"),


    // Fundo
    FUNDO_PRETO("\033[40m"),
    FUNDO_VERMELHO("\033[41m"),
    FUNDO_VERDE("\033[42m"),
    FUNDO_AMARELO("\033[43m"),
    FUNDO_AZUL("\033[44m"),
    FUNDO_ROXO("\033[45m"),
    FUNDO_CIANO("\033[46m"),
    FUNDO_BRANCO("\033[47m");

    private final String codigo;

    EnumCor(String codigo){
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return codigo;
    }
}
