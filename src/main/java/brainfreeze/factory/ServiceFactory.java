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

import brainfreeze.bean.helper.ReplyBeanHelper;
import brainfreeze.helper.EncodingHelper;
import brainfreeze.service.specificimplementation.ClaseSpecificServiceImplementation;
import brainfreeze.service.specificimplementation.ComentarioguiaSpecificServiceImplementation;
import brainfreeze.service.specificimplementation.ComentarionoticiaSpecificServiceImplementation;
import brainfreeze.service.specificimplementation.GenerojuegoSpecificServiceImplementation;
import brainfreeze.service.specificimplementation.GuiaSpecificServiceImplementation;
import brainfreeze.service.specificimplementation.HistoriaSpecificServiceImplementation;
import brainfreeze.service.specificimplementation.JuegoSpecificServiceImplementation;
import brainfreeze.service.specificimplementation.NoticiaSpecificServiceImplementation;
import brainfreeze.service.specificimplementation.PersonajeSpecificServiceImplementation;
import brainfreeze.service.specificimplementation.PlataformaSpecificServiceImplementation;
import brainfreeze.service.specificimplementation.PlataformajuegoSpecificServiceImplementation;
import brainfreeze.service.specificimplementation.TipousuarioSpecificServiceImplementation;
import brainfreeze.service.specificimplementation.UsuarioSpecificServiceImplementation;
import javax.servlet.http.HttpServletRequest;

public class ServiceFactory {

