package br.ufpb.lojadeinstrumentos;

public class InstrumentoJaExisteException extends RuntimeException {
    public InstrumentoJaExisteException(String msg) {
        super(msg);
    }
}
