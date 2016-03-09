package colima.ruta.com.rutascolima.db.rutas.colima;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import colima.ruta.com.rutascolima.db.DBContract;
import colima.ruta.com.rutascolima.db.DBContract.Punto;


/**
 * Created by lnunez on 04/01/2016.
 */
public class Puntos {

    public static void EcoGranja(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Punto.COLUMN_NOMBRE, "Eco Granja");
        contentValues.put(Punto.COLUMN_LATITUD, 19.27280740444);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.78224939108);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(Punto.TABLE_NAME, null, contentValues);
    }

    public static void LosRojos(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Punto.COLUMN_NOMBRE, "Central Suburbana (Los Rojos)");
        contentValues.put(Punto.COLUMN_LATITUD, 19.244151479926);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.74222278595);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(Punto.TABLE_NAME, null, contentValues);
    }

    public static void Clinica19(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Punto.COLUMN_NOMBRE, "Clínica #19 IMSS");
        contentValues.put(Punto.COLUMN_LATITUD, 19.239101927594);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.7362575531);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(Punto.TABLE_NAME, null, contentValues);
    }

    public static void GlorietaCharro(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Punto.COLUMN_NOMBRE, "Glorieta del Charro");
        contentValues.put(Punto.COLUMN_LATITUD, 19.243769096996);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.73586058617);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(Punto.TABLE_NAME, null, contentValues);
    }

    public static void GlorietaReyColiman(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Punto.COLUMN_NOMBRE, "Glorieta Rey Colimán");
        contentValues.put(Punto.COLUMN_LATITUD, 19.23033954746);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.72343122959);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(Punto.TABLE_NAME, null, contentValues);
    }

    public static void Cancerologia(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Punto.COLUMN_NOMBRE, "Hospital de Cancerología");
        contentValues.put(Punto.COLUMN_LATITUD, 19.221728660727);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.72544288635);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(Punto.TABLE_NAME, null, contentValues);
    }

    public static void GlorietaCosteno(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Punto.COLUMN_NOMBRE, "Glorieta El Costeño");
        contentValues.put(Punto.COLUMN_LATITUD, 19.215626054703);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.72223764659);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(Punto.TABLE_NAME, null, contentValues);
    }

    public static void Clinica1(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Punto.COLUMN_NOMBRE, "Clínica 1 IMSS");
        contentValues.put(Punto.COLUMN_LATITUD, 19.253075183475);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.72372627258);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(Punto.TABLE_NAME, null, contentValues);
    }

    public static void ISSSTE(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Punto.COLUMN_NOMBRE, "Clínica ISSSTE");
        contentValues.put(Punto.COLUMN_LATITUD, 19.251206411728);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.71393620968);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(Punto.TABLE_NAME, null, contentValues);
    }

    public static void UniversidadColima(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Punto.COLUMN_NOMBRE, "Universidad de Colima");
        contentValues.put(Punto.COLUMN_LATITUD, 19.248309520226);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.70005309582);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(Punto.TABLE_NAME, null, contentValues);
    }

    public static void HospitalRegional(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Punto.COLUMN_NOMBRE, "Hospital Regional Universitario");
        contentValues.put(Punto.COLUMN_LATITUD, 19.257384925496);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.69136810303);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(Punto.TABLE_NAME, null, contentValues);
    }

    public static void FacultadDerecho(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Punto.COLUMN_NOMBRE, "Facultad de Derecho");
        contentValues.put(Punto.COLUMN_LATITUD, 19.260038576352);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.6877900362);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(Punto.TABLE_NAME, null, contentValues);
    }

    public static void TecnologicoColima(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Punto.COLUMN_NOMBRE, "Instituto Tecnológico de Colima");
        contentValues.put(Punto.COLUMN_LATITUD, 19.262487088238);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.72493594885);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(Punto.TABLE_NAME, null, contentValues);
    }

    public static void GlorietaDiosaAgua(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Punto.COLUMN_NOMBRE, "Glorieta Diosa del Agua");
        contentValues.put(Punto.COLUMN_LATITUD, 19.273825221813);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.73985171318);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(Punto.TABLE_NAME, null, contentValues);
    }

    public static void Soriana(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Punto.COLUMN_NOMBRE, "Plaza Soriana");
        contentValues.put(Punto.COLUMN_LATITUD, 19.271571836549);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.7386380136);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(Punto.TABLE_NAME, null, contentValues);
    }

    public static void DifVilladealvarez(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Punto.COLUMN_NOMBRE, "DIF Villa de Álvarez");
        contentValues.put(Punto.COLUMN_LATITUD, 19.267366278478);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.73852133751);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(Punto.TABLE_NAME, null, contentValues);
    }

    public static void CasaCulturaVilla(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Punto.COLUMN_NOMBRE, "Casa de la Cultura Villa de Álvarez");
        contentValues.put(Punto.COLUMN_LATITUD, 19.266469956546);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.73895585537);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(Punto.TABLE_NAME, null, contentValues);
    }

    public static void Bachi4(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Punto.COLUMN_NOMBRE, "Bachillerato 4");
        contentValues.put(Punto.COLUMN_LATITUD, 19.265988877782);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.74163269997);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(Punto.TABLE_NAME, null, contentValues);
    }

    public static void PaloAlto(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Col. Palo Alto");
        contentValues.put(Punto.COLUMN_LATITUD, 19.273402397951);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.78186583519);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ParqueHidalgo(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Parque Hidalgo");
        contentValues.put(Punto.COLUMN_LATITUD, 19.233885075509);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.72881978759);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ParqueRegional(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Parque Regional");
        contentValues.put(Punto.COLUMN_LATITUD, 19.238453628781);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.73626828194);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void CentralForanea(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Central Camionera Foranea");
        contentValues.put(Punto.COLUMN_LATITUD, 19.232193361674);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.7044519186);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void GlorietaElefantes(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Glorieta de los Elefantes");
        contentValues.put(Punto.COLUMN_LATITUD, 19.233201301057);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.70879173279);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void NuevoMilenio(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Col. Nuevo Milenio");
        contentValues.put(Punto.COLUMN_LATITUD, 19.224494324134);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.70318055153);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void MiradorCumbre3(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Col. Mirador de la Cumbre 3");
        contentValues.put(Punto.COLUMN_LATITUD, 19.22530983138);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.69442045689);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void InfonavitEstancia(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Infonavit La Estancia");
        contentValues.put(Punto.COLUMN_LATITUD, 19.241249399124);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.70605587959);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void MariaIsabel(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Hotel María Isabel");
        contentValues.put(Punto.COLUMN_LATITUD, 19.248253810273);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.70592713356);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void EspirituSanto(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Parroquia del Espíritu Santo");
        contentValues.put(Punto.COLUMN_LATITUD, 19.252548485733);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.71195673943);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ExComercialMexicana(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Ex Comercial Mexicana");
        contentValues.put(Punto.COLUMN_LATITUD, 19.26836387396);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.7295627594);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void CasinoBurocratas(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Casino de los Burócratas");
        contentValues.put(Punto.COLUMN_LATITUD, 19.273134018167);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.74590277672);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ComplejoSeguridad(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Complejo de Seguridad de Villa de Alvarez");
        contentValues.put(Punto.COLUMN_LATITUD, 19.25829142556);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.75305891037);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void MercadoSoriana(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Mercado Soriana");
        contentValues.put(Punto.COLUMN_LATITUD, 19.243863250694);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.73680326205);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void JardinNunez(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Jardin Nuñez");
        contentValues.put(Punto.COLUMN_LATITUD, 19.239791199425);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.72392329437);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void WalmartGalvan(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Tienda Walmart");
        contentValues.put(Punto.COLUMN_LATITUD, 19.239203681202);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.71660622817);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void PiedraLisa(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Parque Piedra Lisa");
        contentValues.put(Punto.COLUMN_LATITUD, 19.240629422216);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.71537509423);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void GlorietaDif(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Glorieta del DIF");
        contentValues.put(Punto.COLUMN_LATITUD, 19.244308941717);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.71225300294);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void PanteonMunicipal(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Panteón Municipal");
        contentValues.put(Punto.COLUMN_LATITUD, 19.246294277921);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.70857301217);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void PlazaSanFernando(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Plaza San Fernando");
        contentValues.put(Punto.COLUMN_LATITUD, 19.251447430091);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.7213456915);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void JardinSanFrancisco(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Jardin San Francisco");
        contentValues.put(Punto.COLUMN_LATITUD, 19.254713963615);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.72948887807);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void TerrenosFeria(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Terrenos de la Feria");
        contentValues.put(Punto.COLUMN_LATITUD, 19.234918786439);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.68569108707);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void BancoSangre(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Banco de Sangre");
        contentValues.put(Punto.COLUMN_LATITUD, 19.231071909191);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.68584129077);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void GlorietaNinoHeroes(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Monumento a los Ninos Heroes");
        contentValues.put(Punto.COLUMN_LATITUD, 19.237542411398);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.71628972751);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void DianaCazadora(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Diana Cazadora, Monumento");
        contentValues.put(Punto.COLUMN_LATITUD, 19.254316412232);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.74461385471);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Conalep(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "CONALEP");
        contentValues.put(Punto.COLUMN_LATITUD, 19.23644333037);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.70664986831);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void TeatroHidalgo(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Teatro Hidalgo");
        contentValues.put(Punto.COLUMN_LATITUD, 19.242711032512);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.72973027689);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ManuelAlvarez(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Monumento Manuel Alvarez");
        contentValues.put(Punto.COLUMN_LATITUD, 19.261201258228);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.73264852029);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void JardinVilla(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Jardin de la Villa");
        contentValues.put(Punto.COLUMN_LATITUD, 19.265976674878);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.73519930106);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void JardinSanPablo(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Jardin San Pablo");
        contentValues.put(Punto.COLUMN_LATITUD, 19.235384761516);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.71771129829);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void PradosDelSur(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Col. Prados del Sur");
        contentValues.put(Punto.COLUMN_LATITUD, 19.235457745944);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.75192701817);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Bachi30(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Bachillerato #30 Albarrada");
        contentValues.put(Punto.COLUMN_LATITUD, 19.23318863854);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.74425321818);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ColegioFrayPedro(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Colegio Fray Pedro");
        contentValues.put(Punto.COLUMN_LATITUD, 19.235389369281);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.73141884804);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void JardinTorresQuintero(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Jardín Torres Quintero");
        contentValues.put(Punto.COLUMN_LATITUD, 19.242201570907);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.72759401798);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Sams(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Sam´s Club");
        contentValues.put(Punto.COLUMN_LATITUD, 19.25601250525);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.71701002121);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void CampoVerde(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Colegio Campoverde");
        contentValues.put(Punto.COLUMN_LATITUD, 19.263563206507);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.71882855892);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void LomasFlores(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Lomas de las Flores");
        contentValues.put(Punto.COLUMN_LATITUD, 19.279838317309);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.74095678329);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void WalmartTecnologico(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Supermercado Walmart");
        contentValues.put(Punto.COLUMN_LATITUD, 19.258843425938);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.72044324875);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Solidaridad(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Solidaridad");
        contentValues.put(Punto.COLUMN_LATITUD, 19.29390936385);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.73218059556);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void LasLagunas(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Fracc. Las Lagunas");
        contentValues.put(Punto.COLUMN_LATITUD, 19.297413013197);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.73582839966);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void LindaVista(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Fracc. Linda Vista");
        contentValues.put(Punto.COLUMN_LATITUD, 19.288501850313);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.74301671982);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void JardinVillaIzcalli(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Jardin Villa Izcalli");
        contentValues.put(Punto.COLUMN_LATITUD, 19.286972727011);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.73340368287);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Arboledas(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Arboledas del Carmen");
        contentValues.put(Punto.COLUMN_LATITUD, 19.277909087138);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.72593641281);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void PreparatoriaAnahuac(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Preparatoria Anahuac");
        contentValues.put(Punto.COLUMN_LATITUD, 19.258443352455);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.72372627258);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Isenco(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "ISENCO");
        contentValues.put(Punto.COLUMN_LATITUD, 19.254128573885);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.72526049614);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void AuditorioMiguelMadrid(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Auditorio Miguel de la Madrid");
        contentValues.put(Punto.COLUMN_LATITUD, 19.2407074691);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.73021721856);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void JardinCorregidora(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Jardín Corregidora");
        contentValues.put(Punto.COLUMN_LATITUD, 19.251292507372);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.72545361519);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void SenderosCarmen(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Senderos del Carmen");
        contentValues.put(Punto.COLUMN_LATITUD, 19.273088444198);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.73303890228);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void JardinesBugambilias(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Jardines de Bugambilias");
        contentValues.put(Punto.COLUMN_LATITUD, 19.278071123091);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.72940182682);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ExHacienda(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Ex-Hacienda del Carmen");
        contentValues.put(Punto.COLUMN_LATITUD, 19.281159902816);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.72882246971);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void VillasBugambilias(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Villas de Bugambilias");
        contentValues.put(Punto.COLUMN_LATITUD, 19.284319512295);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.72993826866);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void LomasAltas(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Terminal Lomas Altas");
        contentValues.put(Punto.COLUMN_LATITUD, 19.30105834907);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.74047935009);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Clinica18(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Clínica # 18 IMSS");
        contentValues.put(Punto.COLUMN_LATITUD, 19.262960581146);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.74080657959);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void MercadoConstitucion(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Mercado Constitución");
        contentValues.put(Punto.COLUMN_LATITUD, 19.240363064042);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.73015284538);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void LaRivera(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Colonia La Rivera");
        contentValues.put(Punto.COLUMN_LATITUD, 19.240332675327);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.74764353037);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void LaLechera(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "La Lechera");
        contentValues.put(Punto.COLUMN_LATITUD, 19.244397116173);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.74694079161);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Antorchista(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Colonia Antorchista");
        contentValues.put(Punto.COLUMN_LATITUD, 19.250122615651);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.6864811182);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Aurrera(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Centro comercial Bodega Aurrera");
        contentValues.put(Punto.COLUMN_LATITUD, 19.254270833032);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.7441954301);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Zentralia(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Centro Comercial Zentralia");
        contentValues.put(Punto.COLUMN_LATITUD, 19.265457500001);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.697184);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Esmeralda(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Residencial Esmeralda");
        contentValues.put(Punto.COLUMN_LATITUD, 19.2737986);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.714257);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void RamonSerrano(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Colonia Ramón Serrano");
        contentValues.put(Punto.COLUMN_LATITUD, 19.2554007);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.750169);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Albarrada(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "ALBARRADA");
        contentValues.put(Punto.COLUMN_LATITUD, 19.233444421497);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.74526977539);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Guadalajarita(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Jardín Guadalajarita");
        contentValues.put(Punto.COLUMN_LATITUD, 19.250998769109);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.71934890747);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void SangreCristo(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Parroquia La Sangre de Cristo");
        contentValues.put(Punto.COLUMN_LATITUD, 19.242348447977);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.72342586517);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void RanchoVilla(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Rancho de Villa");
        contentValues.put(Punto.COLUMN_LATITUD, 19.232765709921);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.76816511154);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Torreon(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "El Torreon");
        contentValues.put(Punto.COLUMN_LATITUD, 19.239360233439);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.766040802);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void LomasCentenario(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Lomas del Centenario");
        contentValues.put(Punto.COLUMN_LATITUD, 19.258524380075);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.75052690506);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Cereso(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Centro de Readaptación Social");
        contentValues.put(Punto.COLUMN_LATITUD, 19.237121569281);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.68204474449);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void GustavoVazquez(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Gustavo Vasquez Montes");
        contentValues.put(Punto.COLUMN_LATITUD, 19.219109848626);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.69904994965);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void MiradorCumbre(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Mirador de la Cumbre");
        contentValues.put(Punto.COLUMN_LATITUD, 19.227224484658);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.69416832924);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Moralete(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "El Moralete");
        contentValues.put(Punto.COLUMN_LATITUD, 19.230937227552);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.71298134327);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Tabachines(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Col. Tabachines");
        contentValues.put(Punto.COLUMN_LATITUD, 19.243168931264);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.76666307449);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void AntiguaCentral(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Antigua Central Camionera");
        contentValues.put(Punto.COLUMN_LATITUD, 19.241355759011);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.72972369194);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Volcanes(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Los Volcanes");
        contentValues.put(Punto.COLUMN_LATITUD, 19.220112802873);
        contentValues.put(Punto.COLUMN_LONGITUD, -103.71792197227);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void HotelHaciendaGobernador(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Hotel Hacienda del Gobernador");
        contentValues.put(Punto.COLUMN_LATITUD, 19.24261181343);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.7310218811);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Yaqui(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "El Yaqui");
        contentValues.put(Punto.COLUMN_LATITUD, 19.238499212375);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.76174926758);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void RanchoBlanco(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Rancho Blanco");
        contentValues.put(Punto.COLUMN_LATITUD, 19.243209448852);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.76034379006);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void RealMinas(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Colonia Real de Minas");
        contentValues.put(Punto.COLUMN_LATITUD, 19.288147419032);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.75532269478);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void GlorietaPerritos(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Glorieta de los Perritos");
        contentValues.put(Punto.COLUMN_LATITUD, 19.284177736253);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.74430954456);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void SanJoaquin(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "San Joaquín");
        contentValues.put(Punto.COLUMN_LATITUD, 19.276339355536);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.64689707756);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Trapiche(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "El Trapiche");
        contentValues.put(Punto.COLUMN_LATITUD, 19.275711458683);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.66088211536);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ComplejoAdministrativo(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Complejo Administrativo");
        contentValues.put(Punto.COLUMN_LATITUD, 19.255123717745);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.6873421073);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void MercadoObregon(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(Punto.COLUMN_NOMBRE, "Mercado Obregón");
        contentValues.put(Punto.COLUMN_LATITUD, 19.240656821342);
        contentValues.put(Punto.COLUMN_LONGITUD,-103.72133910656);
        contentValues.put(Punto.COLUMN_FK_CAMIONID, RutaId);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_SIGUIENTEID, RutaIA);
        //contentValues.put(Punto.COLUMN_FK_PUNTO_ANTERIORID, RutaIA);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }


}
