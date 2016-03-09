package colima.ruta.com.rutascolima.db.rutas.tecoman;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import colima.ruta.com.rutascolima.db.DBContract;

/**
 * Created by lnunez on 06/01/2016.
 */
public class Puntos {

    public static void JuntaMunicipal(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Junta Municipal de Caleras");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.912935256884);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.87255802751);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void UnidadNorte(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Unidad Deportiva Norte");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.926582753349);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.88218045235);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }


    public static void ColoniaMiguelHidalgo(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Col. Miguel Hidalgo");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.931926001237);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.88516575098);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ClubCosmos(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Club Deportivo Cosmos");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.922949450161);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.88471782207);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ColoniaReyesHeroles(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Col. Reyes Heroles");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.919445470524);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.88477414846);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ColoniaVicenteGuerrero(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Col. Vicente Guerrero");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.916415902494);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.88480097055);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void CruzRoja(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Cruz Roja");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.919338903736);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.87555539608);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void PanteonRecuerdo(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Panteón del Recuerdo");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.909521781379);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.86952310801);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ColoniaVillaSol(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Colonia Villas del Sol");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.893088420572);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.87309849262);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ColoniaLlanoSanJose(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Colonia Llanos de San José");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.889883270417);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.88010174036);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }


    public static void UnidadSur(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Unidad Deportiva Sur");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.899457935083);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.87573778629);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ParqueSanAntonio(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Parque San Antonio");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.901404268255);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.87409895659);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Fatima(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Fatima");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.915794250674);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.88130068779);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void PanteonDolores(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Panteón Dolores");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.913561359772);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.88658463955);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void PalmaReal(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Palma Real");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.926194562015);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.89271482825);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Aurrera(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Bodega Aurrera");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.923904722236);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.88300120831);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void HospitalGeneral(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Hospital General");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.907857837472);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.88482712209);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ParqueFlores(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Parque de las Flores");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.897852891024);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.89159098268);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void LaUnion(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "La Union");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.915460587622);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.88235747814);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }


    public static void ComplejoSeguridad(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Complejo de Seguridad");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.915397787847);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.86363968253);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Floresta(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "La Floresta");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.91440948122);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.86619850993);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Tepeyac(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Tepeyac");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.924261203511);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.8802921772);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void LasFlores(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Las Flores");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.922992583414);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.88949751854);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void SantaElena(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Santa Elena");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.913508074511);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.88977110386);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void SanIsidro(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "San Isidro");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.915290584138);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.8691046834);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Chamizal(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Chamizal");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.916461574782);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.8611599803);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void CorreosMexico(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Correos de México");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.916930983679);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.87332379818);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void PrimaveraReal(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Primavera del Real");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.897590245985);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.88419479132);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void FarmaciaGuadalajara(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Farmacia Guadalajara");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.903335353501);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.87305557728);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void CofradiaJuarez(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Cofradía de Juárez");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.926617005482);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.87336269021);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ElbaCecilia(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Elba Cecilia");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.939189601156);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.88989180326);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void HospitalCivil(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Hospital Civil");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.918806068777);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.87310117483);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void VillasCentenario(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Villas Centenario");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.897316181157);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.87841597199);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Sedena(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "SEDENA Batallón de Infantería");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 18.902449746872);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-103.89090165496);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }




}
