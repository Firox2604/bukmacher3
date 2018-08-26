package pl.bukmacher.model;

public class BetRepository extends GenericRepository<Bet,Integer>{
    @Override
    public Class<Bet> getClazz() {
        return Bet.class;
    }
}