    public static ReplyBeanHelper executeMethodService(HttpServletRequest oRequest) throws Exception {
        String ob = oRequest.getParameter("ob");
        String op = oRequest.getParameter("op");
        ReplyBeanHelper oReplyBean = null;
        switch (ob) {
            case "usuario":
                UsuarioSpecificServiceImplementation oUsuarioService = new UsuarioSpecificServiceImplementation(oRequest);
                switch (op) {

                    case "getallobjectsmetadata":
                        oReplyBean = oUsuarioService.getallobjectsmetadata();
                        break;
                    case "getmetadata":
                        oReplyBean = oUsuarioService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oUsuarioService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oUsuarioService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oUsuarioService.get();
                        break;
                    case "set":
                        oReplyBean = oUsuarioService.set();
                        break;
                    case "remove":
                        oReplyBean = oUsuarioService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oUsuarioService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oUsuarioService.getCount();
                        break;
                    case "login":
                        oReplyBean = oUsuarioService.login();
                        break;
                    case "logout":
                        oReplyBean = oUsuarioService.logout();
                        break;
                    case "getsessionstatus":
                        oReplyBean = oUsuarioService.getSessionStatus();
                        break;
                    case "getcountx":
                        oReplyBean = oUsuarioService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oUsuarioService.getPageX();
                        break;
                    case "setpass":
                        oReplyBean = oUsuarioService.setPass();
                        break;
                    case "getsessionuserlevel":
                        oReplyBean = oUsuarioService.getSessionUserLevel();
                        break;
                    case "checklogin":
                        oReplyBean = oUsuarioService.checklogin();
                        break;

                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "tipousuario":
                TipousuarioSpecificServiceImplementation oTipousuarioService = new TipousuarioSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oTipousuarioService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oTipousuarioService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oTipousuarioService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oTipousuarioService.get();
                        break;
                    case "set":
                        oReplyBean = oTipousuarioService.set();
                        break;
                    case "remove":
                        oReplyBean = oTipousuarioService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oTipousuarioService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oTipousuarioService.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oTipousuarioService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oTipousuarioService.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "clase":
                ClaseSpecificServiceImplementation oClase = new ClaseSpecificServiceImplementation(oRequest);
                switch (op) {

                    case "getmetadata":
                        oReplyBean = oClase.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oClase.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oClase.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oClase.get();
                        break;
                    case "set":
                        oReplyBean = oClase.set();
                        break;
                    case "remove":
                        oReplyBean = oClase.remove();
                        break;
                    case "getpage":
                        oReplyBean = oClase.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oClase.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oClase.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oClase.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "comentarioguia":
                ComentarioguiaSpecificServiceImplementation oComentarioGuia = new ComentarioguiaSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oComentarioGuia.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oComentarioGuia.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oComentarioGuia.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oComentarioGuia.get();
                        break;
                    case "set":
                        oReplyBean = oComentarioGuia.set();
                        break;
                    case "remove":
                        oReplyBean = oComentarioGuia.remove();
                        break;
                    case "getpage":
                        oReplyBean = oComentarioGuia.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oComentarioGuia.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oComentarioGuia.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oComentarioGuia.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "comentarionoticia":
                ComentarionoticiaSpecificServiceImplementation oComentarioNoticia = new ComentarionoticiaSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oComentarioNoticia.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oComentarioNoticia.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oComentarioNoticia.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oComentarioNoticia.get();
                        break;
                    case "set":
                        oReplyBean = oComentarioNoticia.set();
                        break;
                    case "remove":
                        oReplyBean = oComentarioNoticia.remove();
                        break;
                    case "getpage":
                        oReplyBean = oComentarioNoticia.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oComentarioNoticia.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oComentarioNoticia.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oComentarioNoticia.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "generojuego":
                GenerojuegoSpecificServiceImplementation oGeneroJuego = new GenerojuegoSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oGeneroJuego.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oGeneroJuego.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oGeneroJuego.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oGeneroJuego.get();
                        break;
                    case "set":
                        oReplyBean = oGeneroJuego.set();
                        break;
                    case "remove":
                        oReplyBean = oGeneroJuego.remove();
                        break;
                    case "getpage":
                        oReplyBean = oGeneroJuego.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oGeneroJuego.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oGeneroJuego.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oGeneroJuego.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "guia":
                GuiaSpecificServiceImplementation oGuia = new GuiaSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oGuia.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oGuia.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oGuia.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oGuia.get();
                        break;
                    case "set":
                        oReplyBean = oGuia.set();
                        break;
                    case "remove":
                        oReplyBean = oGuia.remove();
                        break;
                    case "getpage":
                        oReplyBean = oGuia.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oGuia.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oGuia.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oGuia.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "historia":
                HistoriaSpecificServiceImplementation oHistoriaService = new HistoriaSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oHistoriaService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oHistoriaService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oHistoriaService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oHistoriaService.get();
                        break;
                    case "set":
                        oReplyBean = oHistoriaService.set();
                        break;
                    case "remove":
                        oReplyBean = oHistoriaService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oHistoriaService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oHistoriaService.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oHistoriaService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oHistoriaService.getPageX();
                        break;

                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "juego":
                JuegoSpecificServiceImplementation oJuegoSpecificService = new JuegoSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oJuegoSpecificService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oJuegoSpecificService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oJuegoSpecificService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oJuegoSpecificService.get();
                        break;
                    case "set":
                        oReplyBean = oJuegoSpecificService.set();
                        break;
                    case "remove":
                        oReplyBean = oJuegoSpecificService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oJuegoSpecificService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oJuegoSpecificService.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oJuegoSpecificService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oJuegoSpecificService.getPageX();
                        break;

                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "noticia":
                NoticiaSpecificServiceImplementation oNoticia = new NoticiaSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oNoticia.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oNoticia.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oNoticia.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oNoticia.get();
                        break;
                    case "set":
                        oReplyBean = oNoticia.set();
                        break;
                    case "remove":
                        oReplyBean = oNoticia.remove();
                        break;
                    case "getpage":
                        oReplyBean = oNoticia.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oNoticia.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oNoticia.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oNoticia.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "personaje":
                PersonajeSpecificServiceImplementation oPersonaje = new PersonajeSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oPersonaje.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oPersonaje.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oPersonaje.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oPersonaje.get();
                        break;
                    case "set":
                        oReplyBean = oPersonaje.set();
                        break;
                    case "remove":
                        oReplyBean = oPersonaje.remove();
                        break;
                    case "getpage":
                        oReplyBean = oPersonaje.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oPersonaje.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oPersonaje.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oPersonaje.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "plataforma":
                PlataformaSpecificServiceImplementation oPlataforma = new PlataformaSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oPlataforma.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oPlataforma.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oPlataforma.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oPlataforma.get();
                        break;
                    case "set":
                        oReplyBean = oPlataforma.set();
                        break;
                    case "remove":
                        oReplyBean = oPlataforma.remove();
                        break;
                    case "getpage":
                        oReplyBean = oPlataforma.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oPlataforma.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oPlataforma.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oPlataforma.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "plataformajuego":
                PlataformajuegoSpecificServiceImplementation oPlataformaJuego = new PlataformajuegoSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oPlataformaJuego.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oPlataformaJuego.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oPlataformaJuego.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oPlataformaJuego.get();
                        break;
                    case "set":
                        oReplyBean = oPlataformaJuego.set();
                        break;
                    case "remove":
                        oReplyBean = oPlataformaJuego.remove();
                        break;
                    case "getpage":
                        oReplyBean = oPlataformaJuego.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oPlataformaJuego.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oPlataformaJuego.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oPlataformaJuego.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;

            default:
                oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Object not found : Please contact your administrator"));
                break;
        }
        return oReplyBean;
    }
}
