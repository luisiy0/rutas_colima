package colima.ruta.com.rutascolima.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.HashMap;

import colima.ruta.com.rutascolima.db.DBContract.Camion;
import colima.ruta.com.rutascolima.db.DBContract.Municipio;
import colima.ruta.com.rutascolima.db.DBContract.Ruta;
import colima.ruta.com.rutascolima.db.DBContract.Punto;
import colima.ruta.com.rutascolima.db.DBContract.Flecha;
import colima.ruta.com.rutascolima.db.rutas.colima.IncluyenteA;
import colima.ruta.com.rutascolima.db.rutas.colima.IncluyenteB;
import colima.ruta.com.rutascolima.db.rutas.colima.Ruta1;
import colima.ruta.com.rutascolima.db.rutas.colima.Ruta10;
import colima.ruta.com.rutascolima.db.rutas.colima.Ruta11;
import colima.ruta.com.rutascolima.db.rutas.colima.Ruta13;
import colima.ruta.com.rutascolima.db.rutas.colima.Ruta13A;
import colima.ruta.com.rutascolima.db.rutas.colima.Ruta14;
import colima.ruta.com.rutascolima.db.rutas.colima.Ruta17;
import colima.ruta.com.rutascolima.db.rutas.colima.Ruta19;
import colima.ruta.com.rutascolima.db.rutas.colima.Ruta20;
import colima.ruta.com.rutascolima.db.rutas.colima.Ruta21;
import colima.ruta.com.rutascolima.db.rutas.colima.Ruta22;
import colima.ruta.com.rutascolima.db.rutas.colima.Ruta24;
import colima.ruta.com.rutascolima.db.rutas.colima.Ruta24A;
import colima.ruta.com.rutascolima.db.rutas.colima.Ruta27A;
import colima.ruta.com.rutascolima.db.rutas.colima.Ruta28;
import colima.ruta.com.rutascolima.db.rutas.colima.Ruta29;
import colima.ruta.com.rutascolima.db.rutas.colima.Ruta3;
import colima.ruta.com.rutascolima.db.rutas.colima.Ruta4;
import colima.ruta.com.rutascolima.db.rutas.colima.Ruta5;
import colima.ruta.com.rutascolima.db.rutas.colima.Ruta7;
import colima.ruta.com.rutascolima.db.rutas.colima.Ruta9;
import colima.ruta.com.rutascolima.db.rutas.colima.Ruta9A;
import colima.ruta.com.rutascolima.db.rutas.colima.Sanjoaquin;
import colima.ruta.com.rutascolima.db.rutas.colima.Sanjoaquin2;
import colima.ruta.com.rutascolima.db.rutas.manzanillo.Ruta10A;
import colima.ruta.com.rutascolima.db.rutas.manzanillo.Ruta12;
import colima.ruta.com.rutascolima.db.rutas.manzanillo.Ruta15;
import colima.ruta.com.rutascolima.db.rutas.manzanillo.Ruta2;
import colima.ruta.com.rutascolima.db.rutas.manzanillo.Ruta6;
import colima.ruta.com.rutascolima.db.rutas.manzanillo.Ruta7A;
import colima.ruta.com.rutascolima.db.rutas.manzanillo.Ruta8;
import colima.ruta.com.rutascolima.utils.Utils;



/**
 * Created by luisfer on 24/12/2015.
 */
