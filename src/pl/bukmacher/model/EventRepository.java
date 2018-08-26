package pl.bukmacher.model;

public class EventRepository extends GenericRepository<Event,Integer> {
    @Override
    public Class<Event> getClazz() {
        return Event.class;
    }
}