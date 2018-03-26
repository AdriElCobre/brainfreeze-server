/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brainfreeze.service.specificimplementation;

import brainfreeze.bean.helper.MetaBeanHelper;
import brainfreeze.bean.specificimplementation.TipousuarioSpecificBeanImplementation;
import brainfreeze.bean.specificimplementation.UsuarioSpecificBeanImplementation;
import javax.servlet.http.HttpServletRequest;
import brainfreeze.service.genericimplementation.TableGenericServiceImplementation;

public class HistoriaSpecificServiceImplementation extends TableGenericServiceImplementation {

    public HistoriaSpecificServiceImplementation(HttpServletRequest request) {
        super(request);
    }

    @Override
    protected Boolean checkPermission(String strMethodName) {
        MetaBeanHelper oUsuarioBean = (MetaBeanHelper) oRequest.getSession().getAttribute("user");
        if (oUsuarioBean != null) {
            UsuarioSpecificBeanImplementation oUsuario = (UsuarioSpecificBeanImplementation) oUsuarioBean.getBean();
            MetaBeanHelper oMetaBeanHelper = oUsuario.getObj_tipousuario();
            TipousuarioSpecificBeanImplementation oTipousuario = (TipousuarioSpecificBeanImplementation) oMetaBeanHelper.getBean();
            Integer idTipousuario = oTipousuario.getId();

            String strMethod = strMethodName.toLowerCase();
            if (idTipousuario == 1) {
                return true;
            } else {
                if (idTipousuario == 2 || idTipousuario == 3 || idTipousuario == 4) {

                    switch (strMethod) {
                        case "getmetadata":
                            return true;
                        case "getobjectmetadata":
                            return true;
                        case "getpropertiesmetadata":
                            return true;
                        case "get":
                            return true;
                        case "set":
                            return false;
                        case "remove":
                            return false;
                        case "getpage":
                            return true;
                        case "getcount":
                            return true;
                        case "getpagex":
                            return true;
                        case "getcountx":
                            return true;
                    }
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
        return false;
    }

}
