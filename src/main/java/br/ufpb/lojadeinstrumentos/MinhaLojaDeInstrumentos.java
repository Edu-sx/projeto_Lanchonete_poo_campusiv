package br.ufpb.lojadeinstrumentos;

import java.io.IOException;
import java.util.LinkedList;

public interface MinhaLojaDeInstrumentos {
    public void cadastrarInstrumento(Instrumento instrumento) throws InstrumentoJaExisteException;
    public LinkedList<Instrumento> pesquisarInstrumentoPorNome (String nome) throws IOException;
    public void salvarInstrumentos() throws IOException;
}
