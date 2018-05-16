public enum Semaforo {
    VERMELHO,
    AMARELO,
    VERDE;

    int setSinal() {
        switch (this) {
            case VERMELHO:
                return 0;
            case AMARELO:
                return 1;
            case VERDE:
                return 2;
            default:
                break;
        }
		return 0;
    }
}