package brainfreeze.dao.specificimplementation;

import brainfreeze.bean.helper.MetaBeanHelper;
import brainfreeze.dao.genericimplementation.TableGenericDaoImplementation;
import java.sql.Connection;

public class PlataformaSpecificDaoImplementation extends TableGenericDaoImplementation {

    public PlataformaSpecificDaoImplementation(Connection oPooledConnection, MetaBeanHelper oPuserBean_security, String strWhere) throws Exception {
        super("plataforma", oPooledConnection, oPuserBean_security, strWhere);
    }

}