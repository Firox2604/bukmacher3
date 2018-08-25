package pl.bukmacher.model;


public class ZakladRepository extends GenericRepository<Zaklad,Integer>{


    @Override
    public Class<Zaklad> getClazz() {
        return Zaklad.class;
    }
}
