package brainfreeze.service.specificimplementation;

import brainfreeze.bean.helper.MetaBeanHelper;
import brainfreeze.bean.helper.ReplyBeanHelper;
import brainfreeze.bean.specificimplementation.UsuarioSpecificBeanImplementation;
import brainfreeze.connection.publicinterface.ConnectionInterface;
import brainfreeze.dao.publicinterface.MetaDaoInterface;
import brainfreeze.dao.specificimplementation.UsuarioSpecificDaoImplementation;
import brainfreeze.factory.ConnectionFactory;
import brainfreeze.factory.DaoFactory;
import brainfreeze.helper.EncodingHelper;
import brainfreeze.helper.GsonHelper;
import brainfreeze.helper.Log4jHelper;
import brainfreeze.helper.constant.ConnectionConstants;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import brainfreeze.service.genericimplementation.TableGenericServiceImplementation;

public class UsuarioSpecificServiceImplementation extends TableGenericServiceImplementation {

    public UsuarioSpecificServiceImplementation(HttpServletRequest request) {
        super(request);
    }
    
    public ReplyBeanHelper getallobjectsmetadata() throws Exception {
        ReplyBeanHelper oReplyBean = null;
        HashMap hmObjectsMetaData = new HashMap();
        MetaDaoInterface oDao = null;
        
        oDao = DaoFactory.getDao("usuario", null, (MetaBeanHelper) oRequest.getSession().getAttribute("user"), null);
        hmObjectsMetaData.put("usuario", oDao.getObjectMetaData());
        
        oDao = DaoFactory.getDao("tipousuario", null, (MetaBeanHelper) oRequest.getSession().getAttribute("user"), null);
        hmObjectsMetaData.put("tipousuario", oDao.getObjectMetaData());
        
        oDao = DaoFactory.getDao("clase", null, (MetaBeanHelper) oRequest.getSession().getAttribute("user"), null);
        hmObjectsMetaData.put("clase", oDao.getObjectMetaData());
        
        oDao = DaoFactory.getDao("comentarioguia", null, (MetaBeanHelper) oRequest.getSession().getAttribute("user"), null);
        hmObjectsMetaData.put("comentarioguia", oDao.getObjectMetaData());
        
        oDao = DaoFactory.getDao("comentarionoticias", null, (MetaBeanHelper) oRequest.getSession().getAttribute("user"), null);
        hmObjectsMetaData.put("comentarionoticias", oDao.getObjectMetaData());
        
        oDao = DaoFactory.getDao("genero", null, (MetaBeanHelper) oRequest.getSession().getAttribute("user"), null);
        hmObjectsMetaData.put("genero", oDao.getObjectMetaData());
        
        oDao = DaoFactory.getDao("generojuego", null, (MetaBeanHelper) oRequest.getSession().getAttribute("user"), null);
        hmObjectsMetaData.put("generojuego", oDao.getObjectMetaData());
        
        oDao = DaoFactory.getDao("guia", null, (MetaBeanHelper) oRequest.getSession().getAttribute("user"), null);
        hmObjectsMetaData.put("guia", oDao.getObjectMetaData());
        
        oDao = DaoFactory.getDao("historia", null, (MetaBeanHelper) oRequest.getSession().getAttribute("user"), null);
        hmObjectsMetaData.put("historia", oDao.getObjectMetaData());
        
        oDao = DaoFactory.getDao("juego", null, (MetaBeanHelper) oRequest.getSession().getAttribute("user"), null);
        hmObjectsMetaData.put("juego", oDao.getObjectMetaData());
        
        oDao = DaoFactory.getDao("noticia", null, (MetaBeanHelper) oRequest.getSession().getAttribute("user"), null);
        hmObjectsMetaData.put("noticia", oDao.getObjectMetaData());
        
        oDao = DaoFactory.getDao("personaje", null, (MetaBeanHelper) oRequest.getSession().getAttribute("user"), null);
        hmObjectsMetaData.put("personaje", oDao.getObjectMetaData());
        
        oDao = DaoFactory.getDao("plataforma", null, (MetaBeanHelper) oRequest.getSession().getAttribute("user"), null);
        hmObjectsMetaData.put("plataforma", oDao.getObjectMetaData());
        
        oDao = DaoFactory.getDao("tipousuario", null, (MetaBeanHelper) oRequest.getSession().getAttribute("user"), null);
        hmObjectsMetaData.put("tipousuario", oDao.getObjectMetaData());
        
        oDao = DaoFactory.getDao("usuario", null, (MetaBeanHelper) oRequest.getSession().getAttribute("user"), null);
        hmObjectsMetaData.put("usuario", oDao.getObjectMetaData());
        
        
        
        String strJson = GsonHelper.getGson().toJson(hmObjectsMetaData);
        oReplyBean = new ReplyBeanHelper(200, strJson);
        return oReplyBean;
    }
    
