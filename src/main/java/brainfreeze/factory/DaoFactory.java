/*
 * Copyright (c) 2017-2018
 *
 * by Rafael Angel Aznar Aparici (rafaaznar at gmail dot com) & DAW students
 *
 * GESANE: Free Open Source Health Management System
 *
 * Sources at:
 *                            https://github.com/rafaelaznar/gesane-server
 *                            https://github.com/rafaelaznar/gesane-client
 *                            https://github.com/rafaelaznar/gesane-database
 *
 * GESANE is distributed under the MIT License (MIT)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package brainfreeze.factory;

import brainfreeze.bean.helper.MetaBeanHelper;
import brainfreeze.dao.publicinterface.MetaDaoInterface;
import brainfreeze.dao.specificimplementation.ClaseSpecificDaoImplementation;
import brainfreeze.dao.specificimplementation.ComentarioguiaSpecificDaoImplementation;
import brainfreeze.dao.specificimplementation.ComentarionoticiaSpecificDaoImplementation;
import brainfreeze.dao.specificimplementation.GeneroSpecificDaoImplementation;
import brainfreeze.dao.specificimplementation.GenerojuegoSpecificDaoImplementation;
import brainfreeze.dao.specificimplementation.GuiaSpecificDaoImplementation;
import brainfreeze.dao.specificimplementation.HistoriaSpecificDaoImplementation;
import brainfreeze.dao.specificimplementation.JuegoSpecificDaoImplementation;
import brainfreeze.dao.specificimplementation.NoticiaSpecificDaoImplementation;
import brainfreeze.dao.specificimplementation.PersonajeSpecificDaoImplementation;
import brainfreeze.dao.specificimplementation.PlataformaSpecificDaoImplementation;
import brainfreeze.dao.specificimplementation.PlataformajuegoSpecificDaoImplementation;
import brainfreeze.dao.specificimplementation.TipousuarioSpecificDaoImplementation;
import brainfreeze.dao.specificimplementation.UsuarioSpecificDaoImplementation;

import java.sql.Connection;

public class DaoFactory {

    public static MetaDaoInterface getDao(String ob, Connection oConnection, MetaBeanHelper oPuserBean_security, String strWhere) throws Exception {
        MetaDaoInterface oDao = null;
        
        
        switch (ob) {
            case "usuario":
                oDao = (MetaDaoInterface) new UsuarioSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "tipousuario":
                oDao = (MetaDaoInterface) new TipousuarioSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "clase":
                oDao = (MetaDaoInterface) new ClaseSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "comentarioguia":
                oDao = (MetaDaoInterface) new ComentarioguiaSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "comentarionoticia":
                oDao = (MetaDaoInterface) new ComentarionoticiaSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "genero":
                oDao = (MetaDaoInterface) new GeneroSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "generojuego":
                oDao = (MetaDaoInterface) new GenerojuegoSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "guia":
                oDao = (MetaDaoInterface) new GuiaSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "historia":
                oDao = (MetaDaoInterface) new HistoriaSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "juego":
                oDao = (MetaDaoInterface) new JuegoSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "noticia":
                oDao = (MetaDaoInterface) new NoticiaSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "personaje":
                oDao = (MetaDaoInterface) new PersonajeSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "plataforma":
                oDao = (MetaDaoInterface) new PlataformaSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "plataformajuego":
                oDao = (MetaDaoInterface) new PlataformajuegoSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            
            default:
                //oReplyBean = new ReplyBean(500, "Object not found : Please contact your administrator");
                break;
        }
        return oDao;
    }

}
