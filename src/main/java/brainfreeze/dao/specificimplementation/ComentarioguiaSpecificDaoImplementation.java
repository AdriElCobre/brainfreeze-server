package brainfreeze.dao.specificimplementation;

import brainfreeze.bean.helper.MetaBeanHelper;
import brainfreeze.dao.genericimplementation.TableGenericDaoImplementation;
import java.sql.Connection;

public class ComentarioguiaSpecificDaoImplementation extends TableGenericDaoImplementation {

    public ComentarioguiaSpecificDaoImplementation(Connection oPooledConnection, MetaBeanHelper oPuserBean_security, String strWhere) throws Exception {
        super("comentarioguia", oPooledConnection, oPuserBean_security, strWhere);
    }

}