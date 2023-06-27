package devandroid.glaucomv.appgaseta.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class GasEtaDB extends SQLiteOpenHelper {

    public static final String DB_NAME = "gaseta.db";
    public static final int DB_VERSION = 1;

    Cursor cursor;

    SQLiteDatabase db;

    public GasEtaDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        db = getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // Query SQL para criar uma tabela
        String sqlTabelaCombustivel
                = "CREATE TABLE Combustivel (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nomeDoCombustivel TEXT, " +
                "precoDoCombustivel REAL, " +
                "recomendacao TEXT)";

        db.execSQL(sqlTabelaCombustivel);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    // TODO criar métodos para implementar um CRUD
    // C = Create - criar banco de dados e tabelas
    // Create database XXX.db (SQL)
    // Create table (SQL)
    // 1 - Nome do banco de dados
    // 2 - Versão do banco de dados





    // R = Retrieve - recuperar os dados salvos
    // Select * from table (SQL)

    // U = Update - alterar os dados
    // Update from table (SQL)

    // D = Delete - deletar dados da tabela
    // Delete from (SQL)



}
