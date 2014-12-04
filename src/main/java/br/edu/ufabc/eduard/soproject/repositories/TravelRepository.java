package br.edu.ufabc.eduard.soproject.repositories;

import br.edu.ufabc.eduard.soproject.entities.Voo;

import java.util.Date;
import java.util.List;

/**
 * Created by dumorango on 02/12/14.
 */
public interface TravelRepository {
   List<Voo> getVoos();
   Voo reservarVoo(Long vooId) throws Exception;
}
