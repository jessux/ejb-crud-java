package database;

import database.Categories;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-25T17:20:37")
@StaticMetamodel(Films.class)
public class Films_ { 

    public static volatile SingularAttribute<Films, Categories> categorie;
    public static volatile SingularAttribute<Films, String> description;
    public static volatile SingularAttribute<Films, Date> date;
    public static volatile SingularAttribute<Films, String> fichier;
    public static volatile SingularAttribute<Films, Integer> idFilm;
    public static volatile SingularAttribute<Films, String> nom;

}