import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{


    @Override
    public void save() {
        System.out.println("guardar");
    }

    @Override
    public void delete() {
        System.out.println("borrar");
    }

    @Override
    public List<CocheCRUDImpl> findALL() {
        System.out.println("actualizar");
        return null;
    }
}
