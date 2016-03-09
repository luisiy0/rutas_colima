package colima.ruta.com.rutascolima.db.rutas.colima;

/**
 * Created by luisfer on 02/01/2016.
 */

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import colima.ruta.com.rutascolima.db.DBContract;
import colima.ruta.com.rutascolima.db.DBContract.Camion;
import colima.ruta.com.rutascolima.db.DBContract.Ruta;
import colima.ruta.com.rutascolima.db.DBContract.Punto;
import colima.ruta.com.rutascolima.utils.Utils;

public class IncluyenteA {

    public static void IncluyenteA(SQLiteDatabase db,int RutaIA){
        //pruebin
        ContentValues contentValues = new ContentValues();

        contentValues.put(Ruta.COLUMN_LATITUD, 19.273870795578);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.78160566092);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.273068189096);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.78211259842);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);


        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.27280740444);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.78224939108);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.272311152883);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.78260612488);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.271364219718);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.78138571977);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.271030006707);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7807393074);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.27079453804);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.78017604351);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.269080417223);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.77724707126);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.26863732547);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7763646245);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.268016995001);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.77524077893);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.266981417684);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.77236008644);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.265806573881);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.77013385296);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.265606545757);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7697583437);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.265254596946);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.76910924912);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.264469672416);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.76782178879);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.263393560096);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.76599252224);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.261930036006);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.76341760159);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.261823689455);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.76323789358);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.261221057701);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.76215159893);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.260590570848);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.76108139753);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.260408260945);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.76079976559);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.2599524853);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.76013994217);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.259220709531);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.75888198614);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.258739609496);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.75805854797);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.258506655288);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.75767767429);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.257876157997);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.75630706549);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.257779937314);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.756044209);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.257658395317);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.75583231449);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.25731655797);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7551215291);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.257101326682);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.75465482474);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.256724038214);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.75377506018);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.256516402579);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.75340491533);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.256020101703);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.75224083663);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.255478220462);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.75082731247);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.25523006864);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.75000119209);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.254824922005);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74881565571);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.254597026582);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74791175127);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.25442990307);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7470588088);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.254414710016);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74696493148);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.254359002135);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74651163817);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.254280504635);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74580085277);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.254207071457);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74474138021);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.254227328889);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74467968941);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.251381135192);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74558359385);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.24886915098);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74646604061);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.247073767729);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74720364809);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.246691391609);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74739408493);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.244554120592);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74826848507);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.244186932603);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74828726053);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.244369260534);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74709635973);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.244473086071);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74566674233);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.244326210902);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74314546585);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.244262902599);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74294698238);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.244151479926);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74222278595);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.244078042214);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74077707529);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.244052718858);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74016553164);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.243129679842);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74019503593);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.24244214535);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74028891325);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.240123119651);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74044582248);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.239667920753);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.740452528);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.239584351416);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74046728015);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.23855619185);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74076902866);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.2370873813);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74120756984);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.236627742196);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73952448368);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.237463448701);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73918116093);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.237871170634);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7390229106);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.238671416949);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73874664307);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.239226015746);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73857229948);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.239681848971);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73855352402);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.239231080566);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73779177666);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.238798037844);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73708099127);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.238342202165);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73624145985);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.238506809639);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73621195555);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.238706870809);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73626559973);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.238894269659);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73627632856);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.239101927594);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7362575531);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.242052161338);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73599201441);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.243650076962);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73586863279);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.243769096996);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73586058617);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.243796952737);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73582035303);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.243845067185);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73576402664);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.243784291037);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73493254185);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.243650076962);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73381942511);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.243842534847);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73267948627);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.242495324917);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73100042343);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.241406406553);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72973442078);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.241365888521);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72967541218);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.241267125776);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72970223427);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.240679612835);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73017430305);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.240436503417);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73016089201);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.239228548157);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73045861721);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.237790132815);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73095214367);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.23659988524);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73144030571);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.235599564115);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73179972172);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.235374174464);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73142689466);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.233905335449);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.732239604);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.233444421188);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73242199421);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.233251951114);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73246490955);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.230790340273);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73246490955);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.230476304961);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73252928257);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.230309156889);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73253464699);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.230157203949);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73181581497);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.230025511286);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73105406761);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.230207854944);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73098433018);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.230552281301);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73078048229);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.23158555604);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73017966747);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.232613759253);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72951984406);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.233768580804);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72883856297);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.233408966191);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72823774815);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.232958180566);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72752964497);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.232071800726);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72606515884);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.230668778288);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72381210327);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.230491500232);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72354924679);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.230435784232);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72348487377);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.23033954746);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72343122959);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.230258505924);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72335612774);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.23007109722);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72330784798);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.226809138487);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72300207615);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.225203461099);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72287333012);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.224717196082);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72278213501);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.223542049681);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72266948223);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.221637484218);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72251927853);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.220827024134);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72241199017);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.220781435636);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7226909399);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.220730781734);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72315496206);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.220725716343);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72330784798);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.220842220298);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72369945049);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.22098658378);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72398644686);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.221016976075);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7242358923);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.221168937469);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72443169355);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.221407010039);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72487157583);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.221520980827);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72508078814);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.221693203202);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72527122498);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.221728660727);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72544288635);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.221596961309);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72534632683);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.221437402256);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7253087759);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.221467794469);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72516661882);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.221472859837);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72506469488);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.221356356329);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72486352921);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.221239852739);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72465968132);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.221113218308);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72440487146);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.220994181854);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72427612543);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.22095872417);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72401595116);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.220852351073);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72377455235);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.220725716343);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72346609831);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.220695323993);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72329711914);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.220695323994);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72310936451);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.220713052865);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72291892767);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.220778902941);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72244149446);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.216483396516);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72200161218);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.216178512497);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72203167984);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.215823610968);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7222725153);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.215626054703);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72223764659);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.215512079826);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72205525637);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.215289195396);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72192919255);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.214972597672);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72183799744);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.213437723272);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7217065692);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.213199005958);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72186951339);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.212882404211);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72194863857);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.212499315281);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7217333913);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.2125018481);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7212613225);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.212912164797);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72104406357);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.213208503999);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72125059366);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.213470649768);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72153222561);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.227834839014);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72294172645);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.228968167334);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72304499149);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.230109085488);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72313082218);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.230269902393);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72314423323);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.230320553354);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72306376696);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.23038639958);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72300341725);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.230472506143);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7229578197);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.23061432862);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72296988964);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.230685239812);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72300744057);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.230758683515);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72310802341);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.230814399406);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72322201729);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.231300646375);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72330248356);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.232192095414);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72341781855);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.236929103517);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72419834137);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.238706870809);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7244451046);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.238909464151);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72458457947);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.240271897877);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72365653515);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.240894865666);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72448265553);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.239618538877);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72552871704);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.240479554069);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72668206692);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.242439612989);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72933745384);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.244197061938);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73161196709);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.244637687398);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.730930686);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.245047923832);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7304264307);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.245848135159);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72976660728);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.249069199519);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72729361057);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.250289743551);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72634410858);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.251084864862);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72570574284);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.251317829611);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72550189495);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.251393796306);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72533023357);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.251454569636);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72514784336);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.251864789027);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72473478317);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.253075183475);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72372627258);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.252239556463);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72263729572);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.25155079403);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72175216675);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.251069671496);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7210547924);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.250664514585);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72064709663);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.250249227711);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72004628181);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.249028683379);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.71842622757);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.248542488916);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.71775567532);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.247833452744);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.71681153774);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.248420940076);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.71629655361);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.249033747897);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.71575474739);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.250304936988);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.71472477913);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.250699965854);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.71431708336);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.251206411728);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.71393620968);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.252128139207);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.71314227581);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.252852350022);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.71255755425);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.251652082804);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7110555172);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.250092228743);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.708974123);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.248253810273);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.70654404163);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.247716967937);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.70585739613);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.245939298228);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.70345950127);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.24722064044);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.70161414146);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.248309520226);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.70005309582);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.250208711863);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.70265483856);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.251712856039);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.70029985905);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.25196101318);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.69984924793);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.253211922035);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.69775176048);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.254108316441);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.69629263878);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.254969255608);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.69477450848);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.255860576103);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.69352459908);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.256807598821);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.69230151176);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.257384925496);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.69136810303);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.258362324795);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.68997871876);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.258590214986);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.68958175182);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.258620600321);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.68946373463);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.258638325097);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.68936181068);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.258691499413);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.68928939104);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.25880544432);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.68920892477);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.258916857041);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.68908017874);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.259099168602);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.68886828423);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.259342250369);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.68852496147);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.259554946619);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.68809849024);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.259896779301);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.68761301041);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.261036216426);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.68600904942);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.26119320492);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.6861538887);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.260038576352);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.6877900362);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.259238434242);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.6890989542);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.259094104395);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.68931353092);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.259045994418);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.68945032358);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.258982691795);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.68953615427);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.258937113891);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.68959516287);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.25887887544);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.68964344263);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.258780123236);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.68972659111);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.25865098565);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.68991166353);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.258468673591);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.69021207094);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.257676120197);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.69136810303);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.257240594018);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.6919850111);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.256015037401);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.69368553162);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.255308565685);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.69463503361);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.254695781303);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.69562476873);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.253024539534);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.69840353727);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.252105349304);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.69996994734);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.250722755952);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.70228737593);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.250358114005);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.70290160179);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.250049180612);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.70324224234);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.249649085678);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.70396107435);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.249056538226);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.70473891497);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.248165180763);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.70610147715);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.250545499552);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.70925039053);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.25234337702);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.71160537004);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.255057881442);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.71519953012);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.257182354964);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.71798366308);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.257468485768);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.71834844351);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.258081259791);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.71912628412);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.259704340249);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72136056423);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.260823522096);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72276335955);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.262487088238);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72493594885);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.263337855266);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72609734535);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.263593590921);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72642993927);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.263806281656);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72664988041);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.264127849268);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7268269062);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.264355731445);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72692346573);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.264646913767);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72698247433);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.265219148823);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72696638107);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.265869873869);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72697979212);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.266338293024);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72712999582);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.26667504759);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7273606658);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.266948501916);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72767448425);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.267113080689);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72790515423);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.267584028264);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.72853279114);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.269166503481);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73059272766);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.270513494349);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73235493898);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.272113664599);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73451411724);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.273397334185);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73609930277);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.274086004848);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73711854219);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.274265767669);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73745650053);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.274394892955);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73783737421);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.274410084158);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73796343803);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.274427807227);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73816460371);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.274412616026);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73846232891);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.274042963017);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73944401741);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.274022708033);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73950302601);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.27406574987);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73958081007);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.274068281743);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73966664076);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.274032835525);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73975783587);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.273982198059);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73983293772);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.273878391203);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73985439539);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.273825221813);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73985171318);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.273756861143);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7398275733);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.273708755469);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73980075121);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.273655586023);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73972833157);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.273608746259);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73964518309);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.273565704302);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73958215117);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.273532789856);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73953923583);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.273245421149);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7393809855);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.272231398027);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73893037438);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.271571836549);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7386380136);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.27101734711);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7384301424);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.270508430493);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73829871416);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.269693147845);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73817265034);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.269158907636);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73815655708);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.26872847587);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73815655708);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.267725818666);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73840332031);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.267366278478);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73852133751);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.266469956546);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73895585537);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.264965947717);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.73976588249);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.265988877782);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74163269997);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.266804178857);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74314010143);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.265862277872);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74361217022);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.263953139384);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74452412128);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.262580774109);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74518930912);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.26382147384);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.74803781509);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.264803898804);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.75018894672);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.260068961419);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.75223278999);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.258180012415);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.75302135944);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.256807598822);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.75363826752);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.257010169817);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.75391185284);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.257698909326);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.75524222851);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.257825515539);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.75557482243);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.258058470715);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7561327219);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.258255975931);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.75674694777);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.258352196336);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7569668889);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.258478802043);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.75710904598);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.259051058627);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.75805050135);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.259428341742);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.75871568918);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.260053768886);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7598207593);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.260489287595);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.76055300235);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.261026088131);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.76150518656);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.261643912988);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.76257538796);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.26204904278);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.76340955496);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.262542793357);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.76427322626);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.263039074491);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.76509666443);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.263816409779);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.76647531987);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.26453803696);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.76765817404);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.265325493171);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.76902341843);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.265854681875);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.76998901367);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.266186373445);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.77055227756);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.266492744454);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.77110749483);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.266794050918);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.77171099186);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.267034589295);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.77222061157);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.267454897611);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.77346783877);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.267756202308);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.77426445484);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.268181572701);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.77523809672);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.268543643059);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7759166956);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.269070289425);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.77695471049);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.271417389908);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.78110945225);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.272014920369);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.78193825483);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.273518864512);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.78111481667);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.275131664695);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.78024309873);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.275339276752);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.7807393074);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(Ruta.COLUMN_LATITUD, 19.274179684091);
        contentValues.put(Ruta.COLUMN_LONGITUD, -103.78142595291);
        contentValues.put(Ruta.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(Ruta.TABLE_NAME, null, contentValues);

        Puntos(db, RutaIA);
        Flechas( db, RutaIA);
    }

    public static void Puntos(SQLiteDatabase db,int RutaIA){


        Puntos.EcoGranja(db, RutaIA);
        Puntos.LosRojos(db,RutaIA);
        Puntos.Clinica19(db, RutaIA);
        Puntos.GlorietaCharro(db, RutaIA);
        Puntos.GlorietaReyColiman(db, RutaIA);
        Puntos.Cancerologia(db, RutaIA);
        Puntos.GlorietaCosteno(db,RutaIA);
        Puntos.Clinica1(db,RutaIA);
        Puntos.ISSSTE(db,RutaIA);
        Puntos.UniversidadColima(db,RutaIA);
        Puntos.HospitalRegional(db,RutaIA);
        Puntos.FacultadDerecho(db,RutaIA);
        Puntos.TecnologicoColima(db,RutaIA);
        Puntos.GlorietaDiosaAgua(db,RutaIA);
        Puntos.Soriana(db,RutaIA);
        Puntos.DifVilladealvarez(db,RutaIA);
        Puntos.CasaCulturaVilla(db,RutaIA);
        Puntos.Bachi4(db,RutaIA);

    }

    public static void Flechas(SQLiteDatabase db,int RutaIA) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_INICIO,19.255125);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_INICIO,  -103.694884);
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_FIN,19.254938);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_FIN, -103.695190);
        contentValues.put(DBContract.Flecha.COLUMN_SENTIDO, 2);
        contentValues.put(DBContract.Flecha.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(DBContract.Flecha.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_INICIO,19.251827);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_INICIO,  -103.710991);
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_FIN,19.251949);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_FIN,  -103.711134);
        contentValues.put(DBContract.Flecha.COLUMN_SENTIDO, 2);
        contentValues.put(DBContract.Flecha.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(DBContract.Flecha.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_INICIO,19.262025);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_INICIO,  -103.724416);
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_FIN,19.262248);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_FIN,  -103.724706);
        contentValues.put(DBContract.Flecha.COLUMN_SENTIDO, 1);
        contentValues.put(DBContract.Flecha.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(DBContract.Flecha.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_INICIO,19.265920);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_INICIO,  -103.741605);
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_FIN,19.266102);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_FIN,  -103.741939);
        contentValues.put(DBContract.Flecha.COLUMN_SENTIDO, 1);
        contentValues.put(DBContract.Flecha.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(DBContract.Flecha.TABLE_NAME, null, contentValues);

        //revisar
        contentValues = new ContentValues();
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_INICIO,19.259539);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_INICIO,  -103.752475);
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_FIN,19.259700);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_FIN, -103.752026);
        contentValues.put(DBContract.Flecha.COLUMN_SENTIDO, 1);
        contentValues.put(DBContract.Flecha.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(DBContract.Flecha.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_INICIO,19.266359);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_INICIO,  -103.771179);
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_FIN,19.266536);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_FIN,   -103.771496);
        contentValues.put(DBContract.Flecha.COLUMN_SENTIDO, 2);
        contentValues.put(DBContract.Flecha.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(DBContract.Flecha.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_INICIO,19.273605);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_INICIO,-103.781756 );
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_FIN,19.273848);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_FIN, -103.781607  );
        contentValues.put(DBContract.Flecha.COLUMN_SENTIDO, 1);
        contentValues.put(DBContract.Flecha.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(DBContract.Flecha.TABLE_NAME, null, contentValues);


        contentValues = new ContentValues();
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_INICIO,19.249000);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_INICIO,  -103.746431);
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_FIN,19.249649);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_FIN, -103.745879);
        contentValues.put(DBContract.Flecha.COLUMN_SENTIDO, 1);
        contentValues.put(DBContract.Flecha.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(DBContract.Flecha.TABLE_NAME, null, contentValues);


        contentValues = new ContentValues();
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_INICIO,19.241892);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_INICIO,  -103.740354);
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_FIN,19.241914);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_FIN,-103.740123);
        contentValues.put(DBContract.Flecha.COLUMN_SENTIDO, 1);
        contentValues.put(DBContract.Flecha.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(DBContract.Flecha.TABLE_NAME, null, contentValues);

        // revisar
        contentValues = new ContentValues();
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_INICIO,19.241383);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_INICIO,  -103.736160);
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_FIN,19.241458);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_FIN,-103.736276);
        contentValues.put(DBContract.Flecha.COLUMN_SENTIDO, 1);
        contentValues.put(DBContract.Flecha.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(DBContract.Flecha.TABLE_NAME, null, contentValues);

        // revisar
        contentValues = new ContentValues();
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_INICIO,19.238734);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_INICIO,  -103.730665);
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_FIN,19.238562);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_FIN, -103.730633);
        contentValues.put(DBContract.Flecha.COLUMN_SENTIDO, 1);
        contentValues.put(DBContract.Flecha.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(DBContract.Flecha.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_INICIO,19.232181);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_INICIO,  -103.726274);
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_FIN,19.231996);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_FIN,    -103.725956);
        contentValues.put(DBContract.Flecha.COLUMN_SENTIDO, 1);
        contentValues.put(DBContract.Flecha.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(DBContract.Flecha.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_INICIO,19.223946);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_INICIO,  -103.722712);
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_FIN,19.223962);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_FIN, -103.722574);
        contentValues.put(DBContract.Flecha.COLUMN_SENTIDO, 2);
        contentValues.put(DBContract.Flecha.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(DBContract.Flecha.TABLE_NAME, null, contentValues);


        contentValues = new ContentValues();
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_INICIO,19.221347);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_INICIO,  -103.724786);
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_FIN,19.221205);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_FIN, -103.724515);
        contentValues.put(DBContract.Flecha.COLUMN_SENTIDO, 2);
        contentValues.put(DBContract.Flecha.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(DBContract.Flecha.TABLE_NAME, null, contentValues);

        // revisar
        contentValues = new ContentValues();
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_INICIO,19.234783);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_INICIO,-103.723863  );
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_FIN,19.234631);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_FIN,-103.723981);
        contentValues.put(DBContract.Flecha.COLUMN_SENTIDO, 1);
        contentValues.put(DBContract.Flecha.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(DBContract.Flecha.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_INICIO,19.246532);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_INICIO, -103.729300 );
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_FIN,19.246170);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_FIN,-103.729581);
        contentValues.put(DBContract.Flecha.COLUMN_SENTIDO, 1);
        contentValues.put(DBContract.Flecha.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(DBContract.Flecha.TABLE_NAME, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_INICIO,19.249806);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_INICIO, -103.715188  );
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_FIN,19.249458);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_FIN,-103.715454 );
        contentValues.put(DBContract.Flecha.COLUMN_SENTIDO, 1);
        contentValues.put(DBContract.Flecha.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(DBContract.Flecha.TABLE_NAME, null, contentValues);


        contentValues = new ContentValues();
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_INICIO,19.247373);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_INICIO,-103.701425);
        contentValues.put(DBContract.Flecha.COLUMN_LATITUD_FIN,19.247119);
        contentValues.put(DBContract.Flecha.COLUMN_LONGITUD_FIN,-103.701768 );
        contentValues.put(DBContract.Flecha.COLUMN_SENTIDO, 1);
        contentValues.put(DBContract.Flecha.COLUMN_FK_CAMIONID, RutaIA);
        db.insert(DBContract.Flecha.TABLE_NAME, null, contentValues);

    }

    }
