package colima.ruta.com.rutascolima.db.rutas.manzanillo;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import colima.ruta.com.rutascolima.db.DBContract;

/**
 * Created by lnunez on 05/01/2016.
 */
public class Puntos {

    public static void EjidoCentral(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Ejido La Central");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.143541451475);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.43835794926);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void UdeC(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "U de C Campus El Naranjo");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.125331965702);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.40053343773);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void EjidoNaranjo(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Ejido El Naranjo");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.129444859763);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.41934242845);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ClubSantiago(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Club Santiago");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.12303980009);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.39330086112);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ComercialMexicana(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Comercial Mexicana");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.117394779065);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.35311734676);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Salahua(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Salahua");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.112784852343);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.32090133429);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void CentralNueva(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Central de Autobuses Nueva");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.08953811863);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.29097056389);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Fondeport(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "FONDEPORT");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.086706822564);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.29417580366);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Tapeixtles(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "TAPEIXTLES");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.066845833967);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.28740791976);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void SanPedrito(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "SAN PEDRITO");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.055295707765);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.30357292295);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void LasTorres(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "LAS TORRES");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.05198212317);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.27799135447);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void MaravillasCampo(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Base Col. Maravillas del Campo");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.128426148778);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.39150780439);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Miramar(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Playa Miramar");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.120451097213);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.37486201525);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void CamotlanMiraflores(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Centro de Salud Camotlan de Miraflores");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.124290421754);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.35895651579);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Santiago(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Santiago");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.119523563847);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.35537040234);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Walmart(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Tienda Walmart");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.103004488783);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.32945489883);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void CruceroBrisas(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Crucero Las Brisas");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.084671402553);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.3087670207);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void GlorietaSanPedrito(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Glorieta San Pedrito");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.055110635542);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.30479466915);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Unidad5Mayo(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Unidad Deportiva 5 de Mayo");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.091966353678);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.31552886963);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Soriana(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "SORIANA");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.102152893091);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.32717770338);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void LasJoyas(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Colonia Las Joyas");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.124432335671);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.35221612453);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void HotelGrandFestival(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Hotel Grand Festival");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.120516987363);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.37753349543);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ElJabali(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Col. El Jabalí");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.135867409096);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.35452014208);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void CruceroPezVela(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Crucero Pez Vela");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.078333050863);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.28727582097);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void LasBrisas(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "La Brisas");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.062247175106);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.30246248841);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ClinicaImss(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "CLINICA IMSS");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.043585046303);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.31910157204);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Pemex(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Pemex Refinación");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.053690896559);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.31290030479);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ValleGarzas(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Valle de las Garzas");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.08033939798);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.28867995739);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void AuditorioManuel(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Auditorio Manuel Bonilla Valle");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.087690304215);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.29506361485);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Cereso(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "CERESO");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.16504511326);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.34018373489);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ValleParaiso(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Col. Valle Paraiso");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.152115888058);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.33238387108);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void IUBAM(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "IUBAM Universidad de Colima");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.098115357433);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.30462300777);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }


    public static void EscuelaNinosHeroes(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Escuela Primaria Niños Heroes");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.053386665196);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.31164234877);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void LaNegrita(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "La Negrita");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.059159360155);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.29042875767);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void TorreManzanillo(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Torre Puerto Manzanillo");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.082392614974);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.29031610489);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void INFONAVIT(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "INFONAVIT");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.107234522648);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.312543571);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void RanchoIIIBarras(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Rancho III Barras");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.142396132483);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.33753907681);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void VistaMar(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "COLONIA VISTA DEL MAR");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.137695680386);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.34728890657);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void UnidadTuboGomez(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Uniad Deportiva Tubo Gómez");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.100822266047);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.3061491847);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Centro(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "MANZANILLO CENTRO");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.051125194578);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.31553959846);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void JardinesSantiago(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Jardines de Santiago");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.131441717795);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.34172332287);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void UTM(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "UTM");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.140092800982);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.31586146355);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void SantaCarolina(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Colonia Sta. Carolina");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.129579166962);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.33336019516);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Arboledas(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Arboledas");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.121789168961);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.33987259865);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Feria(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Feria Manzanillo");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.113927842311);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.32347893715);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void CampoVerde(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Colegio Campo Verde");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.132954549749);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.33073163033);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void CruceroValle(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Crucero del Valle");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.087335440375);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.29709404707);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }


    public static void Primaveras(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Col. Primaveras");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.094911618112);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.29764926434);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void CruceroHadas(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "CRUCERO LAS HADAS");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.113144730303);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.34195131063);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void LasHadas(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "LAS HADAS");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.101395070619);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.34879630804);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ColegioSanJon(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Colegio St. Jonh´s");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.104809046119);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.31897550821);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void CentralVieja(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Central Camionera Vieja");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.049994447709);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.3072193861);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void PuntaChica(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Punta Chica");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.047796314595);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.29899036884);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void LaTolva(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "La Tolva");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.05023783782);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.28407996893);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void PuntaGrande(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Punta Grande");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.046703575533);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.2813923955);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Termoelectrica(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Termoeléctrica");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.0250095685);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.32448744774);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Campos(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Campos");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.02696711508);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.30794090033);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }


    public static void ColoniaMiramar(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Col. Marimar");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.122341627243);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.32196885347);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }


    public static void Barrio4(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Barrio Cuatro");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.106669341641);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.30911302567);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Conalep(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Conalep");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.092161523424);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.29539084435);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Issste(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "ISSSTE");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.093003031904);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.29605603218);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Marymar(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Col. Marymar");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.123482016938);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.32048559189);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Ideco(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "INDECO");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.073363339759);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.28167402744);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Fovisste(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Fovisste");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.092541723568);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.31606531143);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Jalipa(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Jalipa");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.118575751152);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.26967918873);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void FranciscoVilla(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Francisco Villa");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.107348572393);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.2567884922);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void BasculaJalipa(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Bascula Jalipa");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.121981769306);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.26240503788);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Chandiablo(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Chandiablo");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.203315045069);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.33533430099);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ValleAlto(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Valle Alto");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.152683447333);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.33606922626);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void CruceroAudiencia(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Crucero La Audiencia");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.11299520364);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.34201300144);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void BenitoJuarez(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Benito Juárez");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.059410342334);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.28004592657);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void PanteonMunicipal(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Panteón Municipal");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.060485251615);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.2876714468);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ElParaiso(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "El Paraiso");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.058729647359);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.26302731037);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void LopezMateos(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "López Mateos");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.05561894985);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD,-104.26595494151);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void RanchoAlegre(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Rancho Alegre");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.050234034852);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.28431332111);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void ElColomo(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "El Colomo");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.056214727728);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.24612268805);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }


    public static void NuevasJuntas(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Nuevas Juntas");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.056956278055);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.218108356);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Florena(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "La Floreña");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.056446700238);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.24160182476);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Estacion(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Estación");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.049173003447);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.30433064699);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }

    public static void Colonia5Mayo(SQLiteDatabase db,int RutaId) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBContract.Punto.COLUMN_NOMBRE, "Col. Cinco de Mayo");
        contentValues.put(DBContract.Punto.COLUMN_LATITUD, 19.058026132856);
        contentValues.put(DBContract.Punto.COLUMN_LONGITUD, -104.24557685852);
        contentValues.put(DBContract.Punto.COLUMN_FK_CAMIONID, RutaId);
        db.insert(DBContract.Punto.TABLE_NAME, null, contentValues);
    }



}