public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "DBCamiones.db";
    public static final int VERSION = 309;

    private int ColimaId,ManzanilloId,TecomanId;

    public DBHelper(Context context)
    {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        final String SQL_CREATE_MUNICIPIO = "create table " + Municipio.TABLE_NAME + " ( " +
                Municipio._ID + " integer primary key, " +
                Municipio.COLUMN_NOMBRE + " text NOT NULL , " +
                Municipio.COLUMN_LATITUD + " REAL NOT NULL, "+
                Municipio.COLUMN_LONGITUD +" REAL NOT NULL ); "
                ;

        final String SQL_CREATE_CAMION = "create table " + Camion.TABLE_NAME + " ( " +
                Camion._ID + " integer primary key, " +
                Camion.COLUMN_NOMBRE + " text NOT NULL , " +
                Camion.COLUMN_ORDEN + " integer NOT NULL, "+
                Camion.COLUMN_FK_MUNICIPIOID +" integer NOT NULL , " +
                Camion.COLUMN_LATITUD_CENTRAL + " REAL NULL, "+
                Camion.COLUMN_LONGITUD_CENTRAL + " REAL NULL, "+
                " FOREIGN KEY (" + Camion.COLUMN_FK_MUNICIPIOID + ") REFERENCES " +
                Municipio.TABLE_NAME + " (" + Municipio._ID + " ) ); "
                ;

        final String SQL_CREATE_RUTA = "create table " + Ruta.TABLE_NAME + " ( " +
                Ruta._ID + " integer primary key, " +
                Ruta.COLUMN_LATITUD + " real NOT NULL , " +
                Ruta.COLUMN_LONGITUD + " real NOT NULL, "+
                Ruta.COLUMN_FK_CAMIONID +" integer NOT NULL , " +
                " FOREIGN KEY (" + Ruta.COLUMN_FK_CAMIONID + ") REFERENCES " +
                Camion.TABLE_NAME + " (" + Camion._ID + " ) ); "
                ;

        final String SQL_CREATE_PUNTO = "create table " + Punto.TABLE_NAME + " ( " +
                Punto._ID + " integer primary key, " +
                Punto.COLUMN_NOMBRE + " text NOT NULL , " +
                Punto.COLUMN_LATITUD + " real NOT NULL , " +
                Punto.COLUMN_LONGITUD + " real NOT NULL, "+
                Punto.COLUMN_FK_CAMIONID +" integer NOT NULL , " +
                Punto.COLUMN_FK_PUNTO_SIGUIENTEID + " integer NULL , " +
                Punto.COLUMN_FK_PUNTO_ANTERIORID + " integer NULL , " +
                " FOREIGN KEY (" + Punto.COLUMN_FK_CAMIONID + ") REFERENCES " +
                Camion.TABLE_NAME + " (" + Camion._ID + " ) , " +
                " FOREIGN KEY (" + Punto.COLUMN_FK_PUNTO_SIGUIENTEID + ") REFERENCES " +
                Punto.TABLE_NAME + " (" + Punto._ID + " ) , " +
                " FOREIGN KEY (" + Punto.COLUMN_FK_PUNTO_ANTERIORID + ") REFERENCES " +
                Punto.TABLE_NAME + " (" + Punto._ID + " ) ); "
                ;

        final String SQL_CREATE_FLECHA = "create table " + Flecha.TABLE_NAME + " ( " +
                Flecha._ID + " integer primary key, " +
                Flecha.COLUMN_LATITUD_INICIO + " real NOT NULL , " +
                Flecha.COLUMN_LONGITUD_INICIO + " real NOT NULL , " +
                Flecha.COLUMN_LATITUD_FIN + " real NOT NULL , " +
                Flecha.COLUMN_LONGITUD_FIN + " real NOT NULL, " +
                Flecha.COLUMN_FK_CAMIONID + " integer NOT NULL, " +
                Flecha.COLUMN_SENTIDO + " integer NOT NULL, " +
                " FOREIGN KEY (" + Flecha.COLUMN_FK_CAMIONID + ") REFERENCES " +
                Camion.TABLE_NAME + " (" + Camion._ID + " ) ); " ;

        // TODO Auto-generated method stub
        db.execSQL(SQL_CREATE_MUNICIPIO);
        db.execSQL(SQL_CREATE_CAMION);
        db.execSQL(SQL_CREATE_RUTA);
        db.execSQL(SQL_CREATE_PUNTO);
        db.execSQL(SQL_CREATE_FLECHA);

        Municipios(db);
        Camiones(db);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS " + Municipio.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + Camion.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + Ruta.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + Punto.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + DBContract.Flecha_Camion.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + Flecha.TABLE_NAME);
        onCreate(db);
    }

    private void Municipios(SQLiteDatabase db){

        ContentValues contentValues = new ContentValues();

        contentValues.put(Municipio.COLUMN_NOMBRE, Utils.COLIMA);
        contentValues.put(Municipio.COLUMN_LATITUD, 19.2440294);
        contentValues.put(Municipio.COLUMN_LONGITUD, -103.7317675);
        ColimaId = (int) db.insert(Municipio.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Municipio.COLUMN_NOMBRE, Utils.TECOMAN);
        contentValues.put(Municipio.COLUMN_LATITUD, 18.9173527);
        contentValues.put(Municipio.COLUMN_LONGITUD, -103.8780508);
        TecomanId  = (int) db.insert(Municipio.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Municipio.COLUMN_NOMBRE, Utils.MANZANILLO);
        contentValues.put(Municipio.COLUMN_LATITUD, 19.1096192);
        contentValues.put(Municipio.COLUMN_LONGITUD, -104.3498862);
        ManzanilloId = (int) db.insert(Municipio.TABLE_NAME, null, contentValues);

    }

    private void Camiones(SQLiteDatabase db){
        //colima

        long CamionId;

        ContentValues contentValues = new ContentValues();

        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA1);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 1);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        // dibuja las lineas
        Ruta1.Ruta1(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA3);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 2);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        // dibuja las lineas
        Ruta3.Ruta3(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA4);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 3);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta4.Ruta4(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA5);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 4);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta5.Ruta5(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA7);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 5);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta7.Ruta7(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA9);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 6);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta9.Ruta9(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA9A);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 7);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta9A.Ruta9A(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA10);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 8);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta10.Ruta10(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA11);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 9);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta11.Ruta11(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA13);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 10);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta13.Ruta13(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA13A);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 11);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta13A.Ruta13A(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA14);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 12);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta14.Ruta14(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA15);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 13);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        colima.ruta.com.rutascolima.db.rutas.colima.Ruta15.Ruta15(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA17);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 14);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta17.Ruta17(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA19);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 15);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta19.Ruta19(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA20);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 16);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta20.Ruta20(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA21);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 17);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta21.Ruta21(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA22);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 18);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta22.Ruta22(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA24);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 19);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta24.Ruta24(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA24A);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 20);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta24A.Ruta24A(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA27A);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 21);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta27A.Ruta27A(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA28);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 22);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta28.Ruta28(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA29);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 23);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta29.Ruta29(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.INCLUYENTEA);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 24);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        IncluyenteA.IncluyenteA(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.INCLUYENTEB);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 25);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        IncluyenteB.IncluyenteB(db, (int) CamionId);
		
		contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.SANJOAQUIN);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 26);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Sanjoaquin.Sanjoaquin(db, (int) CamionId);
		
		contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.SANJOAQUIN2);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ColimaId);
        contentValues.put(Camion.COLUMN_ORDEN, 27);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Sanjoaquin2.Sanjoaquin2(db, (int) CamionId);

        //MANzanillo

		contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA1);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ManzanilloId);
        contentValues.put(Camion.COLUMN_ORDEN, 1);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);

        colima.ruta.com.rutascolima.db.rutas.manzanillo.Ruta1.Ruta1(db, (int) CamionId);
		
        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA2);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ManzanilloId);
        contentValues.put(Camion.COLUMN_ORDEN, 2);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta2.Ruta2(db, (int) CamionId);
		
		contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA3);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ManzanilloId);
        contentValues.put(Camion.COLUMN_ORDEN, 3);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        colima.ruta.com.rutascolima.db.rutas.manzanillo.Ruta3.Ruta3(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA4);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ManzanilloId);
        contentValues.put(Camion.COLUMN_ORDEN, 4);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        colima.ruta.com.rutascolima.db.rutas.manzanillo.Ruta4.Ruta4(db, (int) CamionId);


		contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA5);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ManzanilloId);
        contentValues.put(Camion.COLUMN_ORDEN, 5);
        //punto central
        contentValues.put(Camion.COLUMN_LATITUD_CENTRAL, 19.056501);
        contentValues.put(Camion.COLUMN_LONGITUD_CENTRAL, -104.293562);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        colima.ruta.com.rutascolima.db.rutas.manzanillo.Ruta5.Ruta5(db, (int) CamionId);
		
		contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA6);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ManzanilloId);
        contentValues.put(Camion.COLUMN_ORDEN, 6);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta6.Ruta6(db, (int) CamionId);
		
		contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA7);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ManzanilloId);
        contentValues.put(Camion.COLUMN_ORDEN, 7);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        colima.ruta.com.rutascolima.db.rutas.manzanillo.Ruta7.Ruta7(db, (int) CamionId);
		
		contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA7A);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ManzanilloId);
        contentValues.put(Camion.COLUMN_ORDEN, 8);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta7A.Ruta7A(db, (int) CamionId);
		
		contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA8);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ManzanilloId);
        contentValues.put(Camion.COLUMN_ORDEN, 9);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta8.Ruta8(db, (int) CamionId);
		
		contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA9);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ManzanilloId);
        contentValues.put(Camion.COLUMN_ORDEN, 10);
        //punto central
        contentValues.put(Camion.COLUMN_LATITUD_CENTRAL, 19.036544);
        contentValues.put(Camion.COLUMN_LONGITUD_CENTRAL, -104.291709);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        colima.ruta.com.rutascolima.db.rutas.manzanillo.Ruta9.Ruta9(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA10);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ManzanilloId);
        contentValues.put(Camion.COLUMN_ORDEN, 11);
        //punto central
        contentValues.put(Camion.COLUMN_LATITUD_CENTRAL, 19.072107);
        contentValues.put(Camion.COLUMN_LONGITUD_CENTRAL,-104.293176);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        colima.ruta.com.rutascolima.db.rutas.manzanillo.Ruta10.Ruta10(db, (int) CamionId);
		
		contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA10A);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ManzanilloId);
        contentValues.put(Camion.COLUMN_ORDEN, 12);
        //punto central
        contentValues.put(Camion.COLUMN_LATITUD_CENTRAL, 19.072107);
        contentValues.put(Camion.COLUMN_LONGITUD_CENTRAL,-104.293176);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta10A.Ruta10A(db, (int) CamionId);
		
		contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA11);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ManzanilloId);
        contentValues.put(Camion.COLUMN_ORDEN, 13);
        //punto central
        contentValues.put(Camion.COLUMN_LATITUD_CENTRAL, 19.072107);
        contentValues.put(Camion.COLUMN_LONGITUD_CENTRAL,-104.293176);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        colima.ruta.com.rutascolima.db.rutas.manzanillo.Ruta11.Ruta11(db, (int) CamionId);
		
		contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA12);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ManzanilloId);
        contentValues.put(Camion.COLUMN_ORDEN, 14);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta12.Ruta12(db, (int) CamionId);
		
		contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA13);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ManzanilloId);
        contentValues.put(Camion.COLUMN_ORDEN, 15);
        //punto central
        contentValues.put(Camion.COLUMN_LATITUD_CENTRAL, 19.072107);
        contentValues.put(Camion.COLUMN_LONGITUD_CENTRAL,-104.293176);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        colima.ruta.com.rutascolima.db.rutas.manzanillo.Ruta13.Ruta13(db, (int) CamionId);
		
		contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA14);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ManzanilloId);
        contentValues.put(Camion.COLUMN_ORDEN, 16);
        //punto central
        contentValues.put(Camion.COLUMN_LATITUD_CENTRAL, 19.072107);
        contentValues.put(Camion.COLUMN_LONGITUD_CENTRAL,-104.293176);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        colima.ruta.com.rutascolima.db.rutas.manzanillo.Ruta14.Ruta14(db, (int) CamionId);
		
		contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA15);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, ManzanilloId);
        contentValues.put(Camion.COLUMN_ORDEN, 17);
        //punto central
        contentValues.put(Camion.COLUMN_LATITUD_CENTRAL, 19.072107);
        contentValues.put(Camion.COLUMN_LONGITUD_CENTRAL,-104.293176);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        Ruta15.Ruta15(db,  (int) CamionId);


        //Tecoman



        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA1);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, TecomanId);
        contentValues.put(Camion.COLUMN_ORDEN, 1);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        colima.ruta.com.rutascolima.db.rutas.tecoman.Ruta1.Ruta1(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA2);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, TecomanId);
        contentValues.put(Camion.COLUMN_ORDEN, 2);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        colima.ruta.com.rutascolima.db.rutas.tecoman.Ruta2.Ruta2(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA3);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, TecomanId);
        contentValues.put(Camion.COLUMN_ORDEN, 3);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        colima.ruta.com.rutascolima.db.rutas.tecoman.Ruta3.Ruta3(db, (int) CamionId);

        contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA4);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, TecomanId);
        contentValues.put(Camion.COLUMN_ORDEN, 4);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        colima.ruta.com.rutascolima.db.rutas.tecoman.Ruta4.Ruta4(db, (int) CamionId);
		
		contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA5);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, TecomanId);
        contentValues.put(Camion.COLUMN_ORDEN, 5);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        colima.ruta.com.rutascolima.db.rutas.tecoman.Ruta5.Ruta5(db, (int) CamionId);
		
		contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA7);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, TecomanId);
        contentValues.put(Camion.COLUMN_ORDEN, 6);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        colima.ruta.com.rutascolima.db.rutas.tecoman.Ruta7.Ruta7(db, (int) CamionId);
		
		contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA8);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, TecomanId);
        contentValues.put(Camion.COLUMN_ORDEN, 7);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        colima.ruta.com.rutascolima.db.rutas.tecoman.Ruta8.Ruta8(db, (int) CamionId);
		
		contentValues = new ContentValues();
        contentValues.put(Camion.COLUMN_NOMBRE, Utils.RUTA9);
        contentValues.put(Camion.COLUMN_FK_MUNICIPIOID, TecomanId);
        contentValues.put(Camion.COLUMN_ORDEN, 8);
        CamionId = db.insert(Camion.TABLE_NAME, null, contentValues);
        colima.ruta.com.rutascolima.db.rutas.tecoman.Ruta9.Ruta9(db, (int) CamionId);

    }
 

	
	
    public ArrayList<String> Camiones(String MunicipioS){
        ArrayList<String> array_list = new ArrayList<String>();
        SQLiteDatabase db = this.getReadableDatabase();
        String query= "select " +  Camion.TABLE_NAME + "." + Camion.COLUMN_NOMBRE +" from " + Camion.TABLE_NAME +
                " inner join " + Municipio.TABLE_NAME + " on " + Camion.TABLE_NAME + "." + Camion.COLUMN_FK_MUNICIPIOID
                + " = " + Municipio.TABLE_NAME + "." + Municipio._ID + " where " + Municipio.TABLE_NAME + "." +
                Municipio.COLUMN_NOMBRE + " = '" + MunicipioS + "' order by " +  Camion.TABLE_NAME + "." + Camion.COLUMN_ORDEN;
        Cursor res =  db.rawQuery(query, null);

        res.moveToFirst();
        while(res.isAfterLast() == false){
            array_list.add(res.getString(res.getColumnIndex(Camion.COLUMN_NOMBRE)));
            res.moveToNext();
        }

        return array_list;
    }

    public ArrayList<String> Municipios(){
        ArrayList<String> array_list = new ArrayList<String>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery("select " + Municipio.COLUMN_NOMBRE +" from " + Municipio.TABLE_NAME +
                " order by " + Municipio.COLUMN_NOMBRE , null);

        res.moveToFirst();
        while(res.isAfterLast() == false){
            array_list.add(res.getString(res.getColumnIndex(Municipio.COLUMN_NOMBRE)));
            res.moveToNext();
        }

        return array_list;
    }

    public ArrayList<HashMap<String, Double>> TrazosRuta(String Nombre, String MunicipioNombre){

        ArrayList<HashMap<String, Double>> Trazos = new ArrayList<>();

        SQLiteDatabase db = this.getReadableDatabase();
        String query = "select " + Ruta.TABLE_NAME + "." + Ruta.COLUMN_LATITUD + " , " +
                Ruta.TABLE_NAME + "."  + Ruta.COLUMN_LONGITUD + " from " + Ruta.TABLE_NAME +
                " INNER JOIN " + Camion.TABLE_NAME +
                " on " + Ruta.TABLE_NAME + "." + Ruta.COLUMN_FK_CAMIONID + " = " + Camion.TABLE_NAME +"." + Camion._ID +
                " INNER JOIN " + Municipio.TABLE_NAME +
                " on " + Camion.TABLE_NAME + "." + Camion.COLUMN_FK_MUNICIPIOID + " = " + Municipio.TABLE_NAME +"." + Municipio._ID +
                " where " + Camion.TABLE_NAME + "." + Camion.COLUMN_NOMBRE + " = '" +  Nombre + "' and " +
                Municipio.TABLE_NAME +"." + Municipio.COLUMN_NOMBRE + " = '" +  MunicipioNombre + "'";
        Cursor res =  db.rawQuery(query, null);

        res.moveToFirst();
        while(res.isAfterLast() == false){
            HashMap<String, Double> trazo = new HashMap<String, Double>();
            trazo.put(Ruta.COLUMN_LATITUD, res.getDouble(res.getColumnIndex(Ruta.COLUMN_LATITUD)));
            trazo.put(Ruta.COLUMN_LONGITUD, res.getDouble(res.getColumnIndex(Ruta.COLUMN_LONGITUD)));
            Trazos.add(trazo);
            res.moveToNext();
        }
        return Trazos;
    }

    public HashMap<String, Double> MunicipioPunto(String Nombre){

        HashMap<String, Double> Punto = new HashMap<String, Double>();

        SQLiteDatabase db = this.getReadableDatabase();
        String query = "select " + Municipio.COLUMN_LATITUD + " , " +
                 Municipio.COLUMN_LONGITUD + " from " + Municipio.TABLE_NAME +
                " where " +  Municipio.COLUMN_NOMBRE + " = '" +  Nombre + "'";
        Cursor res =  db.rawQuery(query, null);

        res.moveToFirst();
        Punto.put(Municipio.COLUMN_LATITUD, res.getDouble(res.getColumnIndex(Municipio.COLUMN_LATITUD)));
        Punto.put(Municipio.COLUMN_LONGITUD, res.getDouble(res.getColumnIndex(Municipio.COLUMN_LONGITUD)));


        return Punto;
    }

    public HashMap<String, Double> RutaPuntoCentral(String Nombre, String MunicipioNombre){

        HashMap<String, Double> Puntos = new HashMap<String, Double>();

        SQLiteDatabase db = this.getReadableDatabase();
        String query = "select " + Camion.TABLE_NAME + "." + Camion.COLUMN_LATITUD_CENTRAL + " , " +
                Camion.TABLE_NAME + "."  + Camion.COLUMN_LONGITUD_CENTRAL +
                " from " +  Camion.TABLE_NAME +
                " INNER JOIN " + Municipio.TABLE_NAME +
                " on " + Camion.TABLE_NAME + "." + Camion.COLUMN_FK_MUNICIPIOID + " = " + Municipio.TABLE_NAME +"." + Municipio._ID +
                " where " + Camion.TABLE_NAME + "." + Camion.COLUMN_NOMBRE + " = '" +  Nombre + "' and " +
                Municipio.TABLE_NAME +"." + Municipio.COLUMN_NOMBRE + " = '" +  MunicipioNombre + "'";
        Cursor res =  db.rawQuery(query, null);

        res.moveToFirst();
        Puntos.put(Municipio.COLUMN_LATITUD, res.getDouble(res.getColumnIndex(Municipio.COLUMN_LATITUD)));
        Puntos.put(Municipio.COLUMN_LONGITUD, res.getDouble(res.getColumnIndex(Municipio.COLUMN_LONGITUD)));


        return Puntos;
    }


    public ArrayList<HashMap<String, String>> PuntosRuta(String Nombre, String MunicipioNombre){

        ArrayList<HashMap<String, String>> Puntos = new ArrayList<>();

        SQLiteDatabase db = this.getReadableDatabase();
        String query = "select " + Punto.TABLE_NAME + "." + Punto.COLUMN_LATITUD + " , " +
                Punto.TABLE_NAME + "."  + Punto.COLUMN_LONGITUD +  " , " +
                Punto.TABLE_NAME + "."  + Punto.COLUMN_NOMBRE +  " " +
                " from " + Punto.TABLE_NAME +
                " INNER JOIN " + Camion.TABLE_NAME +
                " on " + Punto.TABLE_NAME + "." + Punto.COLUMN_FK_CAMIONID + " = " + Camion.TABLE_NAME +"." + Camion._ID +
                " INNER JOIN " + Municipio.TABLE_NAME +
                " on " + Camion.TABLE_NAME + "." + Camion.COLUMN_FK_MUNICIPIOID + " = " + Municipio.TABLE_NAME +"." + Municipio._ID +
                " where " + Camion.TABLE_NAME + "." + Camion.COLUMN_NOMBRE + " = '" +  Nombre + "' and " +
                Municipio.TABLE_NAME +"." + Municipio.COLUMN_NOMBRE + " = '" +  MunicipioNombre + "'";
        Cursor res =  db.rawQuery(query, null);

        res.moveToFirst();
        while(res.isAfterLast() == false){
            HashMap<String, String> punto = new HashMap<String, String>();
            punto.put(Punto.COLUMN_LATITUD, res.getString(res.getColumnIndex(Punto.COLUMN_LATITUD)));
            punto.put(Punto.COLUMN_LONGITUD, res.getString(res.getColumnIndex(Punto.COLUMN_LONGITUD)));
            punto.put(Punto.COLUMN_NOMBRE, res.getString(res.getColumnIndex(Punto.COLUMN_NOMBRE)));
            Puntos.add(punto);
            res.moveToNext();
        }
        return Puntos;
    }

    public ArrayList<HashMap<String, Double>> FlechasRuta(String Nombre, String MunicipioNombre){

        ArrayList<HashMap<String, Double>> Puntos = new ArrayList<>();

        SQLiteDatabase db = this.getReadableDatabase();
        String query = "select " + Flecha.TABLE_NAME + "." + Flecha.COLUMN_LATITUD_INICIO + " , " +
                Flecha.TABLE_NAME + "." + Flecha.COLUMN_LONGITUD_INICIO + " , " +
                Flecha.TABLE_NAME + "." + Flecha.COLUMN_LATITUD_FIN + " , " +
                Flecha.TABLE_NAME + "." + Flecha.COLUMN_LONGITUD_FIN + " , " +
                Flecha.TABLE_NAME + "." + Flecha.COLUMN_SENTIDO + " " +
                " from " + Flecha.TABLE_NAME +
                " INNER JOIN " + Camion.TABLE_NAME +
                " on " + Flecha.TABLE_NAME + "." + Flecha.COLUMN_FK_CAMIONID + " = " + Camion.TABLE_NAME +"." + Camion._ID +
                " INNER JOIN " + Municipio.TABLE_NAME +
                " on " + Camion.TABLE_NAME + "." + Camion.COLUMN_FK_MUNICIPIOID + " = " + Municipio.TABLE_NAME +"." + Municipio._ID +
                " where " + Camion.TABLE_NAME + "." + Camion.COLUMN_NOMBRE + " = '" +  Nombre + "' and " +
                Municipio.TABLE_NAME +"." + Municipio.COLUMN_NOMBRE + " = '" +  MunicipioNombre + "'";
        Cursor res =  db.rawQuery(query, null);

        res.moveToFirst();
        while(res.isAfterLast() == false){
            HashMap<String, Double> punto = new HashMap<String, Double>();
            punto.put(Flecha.COLUMN_LATITUD_INICIO , res.getDouble(res.getColumnIndex(Flecha.COLUMN_LATITUD_INICIO)));
            punto.put(Flecha.COLUMN_LONGITUD_INICIO, res.getDouble(res.getColumnIndex(Flecha.COLUMN_LONGITUD_INICIO)));
            punto.put(Flecha.COLUMN_LATITUD_FIN, res.getDouble(res.getColumnIndex(Flecha.COLUMN_LATITUD_FIN)));
            punto.put(Flecha.COLUMN_LONGITUD_FIN, res.getDouble(res.getColumnIndex(Flecha.COLUMN_LONGITUD_FIN)));
            punto.put(Flecha.COLUMN_SENTIDO, res.getDouble(res.getColumnIndex(Flecha.COLUMN_SENTIDO)));
            Puntos.add(punto);
            res.moveToNext();
        }
        return Puntos;
    }


}
