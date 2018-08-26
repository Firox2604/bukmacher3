package pl.bukmacher.model;

public class ContestantTypeRepository extends GenericRepository<ContestantType,Integer> {
    @Override
    public Class<ContestantType> getClazz() {
        return ContestantType.class;
    }
}