    public ReplyBeanHelper login() throws Exception {
        Connection oConnection = null;
        ConnectionInterface oPooledConnection = null;
        ReplyBeanHelper oReplyBean = null;
        UsuarioSpecificBeanImplementation oUsuarioBean = new UsuarioSpecificBeanImplementation();
        oUsuarioBean.setLogin(oRequest.getParameter("user"));
        oUsuarioBean.setPassword(oRequest.getParameter("pass"));
        if (!oUsuarioBean.getLogin().equalsIgnoreCase("") || !oUsuarioBean.getPassword().equalsIgnoreCase("")) {
            try {
                oPooledConnection = ConnectionFactory.getSourceConnection(ConnectionConstants.connectionName);
                oConnection = oPooledConnection.newConnection();
                UsuarioSpecificDaoImplementation oDao = new UsuarioSpecificDaoImplementation(oConnection, (MetaBeanHelper) oRequest.getSession().getAttribute("user"), null);
                MetaBeanHelper oMetaBeanHelper = oDao.getFromLoginAndPass(oUsuarioBean);
                HttpSession oSession = oRequest.getSession();
                oSession.setAttribute("user", oMetaBeanHelper);
                String strJson = GsonHelper.getGson().toJson(oMetaBeanHelper);
                oReplyBean = new ReplyBeanHelper(200, strJson);
            } catch (Exception ex) {
                String msg = this.getClass().getName() + ":" + (ex.getStackTrace()[0]).getMethodName() + " ob:" + ob;
                Log4jHelper.errorLog(msg, ex);
                throw new Exception(msg, ex);
            } finally {
                if (oConnection != null) {
                    oConnection.close();
                }
                if (oPooledConnection != null) {
                    oPooledConnection.disposeConnection();
                }
            }
        }
        return oReplyBean;
    }

    public ReplyBeanHelper logout() throws Exception {
        HttpSession oSession = oRequest.getSession();
        oSession.invalidate();
        ReplyBeanHelper oReplyBean = new ReplyBeanHelper(200, EncodingHelper.quotate("Session is closed"));
        return oReplyBean;
    }

    public ReplyBeanHelper getSessionStatus() throws Exception {
        ReplyBeanHelper oReplyBean = null;
        UsuarioSpecificBeanImplementation oUsuarioBean = null;
        try {
            HttpSession oSession = oRequest.getSession();
            MetaBeanHelper oMetaBeanHelper = (MetaBeanHelper) oSession.getAttribute("user");
            if (oMetaBeanHelper != null) {
                String strJson = GsonHelper.getGson().toJson(oMetaBeanHelper);
                oReplyBean = new ReplyBeanHelper(200, strJson);
            } else {
                oReplyBean = new ReplyBeanHelper(401, null);
            }
        } catch (Exception ex) {
            String msg = this.getClass().getName() + ":" + (ex.getStackTrace()[0]).getMethodName() + " ob:" + ob;
            Log4jHelper.errorLog(msg, ex);
            throw new Exception(msg, ex);
        }
        return oReplyBean;
    }

    public ReplyBeanHelper getSessionUserLevel() {
        ReplyBeanHelper oReplyBean = null;
        String strAnswer = null;
        MetaBeanHelper oUserBean = (MetaBeanHelper) oRequest.getSession().getAttribute("user");
        Map<Integer, String> map = new HashMap<>();
        if (oUserBean == null) {
            oReplyBean = new ReplyBeanHelper(401, EncodingHelper.quotate("Unauthorized"));
        } else {
            oReplyBean = new ReplyBeanHelper(200, EncodingHelper.quotate(((UsuarioSpecificBeanImplementation) oUserBean.getBean()).getId_tipousuario().toString()));
        }
        return oReplyBean;
    }

