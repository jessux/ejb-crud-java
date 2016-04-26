package database;

import database.Genre;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-25T17:20:37")
@StaticMetamodel(Musiques.class)
public class Musiques_ { 

    public static volatile SingularAttribute<Musiques, Genre> genre;
    public static volatile SingularAttribute<Musiques, Integer> idMusique;
    public static volatile SingularAttribute<Musiques, String> album;
    public static volatile SingularAttribute<Musiques, Date> date;
    public static volatile SingularAttribute<Musiques, String> fichier;
    public static volatile SingularAttribute<Musiques, String> groupe;
    public static volatile SingularAttribute<Musiques, String> titre;

}