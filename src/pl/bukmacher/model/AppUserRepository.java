package pl.bukmacher.model;

public class AppUserRepository extends GenericRepository<AppUser,Integer>{

    @Override
    public Class <AppUser> getClazz() {
        return AppUser.class;
    }
}
