package br.edu.ufabc.eduard.soproject.repositories;

import br.edu.ufabc.eduard.soproject.entities.*;

import java.util.*;

/**
 * Created by dumorango on 02/12/14.
 */
public class TravelRepositoryImpl implements TravelRepository{

    public static Map<Long, Voo> voos;

    private static TravelRepositoryImpl instance = null;
    TravelRepositoryImpl(){
        Aeroporto aeroporto_sp = new Aeroporto();
        aeroporto_sp.setName("Sao Paulo");
        Aeroporto aeroporto_natal = new Aeroporto();
        aeroporto_natal.setName("Natal");

        Partida partida = new Partida();
        partida.setAeroporto(aeroporto_sp);
        partida.setData(new Date());

        Chegada chegada = new Chegada();
        chegada.setAeroporto(aeroporto_natal);
        chegada.setData(new Date());

        Voo voo = new Voo();
        voo.setVagas(10);
        voo.setOcupadas(9);
        voo.setPartida(partida);
        voo.setChegada(chegada);
        voo.setId(1);

        voos = new HashMap<Long, Voo>();

        voos.put(voo.getId(),voo);

    }

    @Override
    public List<Voo> getVoos() {
        return new ArrayList(voos.values());
    }

    @Override
    public Voo reservarVoo(Long vooId) throws Exception {
        Voo voo = voos.get(vooId);
        if(voo.getOcupadas()<voo.getVagas()){
            voo.setOcupadas(voo.getOcupadas()+1);
            voos.put(voo.getId(),voo);
            return voo;
        }else{
            throw new NoVacancyException();
        }
    }

    public static TravelRepositoryImpl getInstance() {
        if(instance == null) {
            instance = new TravelRepositoryImpl();
        }
        return instance;
    }
}
