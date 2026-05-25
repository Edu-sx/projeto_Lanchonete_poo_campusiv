package br.ufpb.lojadeinstrumentos;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

public class LojaDeInstrumentos implements MinhaLojaDeInstrumentos{
    private HashMap<String, Instrumento> instrumentos;

    public LojaDeInstrumentos(HashMap<String, Instrumento> map){
        this.instrumentos = map;
    }

    @Override
    public void cadastrarInstrumento(Instrumento instrumento) throws InstrumentoJaExisteException {
        if (instrumentos.get(instrumento.getId()) == null){
            throw new InstrumentoJaExisteException("Já existe este instrumento");
        }
        else {
            instrumentos.put(instrumento.getId(), instrumento);
        }
    }

    @Override
    public LinkedList<Instrumento> pesquisarInstrumentoPorNome(String nome) throws IOException {
        LinkedList<Instrumento> instrumentosPorNome = new LinkedList<>();
        for (Instrumento i: instrumentos.values()){
            if (i.getNome().contains(nome)){
                instrumentosPorNome.add(i);
            }
        }
        return instrumentosPorNome;
    }

    @Override
    public void salvarInstrumentos() throws IOException {
        //TODO
    }

    @Override
    public LinkedList<Instrumento> pesquisarInstrumentoPorCategoria(String categoria) throws IOException {
        LinkedList<Instrumento> instrumentosPorCategoria = new LinkedList<>();
        for (Instrumento i : instrumentos.values()) {
            if (i.getCategoria().equals(categoria)) {
                instrumentosPorCategoria.add(i);
            }
        }
        return instrumentosPorCategoria;
    }
}
