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
import brainfreeze.service.specificimplementation.GeneroSpecificServiceImplementation;
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
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "clase":
                ClaseSpecificServiceImplementation oGrupoService = new ClaseSpecificServiceImplementation(oRequest);
                switch (op) {
                    
                    case "getmetadata":
                        oReplyBean = oGrupoService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oGrupoService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oGrupoService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oGrupoService.get();
                        break;
                    case "set":
                        oReplyBean = oGrupoService.set();
                        break;
                    case "remove":
                        oReplyBean = oGrupoService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oGrupoService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oGrupoService.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oGrupoService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oGrupoService.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "comentarioguia":
                ComentarioguiaSpecificServiceImplementation oCursoService = new ComentarioguiaSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oCursoService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oCursoService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oCursoService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oCursoService.get();
                        break;
                    case "set":
                        oReplyBean = oCursoService.set();
                        break;
                    case "remove":
                        oReplyBean = oCursoService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oCursoService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oCursoService.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oCursoService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oCursoService.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "comentarionoticia":
                ComentarionoticiaSpecificServiceImplementation oCentrosanitarioService = new ComentarionoticiaSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oCentrosanitarioService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oCentrosanitarioService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oCentrosanitarioService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oCentrosanitarioService.get();
                        break;
                    case "set":
                        oReplyBean = oCentrosanitarioService.set();
                        break;
                    case "remove":
                        oReplyBean = oCentrosanitarioService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oCentrosanitarioService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oCentrosanitarioService.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oCentrosanitarioService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oCentrosanitarioService.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "genero":
                GeneroSpecificServiceImplementation oCentroService = new GeneroSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oCentroService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oCentroService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oCentroService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oCentroService.get();
                        break;
                    case "set":
                        oReplyBean = oCentroService.set();
                        break;
                    case "remove":
                        oReplyBean = oCentroService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oCentroService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oCentroService.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oCentroService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oCentroService.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "generojuego":
                GenerojuegoSpecificServiceImplementation oEspecialidadService = new GenerojuegoSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oEspecialidadService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oEspecialidadService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oEspecialidadService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oEspecialidadService.get();
                        break;
                    case "set":
                        oReplyBean = oEspecialidadService.set();
                        break;
                    case "remove":
                        oReplyBean = oEspecialidadService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oEspecialidadService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oEspecialidadService.getCount();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "guia":
                GuiaSpecificServiceImplementation oDestinoaltaService = new GuiaSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oDestinoaltaService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oDestinoaltaService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oDestinoaltaService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oDestinoaltaService.get();
                        break;
                    case "set":
                        oReplyBean = oDestinoaltaService.set();
                        break;
                    case "remove":
                        oReplyBean = oDestinoaltaService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oDestinoaltaService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oDestinoaltaService.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oDestinoaltaService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oDestinoaltaService.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "historia":
                HistoriaSpecificServiceImplementation oTipopagoService = new HistoriaSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oTipopagoService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oTipopagoService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oTipopagoService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oTipopagoService.get();
                        break;
                    case "set":
                        oReplyBean = oTipopagoService.set();
                        break;
                    case "remove":
                        oReplyBean = oTipopagoService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oTipopagoService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oTipopagoService.getCount();
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
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "noticia":
                NoticiaSpecificServiceImplementation oSexoService = new NoticiaSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oSexoService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oSexoService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oSexoService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oSexoService.get();
                        break;
                    case "set":
                        oReplyBean = oSexoService.set();
                        break;
                    case "remove":
                        oReplyBean = oSexoService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oSexoService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oSexoService.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oSexoService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oSexoService.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "personaje":
                PersonajeSpecificServiceImplementation oTipoepisodioService = new PersonajeSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oTipoepisodioService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oTipoepisodioService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oTipoepisodioService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oTipoepisodioService.get();
                        break;
                    case "set":
                        oReplyBean = oTipoepisodioService.set();
                        break;
                    case "remove":
                        oReplyBean = oTipoepisodioService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oTipoepisodioService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oTipoepisodioService.getCount();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "plataforma":
                PlataformaSpecificServiceImplementation oTiposervicioService = new PlataformaSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oTiposervicioService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oTiposervicioService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oTiposervicioService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oTiposervicioService.get();
                        break;
                    case "set":
                        oReplyBean = oTiposervicioService.set();
                        break;
                    case "remove":
                        oReplyBean = oTiposervicioService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oTiposervicioService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oTiposervicioService.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oTiposervicioService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oTiposervicioService.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "plataformajuego":
                PlataformajuegoSpecificServiceImplementation oModalidadepisodioService = new PlataformajuegoSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oModalidadepisodioService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oModalidadepisodioService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oModalidadepisodioService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oModalidadepisodioService.get();
                        break;
                    case "set":
                        oReplyBean = oModalidadepisodioService.set();
                        break;
                    case "remove":
                        oReplyBean = oModalidadepisodioService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oModalidadepisodioService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oModalidadepisodioService.getCount();
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
