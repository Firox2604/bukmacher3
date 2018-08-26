package pl.bukmacher.model;



public class MyEventRepository extends GenericRepository<MyEvent, Integer> {
    @Override
    public Class<MyEvent> getClazz() {
        return MyEvent.class;
    }
}
