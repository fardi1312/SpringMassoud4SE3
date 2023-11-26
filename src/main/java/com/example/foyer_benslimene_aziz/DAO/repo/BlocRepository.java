package com.example.foyer_benslimene_aziz.DAO.repo;

import com.example.foyer_benslimene_aziz.DAO.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {



//////////////select * from bloc where nombloc///////////
    List<Bloc> findByNomBloc(String nomBloc );
   //OR -> // Bloc getByNomBloc(String nomBloc);
//////////////select * from bloc where nombloc and capa///////////

    List<Bloc> findByNomBlocAndCapaciteBloc(String nomBloc, int capacite);
//////////////select * from bloc where nombloc or capa///////////

    List<Bloc> findByNomBlocOrCapaciteBloc(String nomBloc, int capacite);

//////////////select * from bloc where capa///////////

    List<Bloc> findByCapaciteBloc( int capacite);


    List<Bloc> findByCapaciteBlocGreaterThan( int capacite);
    List<Bloc> findByCapaciteBlocBetween( int max, int min);
    List<Bloc> findByCapaciteBlocLike( int capacite);



    List<Bloc> findByNomBlocLike( String nomBloc);
    List<Bloc> findByNomBlocContaining( String nomBloc);



    ///////////////select count(*)/////////////////
    @Override
    long count();
    /////////////select count(*) from Bloc where capa /////////////////
    long countByCapaciteBloc(int capacite);
    ///////////// in sql : select  b   from   Bloc b JOIN chambre c ON b.idBloc=c.(FK) where c.typeChambre=...//////

   // List<Bloc> getByChamTypeChambre(TypeChambre type);

    ///////////// in sql : select  b   from   Bloc b JOIN chambre c ON b.idBloc=c.(FK) where c.typeChambre=...///And capacite///

  // List<Bloc> getByChamChambreAndBlocGreaterThan(TypeChambre type, int capacite);

//bech njib les blocs eli  type ta3hom y3adi on para ou 3andhom reservation ta3 de chambre valide
    // w 3andhom des resevations mta3 des chambres el status mte3hom met3addi en paraetre

    // List<Bloc> getByChamChambreAndTypeChambreAndChamReservationEstValide(TypeChambre type, boolean bool);




}
