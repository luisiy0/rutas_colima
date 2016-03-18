package colima.ruta.com.rutascolima.db;

import android.provider.BaseColumns;

/**
 * Created by luisfer on 24/12/2015.
 */
public class DBContract {

    public static final class Municipio implements BaseColumns {
        public static final String TABLE_NAME = "Municipio";

        public static final String COLUMN_NOMBRE = "Nombre";
        public static final String COLUMN_LATITUD = "Latitud";
        public static final String COLUMN_LONGITUD = "Longitud";
    }

    public static final class Camion implements BaseColumns {
        public static final String TABLE_NAME = "Camion";

        public static final String COLUMN_NOMBRE = "Nombre";
        public static final String COLUMN_ORDEN = "Orden";

        public static final String COLUMN_FK_MUNICIPIOID = "Municipio_Id";

        public static final String COLUMN_LATITUD_CENTRAL = "Latitud"; // punto geo para poner centrado la ruta del camion en algunos casos
        public static final String COLUMN_LONGITUD_CENTRAL = "Longitud";

    }

    public static final class Ruta implements BaseColumns {
        public static final String TABLE_NAME = "Ruta";

        public static final String COLUMN_LATITUD = "Latitud";
        public static final String COLUMN_LONGITUD = "Longitud";

        public static final String COLUMN_FK_CAMIONID = "Camion_Id";

    }

    public static final class Punto implements BaseColumns {
        public static final String TABLE_NAME = "Punto";

        public static final String COLUMN_NOMBRE = "Nombre";
        public static final String COLUMN_LATITUD = "Latitud";
        public static final String COLUMN_LONGITUD = "Longitud";

        public static final String COLUMN_FK_CAMIONID = "Camion_Id";
        public static final String COLUMN_FK_PUNTO_SIGUIENTEID = "Punto_Siguiente_Id";
        public static final String COLUMN_FK_PUNTO_ANTERIORID = "Punto_Anterior_Id";

    }

    public static final class Flecha implements BaseColumns{

        public static final String TABLE_NAME = "Flecha";

        public static final String COLUMN_LATITUD_INICIO = "LatitudInicio";
        public static final String COLUMN_LONGITUD_INICIO = "LongitudInicio";

        public static final String COLUMN_LATITUD_FIN = "LatitudFin";
        public static final String COLUMN_LONGITUD_FIN = "LongitudFin";

        public static final String COLUMN_SENTIDO = "Sentido";

        public static final String COLUMN_FK_CAMIONID = "Camion_Id";

    }

    public static final class Flecha_Camion implements BaseColumns{

        public static final String TABLE_NAME = "Flecha_Camion";

    }

}
