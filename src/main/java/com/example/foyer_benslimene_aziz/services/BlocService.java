package com.example.foyer_benslimene_aziz.services;

import com.example.foyer_benslimene_aziz.DAO.entities.Bloc;
import com.example.foyer_benslimene_aziz.DAO.repo.BlocRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service ///pour dire que c'est un beanSpring
@AllArgsConstructor

public class BlocService implements IBlocService{

    //@Autowired
    BlocRepository blocRepository; ///instance de blocrepo

    @Override
    public Bloc add(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public List<Bloc> addAll(List<Bloc> blocs) {
        return blocRepository.saveAll(blocs);
    }

    @Override
    public Bloc update(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public List<Bloc> findall() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc findById(long id) {
        //return blocRepository.findById(id).get();
        return blocRepository.findById(id).orElse(Bloc.builder()
                .id(0)
                .capaciteBloc(0)
                .build());
    }

    @Override
    public void delete(Bloc b) {
        blocRepository.delete(b);

    }

    @Override
    public void deleteById(long id) {
        blocRepository.deleteById(id);

    }

    @Override
    public List<Bloc> selectedNyNomBloc(String nomBloc) {
        return blocRepository.findByNomBloc(nomBloc);
    }


    public  List<Bloc>  findByNomBlocAndCapaciteBloc(String nomBloc, int capacite) {
        return  blocRepository.findByNomBlocAndCapaciteBloc(nomBloc,capacite);
    }

    public  List<Bloc>  findByNomBlocOrCapaciteBloc(String nomBloc, int capacite) {
        return  blocRepository.findByNomBlocAndCapaciteBloc(nomBloc,capacite);
    }

}
