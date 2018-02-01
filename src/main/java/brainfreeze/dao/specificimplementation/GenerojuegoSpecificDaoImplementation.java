/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brainfreeze.dao.specificimplementation;

import brainfreeze.bean.helper.MetaBeanHelper;
import brainfreeze.dao.genericimplementation.TableGenericDaoImplementation;
import java.sql.Connection;

public class GenerojuegoSpecificDaoImplementation extends TableGenericDaoImplementation {

    public GenerojuegoSpecificDaoImplementation(Connection oPooledConnection, MetaBeanHelper oPuserBean_security, String strWhere) throws Exception {
        super("generojuego", oPooledConnection, oPuserBean_security, strWhere);
    }

}