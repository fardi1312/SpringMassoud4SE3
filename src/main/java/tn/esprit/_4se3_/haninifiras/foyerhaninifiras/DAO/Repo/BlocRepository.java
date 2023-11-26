package tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Bloc;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Typechambre;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {


    List<Bloc> findByNomBloc(String nomB);

   Bloc findByNomBloc2(String nomBloc);
/*


    @Query("select b from Bloc b where b.nomBloc=?1") //JPQL
    List<Bloc> farachet (String nomBloc);

    @Query("select b from Bloc b where b.nomBloc=:nom")
    List<Bloc> farachet2(@Param("nom") String nomBloc);


    @Query(value="select * from bloc where nom_bloc=?1", nativeQuery = true)
    List<Bloc> farachetsql( String nomBloc);



    @Query("select b from Bloc b join  Chambre c on b.idBloc=c.bloc.idBloc where c.typeC=?1 ") //PQL
    List<Bloc> chercherblocparTypeChambre2(Typechambre type);

    @Query(value="select * from Bloc b join  Chambre c on b.idBloc=c.bloc_id_bloc where c.typeC=?1 ", nativeQuery = true) //PQL
    List<Bloc> chercherblocparTypeChambre22(Typechambre type);


    @Modifying //(insert sql seulement) , update, delete
    @Query("delete  from Bloc  where capaciteBloc=?1") //PQL
    void suppByCapacite(long capacite);


    @Modifying
    @Query(value = "delete  from bloc  where capacite_bloc=?1", nativeQuery = true)
    void suppByCapacite2(long capacite);






    List<Bloc> findByNomBlocAndCapaciteBloc(String NomBloc, int capacite);

    List<Bloc> findByNomBlocOrCapaciteBloc(String NomBloc, int capacite);

    List<Bloc> findByCapaciteBlocLessThan(int capaciteBloc);

    List<Bloc> findByCapaciteBlocGreaterThan(int capaciteBloc);

    List<Bloc> findByCapaciteBlocBetween(int min,int max);
    List<Bloc> findByNomBlocLike (String nomBloc );

    long count ( );

    long countByCapaciteBloc(int capacite);

    List<Bloc> findByChambresTypeChambre(Typechambre type);

    List<Bloc> findByChambresTypeChambreAndCapaciteBlocGreaterThan(Typechambre type, int cpacite);
 //   List<Bloc> findByChambresTypeChambreAndChambresReservationsEstValide(Typechambre type, Boolean valide);



*/


}
