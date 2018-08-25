package pl.bukmacher.model;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.bukmacher.Main;

public class AppUserRepository extends GenericRepository<AppUser,Integer>{


    @Override
    public Class <AppUser> getClazz() {
        return AppUser.class;
    }
}