    public ReplyBeanHelper setPass() throws Exception {
        if (this.checkPermission("passchange")) {
            Connection oConnection = null;
            ConnectionInterface oPooledConnection = null;
            String oldPass = oRequest.getParameter("old");
            String newPass = oRequest.getParameter("new");
            ReplyBeanHelper oReplyBean = null;
            Integer iResult = 0;
            try {
                oPooledConnection = ConnectionFactory.getSourceConnection(ConnectionConstants.connectionName);
                oConnection = oPooledConnection.newConnection();
                oConnection.setAutoCommit(false);
                UsuarioSpecificDaoImplementation oUserDao = new UsuarioSpecificDaoImplementation(oConnection, (MetaBeanHelper) oRequest.getSession().getAttribute("user"), null);
                MetaBeanHelper oSessionUsuarioBeanMeta = (MetaBeanHelper) oRequest.getSession().getAttribute("user");
                UsuarioSpecificBeanImplementation oSessionUsuarioBean = (UsuarioSpecificBeanImplementation) oSessionUsuarioBeanMeta.getBean();
                if (oSessionUsuarioBean.getPassword().equalsIgnoreCase(oldPass)) {
                    oSessionUsuarioBean.setPassword(newPass);
                    iResult = oUserDao.set(oSessionUsuarioBean);
                    if (iResult >= 1) {
                        oReplyBean = new ReplyBeanHelper(200, EncodingHelper.quotate(iResult.toString()));
                    } else {
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Server error during password change operation"));
                    }
                } else {
                    oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate(iResult.toString()));
                }
                oConnection.commit();
            } catch (Exception ex) {
                if (oConnection != null) {
                    oConnection.rollback();
                }
                String msg = this.getClass().getName() + ":" + (ex.getStackTrace()[0]).getMethodName() + " ob:" + ob;
                Log4jHelper.errorLog(msg, ex);
                throw new Exception(msg, ex);
            } finally {
                if (oConnection != null) {
                    oConnection.close();
                }
                if (oPooledConnection != null) {
                    oPooledConnection.disposeConnection();
                }
            }
            return oReplyBean;
        } else {
            return new ReplyBeanHelper(401, EncodingHelper.quotate("Unauthorized"));
        }
    }

    public ReplyBeanHelper checklogin() throws SQLException, Exception {
        Connection oConnection = null;
        ConnectionInterface oPooledConnection = null;
        ReplyBeanHelper oReplyBean = null;
        UsuarioSpecificBeanImplementation oPuser = null;
        String strAnswer = null;
        String strCode = "200";
        try {
            oPooledConnection = ConnectionFactory.getSourceConnection(ConnectionConstants.connectionName);
            oConnection = oPooledConnection.newConnection();
            String login = oRequest.getParameter("login");
            if (!login.isEmpty()) {
                try {
                    UsuarioSpecificDaoImplementation oUserDao = new UsuarioSpecificDaoImplementation(oConnection, (MetaBeanHelper) oRequest.getSession().getAttribute("user"), null);
                    if (oUserDao.getIDfromUser(login) == 0) {
                        oReplyBean = new ReplyBeanHelper(200, EncodingHelper.quotate("OK"));
                    } else {
                        oReplyBean = new ReplyBeanHelper(403, EncodingHelper.quotate("Server error during checklogin operation"));
                    }
                } catch (Exception ex) {
                    String msg = this.getClass().getName() + ":" + (ex.getStackTrace()[0]).getMethodName() + " ob:" + ob;
                    Log4jHelper.errorLog(msg, ex);
                    throw new Exception(msg, ex);
                }
            }
        } catch (Exception ex) {
            if (oConnection != null) {
                oConnection.rollback();
            }
            String msg = this.getClass().getName() + ":" + (ex.getStackTrace()[0]).getMethodName() + " ob:" + ob;
            Log4jHelper.errorLog(msg, ex);
            throw new Exception(msg, ex);
        } finally {
            if (oConnection != null) {
                oConnection.close();
            }
            if (oPooledConnection != null) {
                oPooledConnection.disposeConnection();
            }
        }
        return oReplyBean;
    }
}