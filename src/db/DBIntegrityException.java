package db;

public class DBIntegrityException extends RuntimeException {

    public static final long serialVersionUID = 1;

    public DBIntegrityException(String msg){
        super(msg);
    }
}
