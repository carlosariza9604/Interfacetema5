import java.util.List;

public interface CocheCRUD {
    public default void save(){

    }
    public default void delete(){

    }

    default List<CocheCRUDImpl> findALL() {

        return null;
    }

}
