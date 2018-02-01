package brainfreeze.dao.specificimplementation;

import brainfreeze.bean.helper.MetaBeanHelper;
import brainfreeze.dao.genericimplementation.TableGenericDaoImplementation;
import java.sql.Connection;

public class PlataformajuegoSpecificDaoImplementation extends TableGenericDaoImplementation {

    public PlataformajuegoSpecificDaoImplementation(Connection oPooledConnection, MetaBeanHelper oPuserBean_security, String strWhere) throws Exception {
        super("plataformajuego", oPooledConnection, oPuserBean_security, strWhere);
    }

}